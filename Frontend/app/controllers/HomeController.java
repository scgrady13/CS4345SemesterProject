package controllers;

import play.data.Form;
import play.data.FormFactory;
import play.mvc.Controller;
import play.mvc.Result;
import play.libs.concurrent.HttpExecutionContext;
import play.libs.ws.WSResponse;
import views.html.*;

import javax.inject.Inject;
import java.util.concurrent.CompletionStage;

/**
 * Software Service Market Place
 */
public class HomeController extends Controller {

    @Inject
    HttpExecutionContext ec;

    private FormFactory formFactory;

    @Inject
    public HomeController(FormFactory formFactory) {
        this.formFactory = formFactory;
    }

    /**
     * Index page
     */
    public Result index() {
        return ok(views.html.login.render(""));
    }

    /**
     * Index page
     */
    public Result signup() {
        return ok(views.html.register.render(null));
    }
    public Result passwordReset(){
        return ok(views.html.resetpassword.render(null));
    }

    public CompletionStage<Result> passwordResetHandler()
    {
        Form<User> passwordResetForm = formFactory.form(User.class).bindFromRequest();
        if(passwordResetForm.hasErrors())
        {
            return(CompletionStage<Result>)badRequest(views.html.resetpassword.render("Form Error"));
        }
        return passwordResetForm.get().checkAuthorized()
                .thenApplyAsync((WSResponse r) -> {
                    System.out.println("Status Code: " + r.getStatus());

                    if(r.getStatus() == 200 && r.asJson() != null )//&& r.asJson().asBoolean())
                    {
                        System.out.println(r.asJson());
                        String newPass = PasswordResetController.generatePassword();
                        System.out.println("Password Generated: " + newPass);
                        session("email", passwordResetForm.get().getEmail()); // store username in session
                        return ok(views.html.index.render("Temp Reset page! Password reset tool sent to " + passwordResetForm.get().getEmail()));
                    }
                    else {
                        System.out.println("response null");
                        String authorizeMessage = "Account Not Found";
                        return badRequest(views.html.resetpassword.render(authorizeMessage));
                    }
                }, ec.current());
    }

    public CompletionStage<Result> loginHandler() {

        Form<User> loginForm = formFactory.form(User.class).bindFromRequest();
        if (loginForm.hasErrors()){
            return (CompletionStage<Result>) badRequest(views.html.login.render(""));  // send parameter like register so that user could know
        }

        return loginForm.get().checkAuthorized()
                .thenApplyAsync((WSResponse r) -> {
                    if (r.getStatus() == 200 && r.asJson() != null && r.asJson().asBoolean()) {
                        System.out.println(r.asJson());
                        // add username to session
                        session("username",loginForm.get().getUsername());   // store username in session for your project
                        // redirect to index page, to display all categories
                        return ok(views.html.index.render("Hello " + loginForm.get().getUsername()));
                    } else {
                        System.out.println("response null");
                        String authorizeMessage = "Incorrect Username or Password ";
                        return badRequest(views.html.login.render(authorizeMessage));
                    }
                }, ec.current());
    }

    public CompletionStage<Result> signupHandler() {

        Form<User> registrationForm = formFactory.form(User.class).bindFromRequest();
        if (registrationForm.hasErrors()){
            return (CompletionStage<Result>) badRequest(views.html.register.render(null));
        }
        return registrationForm.get().registerUser()
                .thenApplyAsync((WSResponse r) -> {
                    if (r.getStatus() == 200 && r.asJson() != null) {
                        System.out.println("success");
                        System.out.println(r.asJson());
                        return ok(login.render(""));
                    } else {
                        System.out.println("response null");
                        return badRequest(views.html.register.render("Username already exists"));
                    }
                }, ec.current());

    }
}