
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

object index extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(message: String):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
/*2.6*/import java.math.BigInteger;var i = 0


Seq[Any](format.raw/*2.1*/("""    """),format.raw/*3.1*/("""
"""),format.raw/*4.1*/("""<!DOCTYPE html>
<html>


    <head>
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
        <title>User Portal</title>
        <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/materialize/1.0.0/css/materialize.min.css">

            <!-- Compiled and minified JavaScript -->
        <script src="https://cdnjs.cloudflare.com/ajax/libs/materialize/1.0.0/js/materialize.min.js"></script>
        <link rel="shortcut icon" type="image/x-icon" href="docs/images/favicon.ico" />
        <link rel="stylesheet" href="https://unpkg.com/leaflet@1.5.1/dist/leaflet.css" integrity="sha512-xwE/Az9zrjBIphAcBb3F6JVqxf46+CDLwfLMHloNu6KEQCAWi6HcDUbeOfBIptF7tcCzusKFjFw2yuvEpDL9wQ==" crossorigin=""/>
        <script src="https://unpkg.com/leaflet@1.5.1/dist/leaflet.js" integrity="sha512-GffPMF3RvMeYyc1LWMHtK8EbPv0iNZ8/oTtHPx9/cc2ILxQ+u905qIwdpULaqDkyBKgOaB57QTMg7ztg8Jm2Og==" crossorigin=""></script>
        <title>Student Portal</title>
        <style>
                /* Add some basic styling for the page */
                body """),format.raw/*23.22*/("""{"""),format.raw/*23.23*/("""
                    """),format.raw/*24.21*/("""font-family: Arial, sans-serif;
                    background-color: #f7f7f7;
                    text-align: center;
                """),format.raw/*27.17*/("""}"""),format.raw/*27.18*/("""

                """),format.raw/*29.17*/("""header.topbar """),format.raw/*29.31*/("""{"""),format.raw/*29.32*/("""
                    """),format.raw/*30.21*/("""background-color: #4a4e4d;
                    padding: 10px;
                    color: #fff;
                    font-family: Arial, sans-serif;
                """),format.raw/*34.17*/("""}"""),format.raw/*34.18*/("""

                """),format.raw/*36.17*/("""h1 """),format.raw/*36.20*/("""{"""),format.raw/*36.21*/("""
                    """),format.raw/*37.21*/("""font-size: 40px;
                    margin: 0;
                    padding: 0;
                """),format.raw/*40.17*/("""}"""),format.raw/*40.18*/("""

                """),format.raw/*42.17*/("""p """),format.raw/*42.19*/("""{"""),format.raw/*42.20*/("""
                    """),format.raw/*43.21*/("""font-size: 16px;
                    margin: 0;
                    padding: 0;
                """),format.raw/*46.17*/("""}"""),format.raw/*46.18*/("""

                """),format.raw/*48.17*/("""ul """),format.raw/*48.20*/("""{"""),format.raw/*48.21*/("""
                    """),format.raw/*49.21*/("""list-style-type: none;
                    padding: 0;
                """),format.raw/*51.17*/("""}"""),format.raw/*51.18*/("""

                """),format.raw/*53.17*/("""li """),format.raw/*53.20*/("""{"""),format.raw/*53.21*/("""
                    """),format.raw/*54.21*/("""margin: 10px;
                    padding: 10px;
                    background-color: #fff;
                    border none;
                    border-radius: 5px;
                    box-shadow: 0px 2px 5px rgba(0, 0, 0, 0.2);
                    display: flex;
                    align-items: center;
                    justify-content: space-between;
                    width: 100%;
                    /*border: 1px solid #ccc;*/
                """),format.raw/*65.17*/("""}"""),format.raw/*65.18*/("""
                """),format.raw/*66.17*/("""input[type="submit"] """),format.raw/*66.38*/("""{"""),format.raw/*66.39*/("""
                    """),format.raw/*67.21*/("""background-color: #4a4e4d;
                    color: white;
                    padding: 10px 20px;
                    border: none;
                    border-radius: 5px;
                    cursor: pointer;
                    transition: background-color 0.3s ease;
                """),format.raw/*74.17*/("""}"""),format.raw/*74.18*/("""
                """),format.raw/*75.17*/("""input[type="submit"]:hover """),format.raw/*75.44*/("""{"""),format.raw/*75.45*/("""
                    """),format.raw/*76.21*/("""background-color: #3F51B5;
                """),format.raw/*77.17*/("""}"""),format.raw/*77.18*/("""

                """),format.raw/*79.17*/(""".card """),format.raw/*79.23*/("""{"""),format.raw/*79.24*/("""
                    """),format.raw/*80.21*/("""display: flex;
                    align-items: center;
                    justify-content: space-between;
                    border none;
                    width: 100%;
                    padding: 10px;
                    margin: 10px;
                """),format.raw/*87.17*/("""}"""),format.raw/*87.18*/("""
               """),format.raw/*88.16*/("""job-title """),format.raw/*88.26*/("""{"""),format.raw/*88.27*/("""
                    """),format.raw/*89.21*/("""border none;
                    flex-basis: 30%;
                    text-align: left;
                """),format.raw/*92.17*/("""}"""),format.raw/*92.18*/("""

                """),format.raw/*94.17*/("""job-description """),format.raw/*94.33*/("""{"""),format.raw/*94.34*/("""
                    """),format.raw/*95.21*/("""border none;
                    flex-basis: 60%;
                    text-align: center;
                """),format.raw/*98.17*/("""}"""),format.raw/*98.18*/("""

                """),format.raw/*100.17*/("""job-apply """),format.raw/*100.27*/("""{"""),format.raw/*100.28*/("""
                    """),format.raw/*101.21*/("""border none;
                    flex-basis: 10%;
                    text-align: right;
                """),format.raw/*104.17*/("""}"""),format.raw/*104.18*/("""
        """),format.raw/*105.9*/("""</style>
    </head>

    <body>
        <header class="topbar">
            <p>"""),_display_(/*110.17*/(message + "!")),format.raw/*110.32*/("""</p>
        </header>
        <br>
        <div style="display:flex;justify-content:space-between;margin-left:10px">
            <div style="display:flex;align-items:center">
                <div class="job-apply">
                    <form action="#" method="post">
                        <input type="submit" value="Log Out" />
                    </form>
                </div>
                """),format.raw/*120.115*/("""
            """),format.raw/*121.13*/("""</div>
            <div style="display:flex;align-items:center;margin-right:10px">
                <div class="job-apply">
                    <form action="#" method="post">
                        <input type="submit" value="Current Applications" />
                    </form>
                </div>
                """),format.raw/*128.128*/("""
            """),format.raw/*129.13*/("""</div>
        </div>
        <ul>
            <li>
                <div class="card">
                    <div class="job-title">
                        <h6>CS1341</h6>
                    </div>
                    <div class="job-description">
                        <p>Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed vestibulum tortor vitae ultricies sodales.</p>
                    </div>
                    <div class="job-apply">
                        <form action="#" method="post">
                            <input type="submit" value="Apply" />
                        </form>
                    </div>
                </div>
            </li>

            <li>
                <div class="card">
                    <div class="job-title">
                        <h6>CS2342</h6>
                    </div>
                    <div class="job-description">
                        <p>Integer posuere erat a ante venenatis dapibus posuere velit aliquet.</p>
                    </div>
                    <div class="job-apply">
                        <form action="#" method="post">
                            <input type="submit" value="Apply" />
                        </form>
                    </div>
                </div>
            </li>
        </ul>
    </body>
</html>
"""))
      }
    }
  }

  def render(message:String): play.twirl.api.HtmlFormat.Appendable = apply(message)

  def f:((String) => play.twirl.api.HtmlFormat.Appendable) = (message) => apply(message)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: 2023-02-24T13:37:21.466
                  SOURCE: /Users/seangrady/Desktop/CS4345/CS4345SemesterProject/Frontend/app/views/index.scala.html
                  HASH: 52371a00317ea7ca56954a24a500e93bfb8d0786
                  MATRIX: 948->1|1038->24|1104->19|1134->62|1161->63|2497->1373|2526->1374|2575->1395|2738->1530|2767->1531|2813->1549|2855->1563|2884->1564|2933->1585|3124->1748|3153->1749|3199->1767|3230->1770|3259->1771|3308->1792|3432->1888|3461->1889|3507->1907|3537->1909|3566->1910|3615->1931|3739->2027|3768->2028|3814->2046|3845->2049|3874->2050|3923->2071|4022->2142|4051->2143|4097->2161|4128->2164|4157->2165|4206->2186|4689->2641|4718->2642|4763->2659|4812->2680|4841->2681|4890->2702|5206->2990|5235->2991|5280->3008|5335->3035|5364->3036|5413->3057|5484->3100|5513->3101|5559->3119|5593->3125|5622->3126|5671->3147|5958->3406|5987->3407|6031->3423|6069->3433|6098->3434|6147->3455|6279->3559|6308->3560|6354->3578|6398->3594|6427->3595|6476->3616|6610->3722|6639->3723|6686->3741|6725->3751|6755->3752|6805->3773|6939->3878|6969->3879|7006->3888|7115->3969|7152->3984|7581->4481|7623->4494|7972->4924|8014->4937
                  LINES: 28->1|31->2|34->2|34->3|35->4|54->23|54->23|55->24|58->27|58->27|60->29|60->29|60->29|61->30|65->34|65->34|67->36|67->36|67->36|68->37|71->40|71->40|73->42|73->42|73->42|74->43|77->46|77->46|79->48|79->48|79->48|80->49|82->51|82->51|84->53|84->53|84->53|85->54|96->65|96->65|97->66|97->66|97->66|98->67|105->74|105->74|106->75|106->75|106->75|107->76|108->77|108->77|110->79|110->79|110->79|111->80|118->87|118->87|119->88|119->88|119->88|120->89|123->92|123->92|125->94|125->94|125->94|126->95|129->98|129->98|131->100|131->100|131->100|132->101|135->104|135->104|136->105|141->110|141->110|151->120|152->121|159->128|160->129
                  -- GENERATED --
              */
          