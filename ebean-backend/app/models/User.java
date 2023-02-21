package models;

import com.avaje.ebean.ExpressionList;
import com.avaje.ebean.Model;
import play.data.validation.Constraints;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.List;

@Entity
public class User extends Model {
    private static final long serialVersionUID = 1L;

    @Id
    public Long id;

    @Constraints.Required
    public String username;

    @Constraints.Required
    public String password;

    @Constraints.Required
    public String secQuestion1;
    @Constraints.Required
    public String secAnswer1;
    @Constraints.Required
    public String secQuestion2;
    @Constraints.Required
    public String secAnswer2;

    @Constraints.Required
    public String research;

    @Constraints.Required
    public String title;

    @Constraints.Required
    public String firstname;
    //Last name
    @Constraints.Required
    public String lastname;
    //Position
    @Constraints.Required
    public String position;
    //Affiliation
    @Constraints.Required
    public String affiliation;
    //Email
    @Constraints.Required
    public String email;
    //Phone
    @Constraints.Required
    public String phone;
    //Fax
    @Constraints.Required
    public String fax;
    //Address (text area)
    @Constraints.Required
    public String address;
    //City
    @Constraints.Required
    public String city;
    //Country/Region
    @Constraints.Required
    public String country;
    //Zip code
    @Constraints.Required
    public String zipCode;
    //Comments
    @Constraints.Required
    public String comments;
    public static Find<Long, User> find = new Find<Long, User>(){};

    public static User findByName(String name) {
        return User.find
                .where()
                .eq("username", name)
                .findUnique();
    }
}
