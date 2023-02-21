package controllers;
import models.User;
import play.Logger;
import play.libs.Json;
import play.mvc.*;
import scala.collection.JavaConverters;
import scala.collection.Seq;

import java.util.List;
import java.util.ArrayList;



/**
 * This controller contains an action to handle HTTP requests
 * to the application's home page.
 */
public class HomeController extends Controller {
    public Result index() {
        return ok(Json.toJson("Welcome to backend!"));
    }
    public Result info(){

        List<User> users = User.find.all();
        List<String> infos = new ArrayList<>();
        for(User user: users){
            infos.add("Username: " + user.username);
            infos.add("Password: " + user.password);
            infos.add("Firstname: " + user.firstname);
        }
        Seq<String> infoSeq = JavaConverters.asScalaBufferConverter(infos).asScala().toSeq();
        Logger.info("infos" + infoSeq);
        return ok(views.html.info.render(infoSeq));
    }
}
