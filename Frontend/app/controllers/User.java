package controllers;

import ch.qos.logback.core.net.SyslogOutputStream;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.node.ObjectNode;
import play.libs.Json;
import play.libs.ws.WSClient;
import play.libs.ws.WSRequest;
import play.libs.ws.WSResponse;
import scala.Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.sql.SQLOutput;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.CompletionStage;


public class User {

    private String username;
    private String password;
    private String secQuestion1;
    private String secQuestion2;
    private String secAnswer1;
    private String secAnswer2;
    private String firstname;
    private String lastname;
    private String title;
    private String research;
    private String position;
    private String affiliation;
    private String email;
    private String phone;
    private String fax;
    private String address;
    private String city;
    private String country;
    private String zipCode;
    private String comments;
    private String status;
    private String degreeplan;
    private String startingseason;
    private String startingyear;
    private String gradseason;
    private String gradyear;
    private String previouscourses;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getResearch() {
        return research;
    }

    public void setResearch(String research) {
        this.research = research;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getAffiliation() {
        return affiliation;
    }

    public void setAffiliation(String affiliation) {
        this.affiliation = affiliation;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getFax() {
        return fax;
    }

    public void setFax(String fax) {
        this.fax = fax;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

    public String getSecQuestion1() {
        return secQuestion1;
    }

    public void setSecQuestion1(String secQuestion1) {
        this.secQuestion1 = secQuestion1;
    }

    public String getSecQuestion2() {
        return secQuestion2;
    }

    public void setSecQuestion2(String secQuestion2) {
        this.secQuestion2 = secQuestion2;
    }

    public String getSecAnswer1() {
        return secAnswer1;
    }

    public void setSecAnswer1(String secAnswer1) {
        this.secAnswer1 = secAnswer1;
    }

    public String getSecAnswer2() {
        return secAnswer2;
    }

    public void setSecAnswer2(String secAnswer2) {
        this.secAnswer2 = secAnswer2;
    }

    public String getDegreeplan() {
        return degreeplan;
    }

    public void setDegreeplan(String degreeplan) {
        this.degreeplan = degreeplan;
    }

    public String getStartingseason() {
        return startingseason;
    }

    public void setStartingseason(String startingseason) {
        this.startingseason = startingseason;
    }

    public String getStartingyear() {
        return startingyear;
    }

    public void setStartingyear(String startingyear) {
        this.startingyear = startingyear;
    }

    public String getGradseason() {
        return gradseason;
    }

    public void setGradseason(String gradseason) {
        this.gradseason = gradseason;
    }

    public String getGradyear() {
        return gradyear;
    }

    public void setGradyear(String gradyear) {
        this.gradyear = gradyear;
    }


    public String getPreviouscourses() {
        return previouscourses;
    }

    public void setPreviouscourses(String previouscourses) {
        this.previouscourses = previouscourses;
    }

    public CompletionStage<WSResponse> checkAuthorized() {

        WSClient ws = play.test.WSTestClient.newClient(9005);
        //add username password
        WSRequest request = ws.url("http://localhost:9005/login");
        ObjectNode res = Json.newObject();
        res.put("username", this.username);
        res.put("password", this.password);
        return request.addHeader("Content-Type", "application/json")
                .post(res)
                .thenApply((WSResponse r) -> {
                    return r;
                });
    }


    public CompletionStage<WSResponse> registerUser() {

        WSClient ws = play.test.WSTestClient.newClient(9005);
        // send this. user
        ObjectNode res = Json.newObject();
        res.put("username", this.username);
        res.put("password", this.password);
        res.put("status", this.status);
        res.put("degreeplan", this.degreeplan);
        res.put("startingseason", this.startingseason);
        res.put("startingyear", this.startingyear);
        res.put("gradseason", this.gradseason);
        res.put("gradyear", this.gradyear);
        res.put("previouscourses", this.previouscourses);
        res.put("secQuestion1", this.secQuestion1);
        res.put("secQuestion2", this.secQuestion2);
        res.put("secAnswer1", this.secAnswer1);
        res.put("secAnswer1", this.secAnswer2);
        res.put("firstname", this.firstname);
        res.put("lastname", this.lastname);
        res.put("title", this.title);
        res.put("research", this.research);
        res.put("position", this.position);
        res.put("affiliation", this.affiliation);
        res.put("email", this.email);
        res.put("phone", this.phone);
        res.put("fax", this.fax);
        res.put("address", this.address);
        res.put("city", this.city);
        res.put("country", this.country);
        res.put("zipCode", this.zipCode);
        res.put("comments", this.comments);
//        String[] selectedCoursesArray = request().body().asFormUrlEncoded().get("previouscourses");
//        if(selectedCoursesArray != null) selectedCourses.addAll(Arrays.asList(selectedCoursesArray));

        System.out.println(username);
        System.out.println(password);
        System.out.println(status);
        System.out.println(degreeplan);
        System.out.println(startingseason);
        System.out.println(startingyear);
        System.out.println(gradseason);
        System.out.println(gradyear);
        System.out.println(previouscourses);
        System.out.println(secQuestion1);
        System.out.println(secQuestion2);
        System.out.println(secAnswer1);
        System.out.println(secAnswer2);
        System.out.println(firstname);
        System.out.println(lastname);
        System.out.println(title);
        System.out.println(research);
        System.out.println(position);
        System.out.println(affiliation);
        System.out.println(email);
        System.out.println(phone);
        System.out.println(fax);
        System.out.println(address);
        System.out.println(city);
        System.out.println(country);
        System.out.println(zipCode);
        System.out.println(comments);

        System.out.println();


        WSRequest request = ws.url("http://localhost:9005/signup");
        return request.addHeader("Content-Type", "application/json")
                .post(res)
                .thenApply((WSResponse r) -> {
                    return r;
                });
    }

    //changes values to one form backend
    public void deserialize(JsonNode a) {
        this.username = a.get("username").toString();
        this.password = a.get("password").toString();
        this.firstname = a.get("firstname").toString();
        this.lastname = a.get("lastname").toString();
        this.email = a.get("email").toString();
        this.status = a.get("status").toString();
        this.address = a.get("address").toString();
        this.degreeplan = a.get("degreeplan").toString();
        this.startingseason = a.get("startingseason").toString();
        this.startingyear = a.get("startingyear").toString();
        this.gradseason = a.get("gradseason").toString();
        this.gradyear = a.get("gradyear").toString();
//        this.previouscourses = a.get("previouscourses").toString();
//        this.secQuestion1 = a.get("sec_queston1").toString();
//        this.secAnswer1 = a.get("sec_answer1").toString();
//        this.secQuestion2 = a.get("sec_queston2").toString();
//        this.secAnswer2 = a.get("sec_answer2").toString();
//        this.title = a.get("title").toString();
//        this.research = a.get("research").toString();
//        this.position = a.get("position").toString();
//        this.affiliation = a.get("affiliation").toString();
        this.phone = a.get("phone").toString();
//        this.fax = a.get("fax").toString();
//        this.address = a.get("address").toString();
//        this.city = a.get("city").toString();
//        this.country = a.get("country").toString();
//        this.zipCode = a.get("zip_code").toString();
//        this.comments = a.get("comments").toString();

//TODO put all fields to populate
//
//        System.out.println(username);//
//        System.out.println(password);//
//        System.out.println(status);//
//        System.out.println(degreeplan);//
//        System.out.println(startingseason);//
//        System.out.println(startingyear);//
//        System.out.println(gradseason);//
//        System.out.println(gradyear);//
//        System.out.println(previouscourses);//
//        System.out.println(secQuestion1);//
//        System.out.println(secQuestion2);//
//        System.out.println(secAnswer1);//
//        System.out.println(secAnswer2);//
//        System.out.println(firstname);//
//        System.out.println(lastname);//
//        System.out.println(title);//
//        System.out.println(research);//
//        System.out.println(position);//
//        System.out.println(affiliation);//
//        System.out.println(email);//
//        System.out.println(phone);//
//        System.out.println(fax);//
//        System.out.println(address);//
//        System.out.println(city);//
//        System.out.println(country);//
//        System.out.println(zipCode);//
//        System.out.println(comments);//

    }

//---------------------------------------------------------


//    public CompletionStage<WSResponse> submitForm() {
//
//        WSClient ws = play.test.WSTestClient.newClient(9005);
//        // send this. user
//        ObjectNode res = Json.newObject();
//        res.put("username", this.username);
//        res.put("preference1", this.password);
//        res.put("preference1all", this.password);
//        res.put("preference2", this.status);
//        res.put("preference3", this.degreeplan);
//        res.put("notpreferred", this.startingseason);
//
//
//
//        WSRequest request = ws.url("http://localhost:9005/application");
//        return request.addHeader("Content-Type", "application/json")
//                .post(res)
//                .thenApply((WSResponse r) -> {
//                    return r;
//                });
//    }
}