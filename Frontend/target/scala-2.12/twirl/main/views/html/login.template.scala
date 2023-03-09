
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

object login extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(authorizeMessage: String):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*2.1*/("""<!DOCTYPE html>
<html>
    <head>
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

        <title>Login</title>
        <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/materialize/1.0.0/css/materialize.min.css">

            <!-- Compiled and minified JavaScript -->
        <script src="https://cdnjs.cloudflare.com/ajax/libs/materialize/1.0.0/js/materialize.min.js"></script>
        <link rel="shortcut icon" type="image/x-icon" href="docs/images/favicon.ico" />
        <link rel="stylesheet" href="https://unpkg.com/leaflet@1.5.1/dist/leaflet.css" integrity="sha512-xwE/Az9zrjBIphAcBb3F6JVqxf46+CDLwfLMHloNu6KEQCAWi6HcDUbeOfBIptF7tcCzusKFjFw2yuvEpDL9wQ==" crossorigin=""/>
        <script src="https://unpkg.com/leaflet@1.5.1/dist/leaflet.js" integrity="sha512-GffPMF3RvMeYyc1LWMHtK8EbPv0iNZ8/oTtHPx9/cc2ILxQ+u905qIwdpULaqDkyBKgOaB57QTMg7ztg8Jm2Og==" crossorigin=""></script>


        <style>
                body """),format.raw/*20.22*/("""{"""),format.raw/*20.23*/("""
                    """),format.raw/*21.21*/("""background-color: #e6e6e6;
                """),format.raw/*22.17*/("""}"""),format.raw/*22.18*/("""
                """),format.raw/*23.17*/("""header.topbar """),format.raw/*23.31*/("""{"""),format.raw/*23.32*/("""
                    """),format.raw/*24.21*/("""background-color: #4a4e4d;
                    padding: 10px;
                    color: #fff;
                """),format.raw/*27.17*/("""}"""),format.raw/*27.18*/("""
                """),format.raw/*28.17*/(""".card """),format.raw/*28.23*/("""{"""),format.raw/*28.24*/("""
                    """),format.raw/*29.21*/("""margin-top: 50px;
                    border-radius: 10px;
                    box-shadow: 0 10px 20px rgba(0, 0, 0, 0.2);
                """),format.raw/*32.17*/("""}"""),format.raw/*32.18*/("""
                """),format.raw/*33.17*/("""form """),format.raw/*33.22*/("""{"""),format.raw/*33.23*/("""
                    """),format.raw/*34.21*/("""padding: 20px;
                """),format.raw/*35.17*/("""}"""),format.raw/*35.18*/("""
                """),format.raw/*36.17*/(""".input-field label """),format.raw/*36.36*/("""{"""),format.raw/*36.37*/("""
                    """),format.raw/*37.21*/("""color: #4a4e4d;
                """),format.raw/*38.17*/("""}"""),format.raw/*38.18*/("""
                """),format.raw/*39.17*/(""".input-field input[type=text]:focus + label,
                .input-field input[type=password]:focus + label """),format.raw/*40.65*/("""{"""),format.raw/*40.66*/("""
                    """),format.raw/*41.21*/("""color: #4a4e4d;
                """),format.raw/*42.17*/("""}"""),format.raw/*42.18*/("""
                """),format.raw/*43.17*/("""button.btn """),format.raw/*43.28*/("""{"""),format.raw/*43.29*/("""
                    """),format.raw/*44.21*/("""background-color: #4a4e4d;
                    border: none;
                """),format.raw/*46.17*/("""}"""),format.raw/*46.18*/("""
                """),format.raw/*47.17*/("""button.btn:hover """),format.raw/*47.34*/("""{"""),format.raw/*47.35*/("""
                    """),format.raw/*48.21*/("""background-color: #3F51B5;
                """),format.raw/*49.17*/("""}"""),format.raw/*49.18*/("""
                """),format.raw/*50.17*/("""a """),format.raw/*50.19*/("""{"""),format.raw/*50.20*/("""
                    """),format.raw/*51.21*/("""color: #4a4e4d;
                    text-decoration: none;
                """),format.raw/*53.17*/("""}"""),format.raw/*53.18*/("""
                """),format.raw/*54.17*/("""h1 """),format.raw/*54.20*/("""{"""),format.raw/*54.21*/("""

                    """),format.raw/*56.21*/("""font-family: Arial, sans-serif;
                    font-size: 24px;
                    font-weight: bold;
                    margin: 0 auto;
                    padding: 0;
                    text-align: center;
                    margin-top: 5px;
                    margin-bottom 15px;
                """),format.raw/*64.17*/("""}"""),format.raw/*64.18*/("""
        """),format.raw/*65.9*/("""</style>
    </head>
    <body>

        <header class="topbar">
            <h1 class="center-align"><strong>Login to Account</strong></h1>
        </header>

        <div class="container">
            <div class="row">
                <div class="card col s12 m6 offset-m3 l4 offset-l4">
                    <div class="card-content">
                        <form action=""""),_display_(/*77.40*/routes/*77.46*/.HomeController.loginHandler()),format.raw/*77.76*/("""" method="GET">
                            <div class="input-field">
                                <input id="username" name="username" type="text" class="validate">
                                <label for="username">Username</label>
                            </div>
                            <div class="input-field">
                                <input id="password" name="password" type="password" class="validate">
                                <label for="password">Password</label>
                            </div>
                            """),_display_(/*86.30*/if(authorizeMessage!= null)/*86.57*/ {_display_(Seq[Any](format.raw/*86.59*/("""
                                """),format.raw/*87.33*/("""<div class="alert alert-primary" role="alert">
                                """),_display_(/*88.34*/authorizeMessage),format.raw/*88.50*/("""
                                """),format.raw/*89.33*/("""</div>
                                <br>
                            """)))}),format.raw/*91.30*/("""
                            """),format.raw/*92.29*/("""<div class="center-align">
                                <button id="api-search-button" class="btn" type="submit">Submit</button>
                            </div>
                            <br>
                            <div class="center-align">
                                <div class="row">
                                    <div class="col s6 left-align">
                                        <a href=""""),_display_(/*99.51*/routes/*99.57*/.HomeController.signup()),format.raw/*99.81*/("""">Register User</a>
                                    </div>
                                    <div class="col s6 right-align">
"""),format.raw/*102.118*/("""
                                        """),format.raw/*103.41*/("""<a href=""""),_display_(/*103.51*/routes/*103.57*/.HomeController.passwordReset()),format.raw/*103.88*/("""">Reset Password</a>
                                    </div>
                                </div>
                            </div>
                        </form>
                    </div>
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
                  DATE: 2023-02-28T20:18:52.691
                  SOURCE: /Users/kendalllboesch/Desktop/Current/CS4345-SoftwareEngineering/SemProject/TAScheduler/Frontend/app/views/login.scala.html
                  HASH: 2ccda6d0480471f4ce31090e75fd10bf29a8a515
                  MATRIX: 948->1|1068->28|2303->1237|2332->1238|2381->1259|2452->1302|2481->1303|2526->1320|2568->1334|2597->1335|2646->1356|2785->1467|2814->1468|2859->1485|2893->1491|2922->1492|2971->1513|3138->1652|3167->1653|3212->1670|3245->1675|3274->1676|3323->1697|3382->1728|3411->1729|3456->1746|3503->1765|3532->1766|3581->1787|3641->1819|3670->1820|3715->1837|3852->1946|3881->1947|3930->1968|3990->2000|4019->2001|4064->2018|4103->2029|4132->2030|4181->2051|4286->2128|4315->2129|4360->2146|4405->2163|4434->2164|4483->2185|4554->2228|4583->2229|4628->2246|4658->2248|4687->2249|4736->2270|4839->2345|4868->2346|4913->2363|4944->2366|4973->2367|5023->2389|5360->2698|5389->2699|5425->2708|5829->3085|5844->3091|5895->3121|6489->3688|6525->3715|6565->3717|6626->3750|6733->3830|6770->3846|6831->3879|6935->3952|6992->3981|7442->4404|7457->4410|7502->4434|7664->4683|7734->4724|7772->4734|7788->4740|7841->4771
                  LINES: 28->1|33->2|51->20|51->20|52->21|53->22|53->22|54->23|54->23|54->23|55->24|58->27|58->27|59->28|59->28|59->28|60->29|63->32|63->32|64->33|64->33|64->33|65->34|66->35|66->35|67->36|67->36|67->36|68->37|69->38|69->38|70->39|71->40|71->40|72->41|73->42|73->42|74->43|74->43|74->43|75->44|77->46|77->46|78->47|78->47|78->47|79->48|80->49|80->49|81->50|81->50|81->50|82->51|84->53|84->53|85->54|85->54|85->54|87->56|95->64|95->64|96->65|108->77|108->77|108->77|117->86|117->86|117->86|118->87|119->88|119->88|120->89|122->91|123->92|130->99|130->99|130->99|133->102|134->103|134->103|134->103|134->103
                  -- GENERATED --
              */
          