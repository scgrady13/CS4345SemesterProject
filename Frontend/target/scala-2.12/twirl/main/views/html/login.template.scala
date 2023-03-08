
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
                <center><strong>Login to Account</strong></center>
            </h1>
        </header>


        <div class="row">
            <div class="card col s4 offset-s4 ">
                <div class="card-panel">
                    <form action=""""),_display_(/*31.36*/routes/*31.42*/.HomeController.loginHandler()),format.raw/*31.72*/("""" method="GET">

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
                        """),_display_(/*47.26*/if(authorizeMessage!= null)/*47.53*/{_display_(Seq[Any](format.raw/*47.54*/("""
                            """),format.raw/*48.29*/("""<div class="alert alert-primary" role="alert">
                            """),_display_(/*49.30*/authorizeMessage),format.raw/*49.46*/("""
                            """),format.raw/*50.29*/("""</div>
                            <br>
                        """)))}),format.raw/*52.26*/("""
                        """),format.raw/*53.25*/("""<div class="row">
                            <button id="api-search-button" class="btn col s4 offset-s4" type="submit">Submit</button>
                        </div>
                        <a href=""""),_display_(/*56.35*/routes/*56.41*/.HomeController.signup()),format.raw/*56.65*/("""">REGISTER</a>
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
<<<<<<< Updated upstream
                  DATE: 2023-02-21T14:23:43.613
                  SOURCE: /Users/seangrady/Desktop/CS4345/CS4345SemesterProject/Frontend/app/views/login.scala.html
                  HASH: be123593b494795c661bea0133866ebc2ee11ef4
                  MATRIX: 948->1|1068->28|2693->1628|2708->1634|2759->1664|3514->2392|3550->2419|3589->2420|3646->2449|3749->2525|3786->2541|3843->2570|3939->2635|3992->2660|4220->2861|4235->2867|4280->2891
                  LINES: 28->1|33->2|62->31|62->31|62->31|78->47|78->47|78->47|79->48|80->49|80->49|81->50|83->52|84->53|87->56|87->56|87->56
=======
                  DATE: 2023-02-26T19:49:28.350
                  SOURCE: /Users/davidberberian/Desktop/TaSystemnow/TASystem/Frontend/app/views/login.scala.html
                  HASH: c97d7e560f6c1be740b01fc570125fa0883649ef
                  MATRIX: 948->1|1068->28|2303->1237|2332->1238|2381->1259|2452->1302|2481->1303|2526->1320|2568->1334|2597->1335|2646->1356|2785->1467|2814->1468|2859->1485|2893->1491|2922->1492|2971->1513|3138->1652|3167->1653|3212->1670|3245->1675|3274->1676|3323->1697|3382->1728|3411->1729|3456->1746|3503->1765|3532->1766|3581->1787|3641->1819|3670->1820|3715->1837|3852->1946|3881->1947|3930->1968|3990->2000|4019->2001|4064->2018|4103->2029|4132->2030|4181->2051|4286->2128|4315->2129|4360->2146|4405->2163|4434->2164|4483->2185|4554->2228|4583->2229|4628->2246|4658->2248|4687->2249|4736->2270|4839->2345|4868->2346|4913->2363|4944->2366|4973->2367|5023->2389|5360->2698|5389->2699|5425->2708|5829->3085|5844->3091|5895->3121|6489->3688|6525->3715|6565->3717|6626->3750|6733->3830|6770->3846|6831->3879|6935->3952|6992->3981|7442->4404|7457->4410|7502->4434|7664->4683|7734->4724|7772->4734|7788->4740|7834->4764
                  LINES: 28->1|33->2|51->20|51->20|52->21|53->22|53->22|54->23|54->23|54->23|55->24|58->27|58->27|59->28|59->28|59->28|60->29|63->32|63->32|64->33|64->33|64->33|65->34|66->35|66->35|67->36|67->36|67->36|68->37|69->38|69->38|70->39|71->40|71->40|72->41|73->42|73->42|74->43|74->43|74->43|75->44|77->46|77->46|78->47|78->47|78->47|79->48|80->49|80->49|81->50|81->50|81->50|82->51|84->53|84->53|85->54|85->54|85->54|87->56|95->64|95->64|96->65|108->77|108->77|108->77|117->86|117->86|117->86|118->87|119->88|119->88|120->89|122->91|123->92|130->99|130->99|130->99|133->102|134->103|134->103|134->103|134->103
>>>>>>> Stashed changes
                  -- GENERATED --
              */
          