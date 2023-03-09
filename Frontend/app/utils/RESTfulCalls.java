package utils;

import akka.stream.javadsl.Source;
import akka.util.ByteString;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.node.ObjectNode;
import com.typesafe.config.Config;
import play.Logger;
import play.api.Play;
import play.libs.Json;
import play.libs.ws.*;
import play.libs.ws.ahc.*;
import play.mvc.Http;

import java.util.concurrent.TimeUnit;
import java.util.function.*;
import java.time.temporal.ChronoUnit;
import java.util.concurrent.*;
import java.util.concurrent.TimeUnit;
import java.io.File;
import java.io.FileOutputStream;
import java.time.Duration;
import java.time.temporal.ChronoUnit;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.CompletionStage;
import java.util.concurrent.TimeUnit;

public class RESTfulCalls {
    private static final WSClient WS;

    static {
        WS = play.test.WSTestClient.newClient(9005);
        //WS = Play.current().injector().instanceOf(WSClient.class);
    }

    // These are for internal response
    public static enum ResponseType {
        SUCCESS, GETERROR, SAVEERROR, DELETEERROR, RESOLVEERROR, TIMEOUT, CONVERSIONERROR, UNKNOWN
    }

    // These are for responding to users
    public static enum UserResponseType {
        SUCCESS, GENERALERROR
    }


    public static JsonNode getAPI(String apiString) {
        System.out.println(apiString);
        Logger.info(apiString);
        if (WS == null) {
            Logger.info("error");
        }
        try {
            CompletionStage<WSResponse> responsePromise = WS.url(apiString)
                    .setRequestTimeout(Duration.ofSeconds(30000))
                    .get();
            final CompletionStage<JsonNode> bodyPromise = responsePromise.thenApplyAsync(
                    new Function<WSResponse, JsonNode>() {
                        public JsonNode apply(WSResponse response) {
                            if (response.getStatus() == 200
                                    || response.getStatus() == 201) {
                                System.out.println("response value is here"+ response);
                                return response.asJson();
                            } else { // no response from the server
                                Logger.info("" + response.getStatus());
                                return createResponse(ResponseType.GETERROR);
                            }
                        }
                    });

            CompletableFuture<JsonNode> future = bodyPromise.toCompletableFuture();
            return future.get(30000, TimeUnit.SECONDS);
        } catch (Exception e) {
            System.out.println("get API exception: " + e);
            return createResponse(ResponseType.TIMEOUT);
        }
    }


    /**
     * This method aims to create an internal response <key,value> pair in a JsonNode as response from a RESTfulCall,
     * based on the response type passed in.
     * @see public static JsonNode createResponse(String content)
     * @see public static JsonNode createUserResponse(UserResponseType type)
     */
    public static JsonNode createResponse(ResponseType type) {
        ObjectNode jsonData = Json.newObject();
        switch (type) {
            case SUCCESS:
                jsonData.put("success", "Success!");
                break;
            case GETERROR:
                jsonData.put("error", "Cannot get data from server");
                break;
            case SAVEERROR:
                jsonData.put("error", "Cannot be saved. The data must be invalid!");
                break;
            case DELETEERROR:
                jsonData.put("error", "Cannot be deleted on server");
                break;
            case RESOLVEERROR:
                jsonData.put("error", "Cannot be resolved on server");
                break;
            case TIMEOUT:
                jsonData.put("error", "No response/Timeout from server");
                break;
            case CONVERSIONERROR:
                jsonData.put("error", "Conversion error");
                break;
            default:
                jsonData.put("error", "Unknown errors");
                break;
        }
        return jsonData;
    }
    /**
     * This method aims to create a message response <key,value> pair in a JsonNode as response from a RESTfulCall,
     * using the content passed in.
     * @see public static JsonNode createResponse(ResponseType type)
     * @see public static JsonNode createUserResponse(UserResponseType type)
     */
    public static JsonNode createResponse(String content) {
        ObjectNode jsonData = Json.newObject();
        jsonData.put("message", content);
        return jsonData;
    }
}