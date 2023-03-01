
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

object securityCheck extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(authorizeMessage: String):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
/*2.2*/import java.math.BigInteger;var i = 0


Seq[Any](format.raw/*3.1*/("""<!DOCTYPE html>
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
                body """),format.raw/*21.22*/("""{"""),format.raw/*21.23*/("""
                    """),format.raw/*22.21*/("""background-color: #e6e6e6;
                """),format.raw/*23.17*/("""}"""),format.raw/*23.18*/("""
                """),format.raw/*24.17*/("""header.topbar """),format.raw/*24.31*/("""{"""),format.raw/*24.32*/("""
                    """),format.raw/*25.21*/("""background-color: #4a4e4d;
                    padding: 10px;
                    color: #fff;
                """),format.raw/*28.17*/("""}"""),format.raw/*28.18*/("""
                """),format.raw/*29.17*/(""".card """),format.raw/*29.23*/("""{"""),format.raw/*29.24*/("""
                    """),format.raw/*30.21*/("""margin-top: 50px;
                    border-radius: 10px;
                    box-shadow: 0 10px 20px rgba(0, 0, 0, 0.2);
                """),format.raw/*33.17*/("""}"""),format.raw/*33.18*/("""
                """),format.raw/*34.17*/("""form """),format.raw/*34.22*/("""{"""),format.raw/*34.23*/("""
                    """),format.raw/*35.21*/("""padding: 5px;
                """),format.raw/*36.17*/("""}"""),format.raw/*36.18*/("""
                """),format.raw/*37.17*/(""".input-field label """),format.raw/*37.36*/("""{"""),format.raw/*37.37*/("""
                    """),format.raw/*38.21*/("""color: #4a4e4d;
                """),format.raw/*39.17*/("""}"""),format.raw/*39.18*/("""
                """),format.raw/*40.17*/(""".input-field input[type=text]:focus + label,
               """),format.raw/*41.16*/("""{"""),format.raw/*41.17*/("""
                    """),format.raw/*42.21*/("""color: #4a4e4d;
                """),format.raw/*43.17*/("""}"""),format.raw/*43.18*/("""
                """),format.raw/*44.17*/("""button.btn """),format.raw/*44.28*/("""{"""),format.raw/*44.29*/("""
                    """),format.raw/*45.21*/("""background-color: #4a4e4d;
                    border: none;
                """),format.raw/*47.17*/("""}"""),format.raw/*47.18*/("""
                """),format.raw/*48.17*/("""button.btn:hover """),format.raw/*48.34*/("""{"""),format.raw/*48.35*/("""
                    """),format.raw/*49.21*/("""background-color: #3F51B5;
                """),format.raw/*50.17*/("""}"""),format.raw/*50.18*/("""
                """),format.raw/*51.17*/("""a """),format.raw/*51.19*/("""{"""),format.raw/*51.20*/("""
                    """),format.raw/*52.21*/("""color: #4a4e4d;
                    text-decoration: none;
                """),format.raw/*54.17*/("""}"""),format.raw/*54.18*/("""
                """),format.raw/*55.17*/("""h1 """),format.raw/*55.20*/("""{"""),format.raw/*55.21*/("""

                    """),format.raw/*57.21*/("""font-family: Arial, sans-serif;
                    font-size: 24px;
                    font-weight: bold;
                    margin: 0 auto;
                    padding: 0;
                    text-align: center;
                    margin-top: 5px;
                    margin-bottom 15px;
                """),format.raw/*65.17*/("""}"""),format.raw/*65.18*/("""
        """),format.raw/*66.9*/("""</style>
    </head>
    <body>

        <header class="topbar">
            <h1 class="center-align"><strong>Security Check</strong></h1>
        </header>

        <div class="container">
            <div class="row">
                <div class="card col s12 m6 offset-m3 l4 offset-l4">
                    <div class="card-content">
                        <form action=""""),_display_(/*78.40*/routes/*78.46*/.HomeController.loginHandler()),format.raw/*78.76*/("""" method="GET">
                            <div class="input-field">
                                <input id="secAnswer1" name="secAnswer1" type="text" class="validate">
                                <label for="secAnswer1">What was the name of your first pet?</label>
                            </div>
                            <div class="input-field">
                                <input id="secAnswer2" name="secAnswer2" type="text" class="validate">
                                <label for="secAnswer2">What is your hometown?</label>
                            </div>
                            """),_display_(/*87.30*/if(authorizeMessage!= null)/*87.57*/ {_display_(Seq[Any](format.raw/*87.59*/("""
                                """),format.raw/*88.33*/("""<div class="alert alert-primary" role="alert">
                                """),_display_(/*89.34*/authorizeMessage),format.raw/*89.50*/("""
                                """),format.raw/*90.33*/("""</div>
                                <br>
                            """)))}),format.raw/*92.30*/("""
                            """),format.raw/*93.29*/("""<div class="center-align">
                                <button id="api-search-button" class="btn" type="submit">
                                    <a href=""""),_display_(/*95.47*/routes/*95.53*/.HomeController.passwordReset()),format.raw/*95.84*/("""">
                                        Submit
                                    </a>
                                </button>
                            </div>
                            <br>
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
                  DATE: 2023-03-01T11:39:32.169
                  SOURCE: /Users/kendalllboesch/Desktop/Current/CS4345-SoftwareEngineering/SemProject/TAScheduler/Frontend/app/views/securityCheck.scala.html
                  HASH: ff45626561f225d55392a9f7fa270d2c10434660
                  MATRIX: 956->1|1055->29|1121->67|2356->1276|2385->1277|2434->1298|2505->1341|2534->1342|2579->1359|2621->1373|2650->1374|2699->1395|2838->1506|2867->1507|2912->1524|2946->1530|2975->1531|3024->1552|3191->1691|3220->1692|3265->1709|3298->1714|3327->1715|3376->1736|3434->1766|3463->1767|3508->1784|3555->1803|3584->1804|3633->1825|3693->1857|3722->1858|3767->1875|3855->1935|3884->1936|3933->1957|3993->1989|4022->1990|4067->2007|4106->2018|4135->2019|4184->2040|4289->2117|4318->2118|4363->2135|4408->2152|4437->2153|4486->2174|4557->2217|4586->2218|4631->2235|4661->2237|4690->2238|4739->2259|4842->2334|4871->2335|4916->2352|4947->2355|4976->2356|5026->2378|5363->2687|5392->2688|5428->2697|5830->3072|5845->3078|5896->3108|6540->3725|6576->3752|6616->3754|6677->3787|6784->3867|6821->3883|6882->3916|6986->3989|7043->4018|7233->4181|7248->4187|7300->4218
                  LINES: 28->1|31->2|34->3|52->21|52->21|53->22|54->23|54->23|55->24|55->24|55->24|56->25|59->28|59->28|60->29|60->29|60->29|61->30|64->33|64->33|65->34|65->34|65->34|66->35|67->36|67->36|68->37|68->37|68->37|69->38|70->39|70->39|71->40|72->41|72->41|73->42|74->43|74->43|75->44|75->44|75->44|76->45|78->47|78->47|79->48|79->48|79->48|80->49|81->50|81->50|82->51|82->51|82->51|83->52|85->54|85->54|86->55|86->55|86->55|88->57|96->65|96->65|97->66|109->78|109->78|109->78|118->87|118->87|118->87|119->88|120->89|120->89|121->90|123->92|124->93|126->95|126->95|126->95
                  -- GENERATED --
              */
          