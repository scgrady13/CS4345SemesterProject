
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
                <strong>Register New User</strong>
            </h1>
        </header>


        <div class="row">
            <div class="card col s4 offset-s4 ">
                <div class="card-panel">
                    <form action=""""),_display_(/*31.36*/routes/*31.42*/.HomeController.signupHandler()),format.raw/*31.73*/("""" method="GET">

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
                        <div class="row">
                            <label>Security Question 2</label>
                            <div class="dropdown-toggle">
                                <input id="secQuestion1" name="secQuestion1"  list="datalist-questions1" class="validate" type="" placeholder="Select Question">
                                <datalist id="datalist-questions1">
                                    <select name="secQuestion1">
                                        <option>What was your first pets name</option>
                                        <option>Where were you born</option>
                                        <option>What was the name of your elementary school</option>
                                        <option>What is your favorite movie</option>
                                    </select>
                                </datalist>
                            </div>
                        </div>
                        <div class="row">
                            <div class="input-field col s12">
                                <input id="secAnswer1" name="secAnswer1" type="text" class="validate" placeholder="Answer Here">
                            </div>
                        </div>
                        <div class="row">
                            <label>Security Question 2</label>
                            <div class="dropdown">
                                <input id="secQuestion2" name="secQuestion2"  list="datalist-questions2" class="validate" type="" placeholder="Select Question">
                                <datalist id="datalist-questions2">
                                    <select name="secQuestion2">
                                       <option>What was your first pets name</option>
                                        <option>Where were you born</option>
                                        <option>What was the name of your elementary school</option>
                                        <option>What is your favorite movie</option>
                                    </select>
                                </datalist>
                            </div>
                        </div>
                        <div class="row">
                            <div class="input-field col s12">
                                <input id="secAnswer2" name="secAnswer2" type="text" class="validate" placeholder="Answer Here">
                            </div>
                        </div>
                        <div class="row">
                            <div class="dropdown">
                                <input id="title" name="title" type="" list="datalist-titles" class="validate" placeholder="Select Title"/>
                                <datalist id="datalist-titles">
                                    <select name=title">
                                        <option>Mr</option>
                                        <option>Ms</option>
                                        <option>Dr</option>
                                    </select>
                                </datalist>
                            </div>
                        </div>
                        <div class="row">
                            <div class="input-field col s12">
                                <input id="firstname" name="firstname" type="text" class="validate">
                                <label for="firstname">First Name</label>
                            </div>
                        </div>
                        <div class="row">
                            <div class="input-field col s12">
                                <input id="lastname" name="lastname" type="text" class="validate">
                                <label for="lastname">Last Name</label>
                            </div>
                        </div>
                        <div class="row">
                            <div class="input-field col s12">
                                <input id="research" name="research" type="text" class="validate">
                                <label for="research">Research Areas</label>
                            </div>
                        </div>
"""),format.raw/*115.37*/("""
                        """),format.raw/*116.25*/("""<div class="row">
                            <div class="input-field col s12">
                                <input id="position" name="position" type="text" class="validate">
                                <label for="position">Position</label>
                            </div>
                        </div>
"""),format.raw/*122.40*/("""
                        """),format.raw/*123.25*/("""<div class="row">
                            <div class="input-field col s12">
                                <input id="affiliation" name="affiliation" type="text" class="validate">
                                <label for="affiliation">Affiliation</label>
                            </div>
                        </div>
"""),format.raw/*129.34*/("""
                        """),format.raw/*130.25*/("""<div class="row">
                            <div class="input-field col s12">
                                <input id="email" name="email" type="email" class="validate">
                                <label for="email">Email</label>
                            </div>
                        </div>
"""),format.raw/*136.34*/("""
                        """),format.raw/*137.25*/("""<div class="row">
                            <div class="input-field col s12">
                                <input id="phone" name="phone" type="tel" class="validate">
                                <label for="phone">Phone</label>
                            </div>
                        </div>
"""),format.raw/*143.32*/("""
                        """),format.raw/*144.25*/("""<div class="row">
                            <div class="input-field col s12">
                                <input id="fax" name="fax" type="tel" class="validate">
                                <label for="fax">Fax</label>
                            </div>
                        </div>
"""),format.raw/*150.48*/("""
                        """),format.raw/*151.25*/("""<div class="row">
                            <div class="text-area">
                                <input id="address" name="address" type="text" class="validate">
                                <label for="fax">Address</label>
                            </div>
                        </div>
"""),format.raw/*157.33*/("""
                        """),format.raw/*158.25*/("""<div class="row">
                            <div class="input-field col s12">
                                <input id="city" name="city" type="text" class="validate">
                                <label for="city">City</label>
                            </div>
                        </div>
"""),format.raw/*164.43*/("""
                        """),format.raw/*165.25*/("""<div class="row">
                            <div class="input-field col s12">
                                <input id="country" name="country" type="text" class="validate">
                                <label for="country">Country</label>
                            </div>
                        </div>
"""),format.raw/*171.37*/("""
                        """),format.raw/*172.25*/("""<div class="row">
                            <div class="input-field col s12">
                                <input id="zipCode" name="zipCode" type="number" class="validate">
                                <label for="zipCode">Zip Code</label>
                            </div>
                        </div>
"""),format.raw/*178.37*/("""
                        """),format.raw/*179.25*/("""<div class="row">
                            <div class="text-input">
                                <input id="comments" name="comments" type="text" class="validate">
                                <label for="comments">Comments</label>
                            </div>
                        </div>
                        """),_display_(/*185.26*/if(authorizeMessage!= null)/*185.53*/{_display_(Seq[Any](format.raw/*185.54*/("""
                            """),format.raw/*186.29*/("""<div class="alert alert-primary" role="alert">
                            """),_display_(/*187.30*/authorizeMessage),format.raw/*187.46*/("""
                            """),format.raw/*188.29*/("""</div>
                            <br>
                        """)))}),format.raw/*190.26*/("""
                        """),format.raw/*191.25*/("""<div class="row">
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
                  DATE: 2023-02-21T11:52:33.302
                  SOURCE: /Users/seangrady/Desktop/CS4345/CS4345SemesterProject/Frontend/app/views/register.scala.html
                  HASH: b45d4e8718f12bd3f8bf8fe4a10678aff8dd5852
                  MATRIX: 951->1|1071->28|2680->1612|2695->1618|2747->1649|7717->6626|7771->6651|8116->7006|8170->7031|8527->7392|8581->7417|8915->7755|8969->7780|9301->8114|9355->8139|9679->8481|9733->8506|10060->8836|10114->8861|10443->9203|10497->9228|10838->9576|10892->9601|11236->9952|11290->9977|11650->10309|11687->10336|11727->10337|11785->10366|11889->10442|11927->10458|11985->10487|12082->10552|12136->10577
                  LINES: 28->1|33->2|62->31|62->31|62->31|146->115|147->116|153->122|154->123|160->129|161->130|167->136|168->137|174->143|175->144|181->150|182->151|188->157|189->158|195->164|196->165|202->171|203->172|209->178|210->179|216->185|216->185|216->185|217->186|218->187|218->187|219->188|221->190|222->191
                  -- GENERATED --
              */
          