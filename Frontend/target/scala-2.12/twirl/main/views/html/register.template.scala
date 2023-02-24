
package views.html

import _root_.play.twirl.api.TwirlFeatureImports._
import _root_.play.twirl.api.TwirlHelperImports._
import _root_.play.twirl.api.Html
import _root_.play.twirl.api.JavaScript
import _root_.play.twirl.api.Txt
import _root_.play.twirl.api.Xml
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import java.lang._
import java.util._
import scala.collection.JavaConverters._
import play.core.j.PlayMagicForJava._
import play.mvc._
import play.api.data.Field
import play.mvc.Http.Context.Implicit._
import play.data._
import play.core.j.PlayFormsMagicForJava._

object register extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(authorizeMessage: String):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*2.1*/("""<!DOCTYPE html>
<html>
    <head>
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

        <title>CS Department TA Management System</title>
        <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/materialize/1.0.0/css/materialize.min.css">

            <!-- Compiled and minified JavaScript -->
        <script src="https://cdnjs.cloudflare.com/ajax/libs/materialize/1.0.0/js/materialize.min.js"></script>
        <link rel="shortcut icon" type="image/x-icon" href="docs/images/favicon.ico" />
        <link rel="stylesheet" href="https://unpkg.com/leaflet@1.5.1/dist/leaflet.css" integrity="sha512-xwE/Az9zrjBIphAcBb3F6JVqxf46+CDLwfLMHloNu6KEQCAWi6HcDUbeOfBIptF7tcCzusKFjFw2yuvEpDL9wQ==" crossorigin=""/>
        <script src="https://unpkg.com/leaflet@1.5.1/dist/leaflet.js" integrity="sha512-GffPMF3RvMeYyc1LWMHtK8EbPv0iNZ8/oTtHPx9/cc2ILxQ+u905qIwdpULaqDkyBKgOaB57QTMg7ztg8Jm2Og==" crossorigin=""></script>
        <style>
                header.topbar """),format.raw/*18.31*/("""{"""),format.raw/*18.32*/("""
                    """),format.raw/*19.21*/("""background-color: #4a4e4d;
                    padding: 10px;
                    color: #fff;
                """),format.raw/*22.17*/("""}"""),format.raw/*22.18*/("""
                """),format.raw/*23.17*/("""button.btn """),format.raw/*23.28*/("""{"""),format.raw/*23.29*/("""
                    """),format.raw/*24.21*/("""background-color: #4a4e4d;
                    border: none;
                """),format.raw/*26.17*/("""}"""),format.raw/*26.18*/("""
                """),format.raw/*27.17*/("""button.btn:hover """),format.raw/*27.34*/("""{"""),format.raw/*27.35*/("""
                    """),format.raw/*28.21*/("""background-color: #3F51B5;
                """),format.raw/*29.17*/("""}"""),format.raw/*29.18*/("""
        """),format.raw/*30.9*/("""</style>


    </head>
    <body>
        <header class="topbar">
            <h5 class="focused">
                <center>Register New User</center>
            </h5>
        </header>
        <div class="row">
            <div class="card col s8 offset-s2">
                <div class="card-panel">
                    <form action=""""),_display_(/*43.36*/routes/*43.42*/.HomeController.signupHandler()),format.raw/*43.73*/("""" method="GET">
                        <center><strong>Login Info</strong></center><br>
                        <div class="row">
                            <div class="input-field col s12">
                                <input id="username" name="username" type="text" class="validate">
                                <label for="username">Username</label>
                            </div>
                        </div>
                        <div class="row">
                            <div class="input-field col s12">
                                <input id="password" name="password" type="password" class="validate">
                                <label for="password">Password</label>
                            </div>
                        </div>
                        <br>
                        <center><strong>Status</strong></center>
                        <div class="row">
                            <div class="form-select-button">
                                <select name="status" style="display:block" class="selection-handle" id="status" class="validate" placeholder="Select Status" onchange="updateOptions()">
                                    <option value="" disabled selected>Select Status</option>
                                    <option value="student">Student</option>
                                    <option value="faculty">Faculty</option>
                                    <option value="staff">Staff</option>
                                </select>
                            </div>
                        </div>
                        <div id="student-options" style="display: none">
                            <div class="row">
                                <label for="degreeplan">Current Degree Plan:</label>
                                <select style="display:block" name="degreeplan" id="degreeplan" class="selection-handle">
                                    <option value="" disabled selected>Select degree plan</option>
                                    <option value="Ph.D.">Ph.D.</option>
                                    <option value="D.E.-SE">D.E.-SE</option>
                                    <option value="MS-CS">MS-CS</option>
                                    <option value="MS-SE">MS-SE</option>
                                    <option value="MS-Cybersecurity">MS-Cybersecurity</option>
                                    <option value="BS-CS">BS-CS</option>
                                    <option value="BA-CS">BA-CS</option>
                                </select>
                            </div>
                            <div class="container mx-auto">
                            <div class="row">
                                <div class="col">
                                    <center><strong>Starting Semester</strong></center>
                                    <div class="row">
                                        <div class="col">
                                            <label for="startingseason">Season:</label>
                                            <select style="display:block" name="startingseason" id="startingseason">
                                                <option value="Spring">Spring</option>
                                                <option value="Fall">Fall</option>
                                            </select>
                                        </div>
                                        <div class="col">
                                            <label for="startingyear">Year:</label>
                                            <select style="display:block" name="startingyear" id="startingyear">
                                                <option value="2020">2020</option>
                                                <option value="2021">2021</option>
                                                <option value="2022">2022</option>
                                                <option value="2023">2023</option>
                                                <option value="2024">2024</option>
                                            </select>
                                        </div>
                                    </div>
                                </div>
                                <div class="col">
                                    <center><strong>Graduating Semester</strong></center>
                                    <div class="row">
                                        <div class="col">
                                            <label for="gradseason">Season:</label>
                                            <select style="display:block" name="gradseason" id="gradseason">
                                                <option value="Spring">Spring</option>
                                                <option value="Fall">Fall</option>
                                            </select>
                                        </div>
                                        <div class="col">
                                            <label for="gradyear">Year:</label>
                                            <select style="display:block" name="gradyear" id="gradyear">
                                                <option value="2020">2020</option>
                                                <option value="2021">2021</option>
                                                <option value="2022">2022</option>
                                                <option value="2023">2023</option>
                                                <option value="2024">2024</option>
                                            </select>
                                        </div>
                                    </div>
                                </div>
                            </div>
                            </div>

                            <div class="row">
                                    <label for="previouscourses">Courses taken before:</label>
                                    <div class="select-checkboxes">
                                    <select style="display:block; height: 200px;" name="previouscourses" id="previouscourses" multiple class="selection-handle">
                                    <option value="CS1340">CS 1340 - Introduction to Computer Science</option>
                                    <option value="CS1341">CS 1341 - Principles of Computer Science</option>
                                    <option value="CS1342">CS 1342 - Programming Concepts</option>
                                    <option value="CS2240">CS 2240 - Assembly Language Programming and Machine Organization</option>
                                    <option value="CS2341">CS 2341 - Data Structures</option>
                                    <option value="CS3330">CS 3330 - Database Concepts</option>
                                    <option value="CS3339">CS 3339 - Information Assurance and Security</option>
                                    <option value="CS3342">CS 3342 - Programming Languages</option>
                                    <option value="CS3345">CS 3345 - Graphical User Interface Design and Implementation</option>
                                    <option value="CS3353">CS 3353 - Fundamentals of Algorithms</option>
                                    <option value="CS3381">CS 3381 - Digital Logic Design</option>
                                    <option value="CS4344">CS 4344 - Computer Networks and Distributed Systems</option>
                                    <option value="CS4345">CS 4345 - Software Engineering Principles</option>
                                    <option value="CS4351">CS 4351 - Senior Design I</option>
                                    <option value="CS4352">CS 4352 - Senior Design II</option>
                                    <option value="CS4381">CS 4381 - Digital Computer Design</option>
                                    <option value="CS5343">CS 5343 - Operating Systems and Systems Software</option>
                                    </select>
                                </div>
                            </div>
                        </div>
                        <script>
                                function updateOptions() """),format.raw/*158.58*/("""{"""),format.raw/*158.59*/("""
                                    """),format.raw/*159.37*/("""var status = document.getElementById("status").value;
                                    if (status === "student") """),format.raw/*160.63*/("""{"""),format.raw/*160.64*/("""
                                        """),format.raw/*161.41*/("""document.getElementById("student-options").style.display = "block";
                                    """),format.raw/*162.37*/("""}"""),format.raw/*162.38*/(""" """),format.raw/*162.39*/("""else """),format.raw/*162.44*/("""{"""),format.raw/*162.45*/("""
                                        """),format.raw/*163.41*/("""document.getElementById("student-options").style.display = "none";
                                    """),format.raw/*164.37*/("""}"""),format.raw/*164.38*/("""
                                """),format.raw/*165.33*/("""}"""),format.raw/*165.34*/("""
                        """),format.raw/*166.25*/("""</script>
                        <br>
                        <center><strong>Security Questions</strong></center><br>
                        <div class="row">
                            <div class="form-group">
                                <select name="secQuestion1" style="display:block" class="selection-handle"  id="secQuestion2" class="validate" placeholder="Select Security Question">
                                    <option value="" disabled selected>Select Security Question</option>
                                    <option value="petname">What was your first petname</option>
                                    <option value="hometown">What is your hometown</option>
                                    <option value="school">What was your elementary school name</option>
                                </select>
                            </div>
                        </div>
                        <div class="row">
                            <div class="input-field col s12">
                                <input id="secAnswer1" name="secAnswer1" type= "text" class="validate" placeholder="Answer Question">
                            </div>
                        </div>
                        <div class="row">
                            <div class="form-select-button">
                                    <select name="secQuestion2" style="display:block" class="selection-handle" id="secQuestion2" class="validate" placeholder="Select Security Question">
                                        <option value = "" disabled selected>Select Security Question</option>
                                        <option value="petname">What was your first petname</option>
                                        <option value="hometown">What is your hometown</option>
                                        <option value="school">What was your elementary school name</option>
                                    </select>
                            </div>
                        </div>
                        <div class="row">
                            <div class="input-field col s12">
                                <input id="secAnswer2" name="secAnswer2" type= "text" class="validate" placeholder="Answer Question">
                            </div>
                        </div>

                        <center><strong>Personal Information</strong></center><br>
                        <div class="container mx-auto">
                            <div class="row">
                                <div class="col">
                                    <div class="input-field col">
                                        <select style="display:block" name="title" id="title" class="validate">
                                            <option disabled selected>Choose Title</option>
                                            <option value="Mr">Mr</option>
                                            <option value="Ms">Ms</option>
                                            <option value="Dr">Dr</option>
                                        </select>
                                    </div>
                                </div>
                                <div class="col">
                                    <div class="input-field">
                                        <input id="firstname" name="firstname" type="text" class="validate">
                                        <label for="firstname">First Name</label>
                                    </div>
                                </div>
                                <div class="col">
                                    <div class="input-field">
                                        <input id="lastname" name="lastname" type="text" class="validate">
                                        <label for="lastname">Last Name</label>
                                    </div>
                                </div>
                            </div>
                        </div>
                        <div class="row">
                            <div class="input-field col s12">
                                <input id="research" name="research" type="text" class="validate">
                                <label for="research">Research Areas</label>
                            </div>
                        </div>
"""),format.raw/*233.37*/("""
                        """),format.raw/*234.25*/("""<div class="row">
                            <div class="input-field col s12">
                                <input id="position" name="position" type="text" class="validate">
                                <label for="position">Position</label>
                            </div>
                        </div>
"""),format.raw/*240.40*/("""
                        """),format.raw/*241.25*/("""<div class="row">
                            <div class="input-field col s12">
                                <input id="affiliation" name="affiliation" type="text" class="validate">
                                <label for="affiliation">Affiliation</label>
                            </div>
                        </div>
"""),format.raw/*247.34*/("""
                        """),format.raw/*248.25*/("""<div class="row">
                            <div class="input-field col s12">
                                <input id="email" name="email" type="email" class="validate">
                                <label for="email">Email</label>
                            </div>
                        </div>
"""),format.raw/*254.34*/("""
                        """),format.raw/*255.25*/("""<div class="row">
                            <div class="input-field col s12">
                                <input id="phone" name="phone" type="tel" class="validate">
                                <label for="phone">Phone</label>
                            </div>
                        </div>
"""),format.raw/*261.32*/("""
                        """),format.raw/*262.25*/("""<center><strong>Physical Address</strong></center>
                        <div class="row">
                            <div class="input-field col s12">
                                <input id="fax" name="fax" type="tel" class="validate">
                                <label for="fax">Fax</label>
                            </div>
                        </div>
"""),format.raw/*269.48*/("""
                        """),format.raw/*270.25*/("""<div class="row">
                            <div class="text-area">
                                <input id="address" name="address" type="text" class="validate">
                                <label for="fax">Address</label>
                            </div>
                        </div>
"""),format.raw/*276.33*/("""
                        """),format.raw/*277.25*/("""<div class="row">
                            <div class="input-field col s12">
                                <input id="city" name="city" type="text" class="validate">
                                <label for="city">City</label>
                            </div>
                        </div>
"""),format.raw/*283.43*/("""
                        """),format.raw/*284.25*/("""<div class="row">
                            <div class="input-field col s12">
                                <input id="country" name="country" type="text" class="validate">
                                <label for="country">Country</label>
                            </div>
                        </div>
"""),format.raw/*290.37*/("""
                        """),format.raw/*291.25*/("""<div class="row">
                            <div class="input-field col s12">
                                <input id="zipCode" name="zipCode" type="number" class="validate">
                                <label for="zipCode">Zip Code</label>
                            </div>
                        </div>
                        <center><strong>Additional Information</strong></center>
                        <div class="row">
                            <div class="text-input">
                                <input id="comments" name="comments" type="text" class="validate">
                                <label for="comments">Comments</label>
                            </div>
                        </div>
                        """),_display_(/*304.26*/if(authorizeMessage!= null)/*304.53*/{_display_(Seq[Any](format.raw/*304.54*/("""
                            """),format.raw/*305.29*/("""<div class="alert alert-primary" role="alert">
                            """),_display_(/*306.30*/authorizeMessage),format.raw/*306.46*/("""
                            """),format.raw/*307.29*/("""</div>
                            <br>
                        """)))}),format.raw/*309.26*/("""
                        """),format.raw/*310.25*/("""<div class="row">
                            <button id="api-search-button" class="btn col s4 offset-s4" type="submit">Submit</button>
                        </div>
                    </form>
                </div>
            </div>
        </div>
    </body>
</html>
"""))
      }
    }
  }

  def render(authorizeMessage:String): play.twirl.api.HtmlFormat.Appendable = apply(authorizeMessage)

  def f:((String) => play.twirl.api.HtmlFormat.Appendable) = (authorizeMessage) => apply(authorizeMessage)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: 2023-02-24T13:21:30.120
                  SOURCE: /Users/seangrady/Desktop/CS4345/CS4345SemesterProject/Frontend/app/views/register.scala.html
                  HASH: bb14f5eb89297d3218fc65a01c807cff21b0607e
                  MATRIX: 951->1|1071->28|2342->1273|2371->1274|2420->1295|2559->1406|2588->1407|2633->1424|2672->1435|2701->1436|2750->1457|2855->1534|2884->1535|2929->1552|2974->1569|3003->1570|3052->1591|3123->1634|3152->1635|3188->1644|3551->1980|3566->1986|3618->2017|12021->10391|12051->10392|12117->10429|12262->10545|12292->10546|12362->10587|12495->10691|12525->10692|12555->10693|12589->10698|12619->10699|12689->10740|12821->10843|12851->10844|12913->10877|12943->10878|12997->10903|17398->15311|17452->15336|17797->15691|17851->15716|18208->16077|18262->16102|18596->16440|18650->16465|18982->16799|19036->16824|19435->17241|19489->17266|19816->17596|19870->17621|20199->17963|20253->17988|20594->18336|20648->18361|21428->19113|21465->19140|21505->19141|21563->19170|21667->19246|21705->19262|21763->19291|21860->19356|21914->19381
                  LINES: 28->1|33->2|49->18|49->18|50->19|53->22|53->22|54->23|54->23|54->23|55->24|57->26|57->26|58->27|58->27|58->27|59->28|60->29|60->29|61->30|74->43|74->43|74->43|189->158|189->158|190->159|191->160|191->160|192->161|193->162|193->162|193->162|193->162|193->162|194->163|195->164|195->164|196->165|196->165|197->166|264->233|265->234|271->240|272->241|278->247|279->248|285->254|286->255|292->261|293->262|300->269|301->270|307->276|308->277|314->283|315->284|321->290|322->291|335->304|335->304|335->304|336->305|337->306|337->306|338->307|340->309|341->310
                  -- GENERATED --
              */
          