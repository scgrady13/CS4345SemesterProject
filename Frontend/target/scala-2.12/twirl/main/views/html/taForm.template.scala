
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

object taForm extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[User,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(user: User):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*2.1*/("""
"""),format.raw/*3.1*/("""<!DOCTYPE html>
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
            header.topbar """),format.raw/*19.27*/("""{"""),format.raw/*19.28*/("""
              """),format.raw/*20.15*/("""background-color: #4a4e4d;
              padding: 10px;
              color: #fff;
            """),format.raw/*23.13*/("""}"""),format.raw/*23.14*/("""
            """),format.raw/*24.13*/("""button.btn """),format.raw/*24.24*/("""{"""),format.raw/*24.25*/("""
              """),format.raw/*25.15*/("""background-color: #4a4e4d;
              border: none;
            """),format.raw/*27.13*/("""}"""),format.raw/*27.14*/("""
            """),format.raw/*28.13*/("""button.btn:hover """),format.raw/*28.30*/("""{"""),format.raw/*28.31*/("""
              """),format.raw/*29.15*/("""background-color: #3F51B5;
            """),format.raw/*30.13*/("""}"""),format.raw/*30.14*/("""
    """),format.raw/*31.5*/("""</style>


  </head>
  <body>



    <header class="topbar">
      <h5 class="focused" style="font-size: 37px;
        color: #57a957">
        <center>Apply for Ta Position</center>
      </h5>
    </header>




    <div class="row">
      <div class="card col s8 offset-s2">
        <div class="card-panel">

          <div class="row">
            <center><label for="FirstName">First Name:</label></center>
            <center><h8 name="FirstName">"""),_display_(/*55.43*/user/*55.47*/.getFirstname),format.raw/*55.60*/("""</h8></center>

          </div>



          <div class="row">
            <center><label for="LastName">Last Name:</label></center>
            <center><h8 name="LastName">"""),_display_(/*63.42*/user/*63.46*/.getLastname),format.raw/*63.58*/("""</h8></center>

          </div>

          <div class="row">
            <center><label for="Email">Email:</label></center>
            <center><h8 name="Email">"""),_display_(/*69.39*/user/*69.43*/.getEmail),format.raw/*69.52*/("""</h8></center>

          </div>

          <div class="row">
            <center><label for="PhoneNumber">Phone Number:</label></center>
            <center><h8>"""),_display_(/*75.26*/user/*75.30*/.getPhone),format.raw/*75.39*/("""</h8></center>

          </div>

          <div class="row">
            <center><label for="Current_Deg_Plan">Current Degree Plan:</label></center>
            <center><h8 name="Current_Deg_Plan">"""),_display_(/*81.50*/user/*81.54*/.getDegreeplan),format.raw/*81.68*/("""</h8></center>

          </div>


          <div class="row">
            <center><label for="Starting_Semester">Starting Semester:</label></center>
            <center><h8 name="Starting_Semester">"""),_display_(/*88.51*/user/*88.55*/.getStartingseason),format.raw/*88.73*/("""</h8></center>

          </div>

          <div class="row">
            <center><label for="Grad_Semester">Graduating Semester:</label></center>
            <center><h8 name="Grad_Semester">"""),_display_(/*94.47*/user/*94.51*/.getGradseason),format.raw/*94.65*/("""</h8></center>

          </div>
          <form action=""""),_display_(/*97.26*/routes/*97.32*/.HomeController.TaSubmitHandler()),format.raw/*97.65*/("""" method="GET">

          <label for="previousCourses">Courses taken before:</label>
          <div class="select-checkboxes">
            <select style="display:block; height: 200px;" name="previousCourses" id="previousCourses" multiple class="selection-handle">
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



          <label for="preference">1st Preference for Ta Position:</label>
          <select style="display:block" name="preference" id="preference">
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




            <label for="preference1all">1st Preference for all Ta Positions:</label>
            <select style="display:block" name="preference1all" id="preference1all">
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


            <label for="preference2">2nd Preference for Ta Position:</label>
            <select style="display:block" name="preference2" id="preference2">
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

            <label for="preference3">3rd Preference for Ta Position:</label>
            <select style="display:block" name="preference3" id="preference3">
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


          <label for="notpreferred">Courses preferred not to Ta for:</label>
          <div class="select-checkboxes">
            <select style="display:block; height: 200px;" name="notpreferred" id="notpreferred" multiple class="selection-handle">
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


<div class="row">

            <label name="filename">Upload Resume</label>
            <input type="file" id="myFile" name="filename">


</div>
            <button class="btn" type="submit">Submit</button>

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

  def render(user:User): play.twirl.api.HtmlFormat.Appendable = apply(user)

  def f:((User) => play.twirl.api.HtmlFormat.Appendable) = (user) => apply(user)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: 2023-03-07T23:51:22.261
                  SOURCE: /Users/davidberberian/Desktop/TaSystemnow/TASystem/Frontend/app/views/taForm.scala.html
                  HASH: 6d3c8359579acc434cf4a8ae973abaf3e2851560
                  MATRIX: 947->1|1053->14|1080->15|2299->1208|2328->1209|2371->1224|2494->1319|2523->1320|2564->1333|2603->1344|2632->1345|2675->1360|2770->1427|2799->1428|2840->1441|2885->1458|2914->1459|2957->1474|3024->1513|3053->1514|3085->1519|3565->1972|3578->1976|3612->1989|3814->2164|3827->2168|3860->2180|4050->2343|4063->2347|4093->2356|4283->2519|4296->2523|4326->2532|4552->2731|4565->2735|4600->2749|4827->2949|4840->2953|4879->2971|5099->3164|5112->3168|5147->3182|5232->3240|5247->3246|5301->3279
                  LINES: 28->1|33->2|34->3|50->19|50->19|51->20|54->23|54->23|55->24|55->24|55->24|56->25|58->27|58->27|59->28|59->28|59->28|60->29|61->30|61->30|62->31|86->55|86->55|86->55|94->63|94->63|94->63|100->69|100->69|100->69|106->75|106->75|106->75|112->81|112->81|112->81|119->88|119->88|119->88|125->94|125->94|125->94|128->97|128->97|128->97
                  -- GENERATED --
              */
          