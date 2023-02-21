
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
            <div class="card col s6 offset-s3">
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
                        <center><strong>Security Questions</strong></center><br>
                        <div class="row">
                            <div class="form-group">
                                <select name="secQuestion1" style="display:block" class="selection-handle"  id="secQuestion2" class="validate">
                                    <option disabled>Select Question</option>
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
                                    <select name="secQuestion2" style="display:block" class="selection-handle" id="secQuestion2" class="validate">
                                        <option disabled>Select Question</option>
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

                        <div class="row">
                            <div class="col">
                                <div class="input-field col s8 offset-s7">
                                    <select style="display:block" name="title" id="title" class="validate">
                                        <option disabled>Choose Title</option>
                                        <option value="Mr">Mr</option>
                                        <option value="Ms">Ms</option>
                                        <option value="Dr">Dr</option>
                                    </select>
                                </div>
                            </div>
                            <div class="col">
                                <div class="input-field col s30 offset-s3">
                                    <input id="firstname" name="firstname" type="text" class="validate">
                                    <label for="firstname">First Name</label>
                                </div>
                            </div>
                            <div class="col">
                                <div class="input-field col s14 offset-s2">
                                    <input id="lastname" name="lastname" type="text" class="validate">
                                    <label for="lastname">Last Name</label>
                                </div>
                            </div>
                        </div>
                        <div class="row">
                            <div class="input-field col s12">
                                <input id="research" name="research" type="text" class="validate">
                                <label for="research">Research Areas</label>
                            </div>
                        </div>
"""),format.raw/*108.37*/("""
                        """),format.raw/*109.25*/("""<div class="row">
                            <div class="input-field col s12">
                                <input id="position" name="position" type="text" class="validate">
                                <label for="position">Position</label>
                            </div>
                        </div>
"""),format.raw/*115.40*/("""
                        """),format.raw/*116.25*/("""<div class="row">
                            <div class="input-field col s12">
                                <input id="affiliation" name="affiliation" type="text" class="validate">
                                <label for="affiliation">Affiliation</label>
                            </div>
                        </div>
"""),format.raw/*122.34*/("""
                        """),format.raw/*123.25*/("""<div class="row">
                            <div class="input-field col s12">
                                <input id="email" name="email" type="email" class="validate">
                                <label for="email">Email</label>
                            </div>
                        </div>
"""),format.raw/*129.34*/("""
                        """),format.raw/*130.25*/("""<div class="row">
                            <div class="input-field col s12">
                                <input id="phone" name="phone" type="tel" class="validate">
                                <label for="phone">Phone</label>
                            </div>
                        </div>
"""),format.raw/*136.32*/("""
                        """),format.raw/*137.25*/("""<div class="row">
                            <div class="input-field col s12">
                                <input id="fax" name="fax" type="tel" class="validate">
                                <label for="fax">Fax</label>
                            </div>
                        </div>
"""),format.raw/*143.48*/("""
                        """),format.raw/*144.25*/("""<div class="row">
                            <div class="text-area">
                                <input id="address" name="address" type="text" class="validate">
                                <label for="fax">Address</label>
                            </div>
                        </div>
"""),format.raw/*150.33*/("""
                        """),format.raw/*151.25*/("""<div class="row">
                            <div class="input-field col s12">
                                <input id="city" name="city" type="text" class="validate">
                                <label for="city">City</label>
                            </div>
                        </div>
"""),format.raw/*157.43*/("""
                        """),format.raw/*158.25*/("""<div class="row">
                            <div class="input-field col s12">
                                <input id="country" name="country" type="text" class="validate">
                                <label for="country">Country</label>
                            </div>
                        </div>
"""),format.raw/*164.37*/("""
                        """),format.raw/*165.25*/("""<div class="row">
                            <div class="input-field col s12">
                                <input id="zipCode" name="zipCode" type="number" class="validate">
                                <label for="zipCode">Zip Code</label>
                            </div>
                        </div>
"""),format.raw/*171.37*/("""
                        """),format.raw/*172.25*/("""<div class="row">
                            <div class="text-input">
                                <input id="comments" name="comments" type="text" class="validate">
                                <label for="comments">Comments</label>
                            </div>
                        </div>
                        """),_display_(/*178.26*/if(authorizeMessage!= null)/*178.53*/{_display_(Seq[Any](format.raw/*178.54*/("""
                            """),format.raw/*179.29*/("""<div class="alert alert-primary" role="alert">
                            """),_display_(/*180.30*/authorizeMessage),format.raw/*180.46*/("""
                            """),format.raw/*181.29*/("""</div>
                            <br>
                        """)))}),format.raw/*183.26*/("""
                        """),format.raw/*184.25*/("""<div class="row">
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
                  DATE: 2023-02-21T14:23:43.555
                  SOURCE: /Users/seangrady/Desktop/CS4345/CS4345SemesterProject/Frontend/app/views/register.scala.html
                  HASH: 8444db8c91ed8c44cd195ad5792b9ad7930082a8
                  MATRIX: 951->1|1071->28|2696->1628|2711->1634|2763->1665|7621->6530|7675->6555|8020->6910|8074->6935|8431->7296|8485->7321|8819->7659|8873->7684|9205->8018|9259->8043|9583->8385|9637->8410|9964->8740|10018->8765|10347->9107|10401->9132|10742->9480|10796->9505|11140->9856|11194->9881|11554->10213|11591->10240|11631->10241|11689->10270|11793->10346|11831->10362|11889->10391|11986->10456|12040->10481
                  LINES: 28->1|33->2|62->31|62->31|62->31|139->108|140->109|146->115|147->116|153->122|154->123|160->129|161->130|167->136|168->137|174->143|175->144|181->150|182->151|188->157|189->158|195->164|196->165|202->171|203->172|209->178|209->178|209->178|210->179|211->180|211->180|212->181|214->183|215->184
                  -- GENERATED --
              */
          