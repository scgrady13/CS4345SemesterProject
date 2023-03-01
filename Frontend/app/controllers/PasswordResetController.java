package controllers;
import play.core.j.HttpExecutionContext;
import play.data.DynamicForm;
import play.data.FormFactory;
import play.mvc.Controller;
import play.mvc.Result;
import java.util.Random;
import javax.inject.Inject;
import java.util.concurrent.CompletionStage;

public class PasswordResetController extends Controller {

    @Inject
    HttpExecutionContext ec;

    public Result resetPasswordForm() {
        return ok(views.html.resetpassword.render(""));
    }
    private FormFactory formFactory;

//    public Result securityCheck()
//    {
//
//    }

//    public Result resetPassword() {
//        DynamicForm requestData = formFactory.form().bindFromRequest();
//        String email = requestData.get("email");
//        String answer1 = requestData.get("secAnswer1");
//        String answer2 = requestData.get("secAnswer2");
//
//        User user = User.find.where().eq("email", email).findUnique();
//        if (user != null && user.getSecAnswer1().equals(answer1) && user.getSecAnswer2().equals(answer2)) {
//            // User email and security answer match
//            // Generate a new password and update user
//            String newPassword = generatePassword();
//            user.setPassword(Hash.sha1(newPassword));
//            user.save();
//
//            // Send password reset email to user
//           // sendPasswordResetEmail(user, newPassword);
//
//            return ok(views.html.password_reset_confirmation.render());
//        } else {
//            // User email or security answer does not match
//            flash("error", "Invalid email or answer");
//            return redirect(routes.PasswordResetController.resetPasswordForm());
//        }
//    }

    public static String generatePassword() {
        // Generate a random password of length 8
        String chars = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890!@#$%^&*";
        Random rand = new Random();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 8; i++) {
            sb.append(chars.charAt(rand.nextInt(chars.length())));
        }
        return sb.toString();
    }

//    private void sendPasswordResetEmail(User user, String newPassword) {
//        // Send a password reset email to user's email address with the new password
//        String subject = "Password reset for your account";
//        String body = "Your password has been reset. Your new password is: " + newPassword;
//        Email email = new SimpleEmail();
//        email.setSubject(subject);
//        email.setMsg(body);
//        email.addTo(user.getEmail());
//        try {
//            MailerPlugin.send(email);
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//    }
}