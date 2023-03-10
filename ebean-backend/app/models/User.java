package models;

import com.avaje.ebean.ExpressionList;
import com.avaje.ebean.Model;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.node.ArrayNode;
import play.data.validation.Constraints;
import play.libs.Json;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.List;
import java.util.ArrayList;

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
    public String status;
    @Constraints.Required
    public String degreeplan;
    @Constraints.Required
    public String startingseason;
    @Constraints.Required
    public String startingyear;
    @Constraints.Required
    public String gradseason;
    @Constraints.Required
    public String gradyear;
    @Constraints.Required
    public String previouscourses;
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

//    public JsonNode toJson(){
//
//        JsonNode node = Json.toJson(this);
//        return node;
//    }
    public static Find<Long, User> find = new Find<Long, User>(){};

    public static User findByName(String name) {
        return User.find
                .where()
                .eq("username", name)
                .findUnique();
    }

    public void setPassword(String password)
    {
        this.password = password;
    }



}
