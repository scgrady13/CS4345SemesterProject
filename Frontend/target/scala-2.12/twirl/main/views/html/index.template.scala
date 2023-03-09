
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


Seq[Any](format.raw/*2.1*/("""    """),format.raw/*3.1*/("""<!DOCTYPE html>
<html>
    <body>

<<<<<<< Updated upstream
        <header class="topbar">
            <h1 class="focused" style="font-size: 37px;
                color: #57a957">
                <strong>Login Message</strong>
            </h1>
            <p class="focused" style="font-size: 20px;
                color: #3F51B5">"""),_display_(/*13.34*/message),format.raw/*13.41*/("""</p>

        </header>

=======
            <li>
                <div class="card">
                    <div class="job-title">
                        <h6>CS2342</h6>
                    </div>
                    <div class="job-description">
                        <p>Integer posuere erat a ante venenatis dapibus posuere velit aliquet.</p>
                    </div>
                    <div class="job-apply">
                        <form action=""""),_display_(/*157.40*/routes/*157.46*/.HomeController.taForm()),format.raw/*157.70*/("""" method="GET">
                            <input type="submit" value="Apply" />
                        </form>
                    </div>
                </div>
            </li>
        </ul>
>>>>>>> Stashed changes
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
<<<<<<< Updated upstream
                  DATE: 2023-02-20T19:45:39.707
                  SOURCE: /Users/seangrady/Desktop/CS4345/CS4345SemesterProject/Frontend/app/views/index.scala.html
                  HASH: 11f3681c379e97c31ea7f186c6f828467a6dffd2
                  MATRIX: 948->1|1038->24|1104->19|1134->62|1470->371|1498->378
                  LINES: 28->1|31->2|34->2|34->3|44->13|44->13
=======
                  DATE: 2023-02-26T19:57:57.089
                  SOURCE: /Users/davidberberian/Desktop/TaSystemnow/TASystem/Frontend/app/views/index.scala.html
                  HASH: a8fdb83a11e3b69807d50a65347e895de03ce785
                  MATRIX: 948->1|1038->24|1104->19|1134->62|1161->63|2497->1373|2526->1374|2575->1395|2738->1530|2767->1531|2813->1549|2855->1563|2884->1564|2933->1585|3124->1748|3153->1749|3199->1767|3230->1770|3259->1771|3308->1792|3432->1888|3461->1889|3507->1907|3537->1909|3566->1910|3615->1931|3739->2027|3768->2028|3814->2046|3845->2049|3874->2050|3923->2071|4022->2142|4051->2143|4097->2161|4128->2164|4157->2165|4206->2186|4689->2641|4718->2642|4763->2659|4812->2680|4841->2681|4890->2702|5206->2990|5235->2991|5280->3008|5335->3035|5364->3036|5413->3057|5484->3100|5513->3101|5559->3119|5593->3125|5622->3126|5671->3147|5958->3406|5987->3407|6031->3423|6069->3433|6098->3434|6147->3455|6279->3559|6308->3560|6354->3578|6398->3594|6427->3595|6476->3616|6610->3722|6639->3723|6686->3741|6725->3751|6755->3752|6805->3773|6939->3878|6969->3879|7006->3888|7115->3969|7152->3984|7581->4481|7623->4494|7972->4924|8014->4937|9142->6037|9158->6043|9204->6067
                  LINES: 28->1|31->2|34->2|34->3|35->4|54->23|54->23|55->24|58->27|58->27|60->29|60->29|60->29|61->30|65->34|65->34|67->36|67->36|67->36|68->37|71->40|71->40|73->42|73->42|73->42|74->43|77->46|77->46|79->48|79->48|79->48|80->49|82->51|82->51|84->53|84->53|84->53|85->54|96->65|96->65|97->66|97->66|97->66|98->67|105->74|105->74|106->75|106->75|106->75|107->76|108->77|108->77|110->79|110->79|110->79|111->80|118->87|118->87|119->88|119->88|119->88|120->89|123->92|123->92|125->94|125->94|125->94|126->95|129->98|129->98|131->100|131->100|131->100|132->101|135->104|135->104|136->105|141->110|141->110|151->120|152->121|159->128|160->129|188->157|188->157|188->157
>>>>>>> Stashed changes
                  -- GENERATED --
              */
          