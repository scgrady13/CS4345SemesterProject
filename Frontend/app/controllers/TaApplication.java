package controllers;


import com.fasterxml.jackson.databind.node.ObjectNode;
import play.data.validation.Constraints;
import play.data.Form;
import play.data.FormFactory;
import play.libs.Json;
import play.libs.ws.WSClient;
import play.libs.ws.WSRequest;
import play.mvc.Controller;
import play.mvc.Result;
import play.libs.concurrent.HttpExecutionContext;
import play.libs.ws.WSResponse;
import views.html.*;

import javax.validation.Constraint;
import java.util.concurrent.CompletionStage;


public class TaApplication {

    @Constraints.Required
    public String previousCourses;

    @Constraints.Required
    public String preference;
    @Constraints.Required
    public String preference1all;
    @Constraints.Required
    public String preference2;
    @Constraints.Required
    public String preference3;
    @Constraints.Required
    public String notpreferred;
    public CompletionStage<WSResponse> submitForm(User user) {

        WSClient ws = play.test.WSTestClient.newClient(9005);
        // send this. user
        ObjectNode res = Json.newObject();
        res.put("username", user.getUsername());
        res.put("preference1", this.preference);
        res.put("preference1all", this.preference1all);
        res.put("preference2", this.preference2);
        res.put("preference3", this.preference3);
        res.put("notpreferred", this.notpreferred);



        WSRequest request = ws.url("http://localhost:9005/application");
        return request.addHeader("Content-Type", "application/json")
                .post(res)
                .thenApply((WSResponse r) -> {
                    return r;
                });
    }
}


