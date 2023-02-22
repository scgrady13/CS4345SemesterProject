
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
    </head>
    <body>

        <header class="topbar">
            <h1 class="focused" style="font-size: 37px;
                color: #57a957">
                <center><strong>Register New User</strong></center>
            </h1>
        </header>


        <div class="row">
            <div class="card col s8 offset-s2">
                <div class="card-panel">
                    <form action=""""),_display_(/*31.36*/routes/*31.42*/.HomeController.signupHandler()),format.raw/*31.73*/("""" method="GET">
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
                                function updateOptions() """),format.raw/*146.58*/("""{"""),format.raw/*146.59*/("""
                                    """),format.raw/*147.37*/("""var status = document.getElementById("status").value;
                                    if (status === "student") """),format.raw/*148.63*/("""{"""),format.raw/*148.64*/("""
                                        """),format.raw/*149.41*/("""document.getElementById("student-options").style.display = "block";
                                    """),format.raw/*150.37*/("""}"""),format.raw/*150.38*/(""" """),format.raw/*150.39*/("""else """),format.raw/*150.44*/("""{"""),format.raw/*150.45*/("""
                                        """),format.raw/*151.41*/("""document.getElementById("student-options").style.display = "none";
                                    """),format.raw/*152.37*/("""}"""),format.raw/*152.38*/("""
                                """),format.raw/*153.33*/("""}"""),format.raw/*153.34*/("""
                        """),format.raw/*154.25*/("""</script>
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
"""),format.raw/*221.37*/("""
                        """),format.raw/*222.25*/("""<div class="row">
                            <div class="input-field col s12">
                                <input id="position" name="position" type="text" class="validate">
                                <label for="position">Position</label>
                            </div>
                        </div>
"""),format.raw/*228.40*/("""
                        """),format.raw/*229.25*/("""<div class="row">
                            <div class="input-field col s12">
                                <input id="affiliation" name="affiliation" type="text" class="validate">
                                <label for="affiliation">Affiliation</label>
                            </div>
                        </div>
"""),format.raw/*235.34*/("""
                        """),format.raw/*236.25*/("""<div class="row">
                            <div class="input-field col s12">
                                <input id="email" name="email" type="email" class="validate">
                                <label for="email">Email</label>
                            </div>
                        </div>
"""),format.raw/*242.34*/("""
                        """),format.raw/*243.25*/("""<div class="row">
                            <div class="input-field col s12">
                                <input id="phone" name="phone" type="tel" class="validate">
                                <label for="phone">Phone</label>
                            </div>
                        </div>
"""),format.raw/*249.32*/("""
                        """),format.raw/*250.25*/("""<center><strong>Physical Address</strong></center>
                        <div class="row">
                            <div class="input-field col s12">
                                <input id="fax" name="fax" type="tel" class="validate">
                                <label for="fax">Fax</label>
                            </div>
                        </div>
"""),format.raw/*257.48*/("""
                        """),format.raw/*258.25*/("""<div class="row">
                            <div class="text-area">
                                <input id="address" name="address" type="text" class="validate">
                                <label for="fax">Address</label>
                            </div>
                        </div>
"""),format.raw/*264.33*/("""
                        """),format.raw/*265.25*/("""<div class="row">
                            <div class="input-field col s12">
                                <input id="city" name="city" type="text" class="validate">
                                <label for="city">City</label>
                            </div>
                        </div>
"""),format.raw/*271.43*/("""
                        """),format.raw/*272.25*/("""<div class="row">
                            <div class="input-field col s12">
                                <input id="country" name="country" type="text" class="validate">
                                <label for="country">Country</label>
                            </div>
                        </div>
"""),format.raw/*278.37*/("""
                        """),format.raw/*279.25*/("""<div class="row">
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
                        """),_display_(/*292.26*/if(authorizeMessage!= null)/*292.53*/{_display_(Seq[Any](format.raw/*292.54*/("""
                            """),format.raw/*293.29*/("""<div class="alert alert-primary" role="alert">
                            """),_display_(/*294.30*/authorizeMessage),format.raw/*294.46*/("""
                            """),format.raw/*295.29*/("""</div>
                            <br>
                        """)))}),format.raw/*297.26*/("""
                        """),format.raw/*298.25*/("""<div class="row">
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
                  DATE: 2023-02-21T19:31:13.359
                  SOURCE: /Users/seangrady/Desktop/CS4345/CS4345SemesterProject/Frontend/app/views/register.scala.html
                  HASH: a9328c284cfd198fba0ba00e99a2ef12107ecf64
                  MATRIX: 951->1|1071->28|2696->1628|2711->1634|2763->1665|11166->10039|11196->10040|11262->10077|11407->10193|11437->10194|11507->10235|11640->10339|11670->10340|11700->10341|11734->10346|11764->10347|11834->10388|11966->10491|11996->10492|12058->10525|12088->10526|12142->10551|16543->14959|16597->14984|16942->15339|16996->15364|17353->15725|17407->15750|17741->16088|17795->16113|18127->16447|18181->16472|18580->16889|18634->16914|18961->17244|19015->17269|19344->17611|19398->17636|19739->17984|19793->18009|20573->18761|20610->18788|20650->18789|20708->18818|20812->18894|20850->18910|20908->18939|21005->19004|21059->19029
                  LINES: 28->1|33->2|62->31|62->31|62->31|177->146|177->146|178->147|179->148|179->148|180->149|181->150|181->150|181->150|181->150|181->150|182->151|183->152|183->152|184->153|184->153|185->154|252->221|253->222|259->228|260->229|266->235|267->236|273->242|274->243|280->249|281->250|288->257|289->258|295->264|296->265|302->271|303->272|309->278|310->279|323->292|323->292|323->292|324->293|325->294|325->294|326->295|328->297|329->298
                  -- GENERATED --
              */
          