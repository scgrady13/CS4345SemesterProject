
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object info_Scope0 {
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import java.lang._
import java.util._
import scala.collection.JavaConversions._
import scala.collection.JavaConverters._
import play.core.j.PlayMagicForJava._
import play.mvc._
import play.data._
import play.api.data.Field
import play.mvc.Http.Context.Implicit._

class info extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[Seq[String],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(infoMessages: Seq[String]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.29*/("""
"""),format.raw/*2.1*/("""<!DOCTYPE html>
<html>
    <body>
        <header class = "topbar">
            <h1 class="focused" style="font-size: 37px;
                color = #57a957">
                <strong>User Info</strong>
            </h1>
        </header>
        """),_display_(/*11.10*/for(infoMessage <- infoMessages) yield /*11.42*/ {_display_(Seq[Any](format.raw/*11.44*/("""
            """),format.raw/*12.13*/("""<li>"""),_display_(/*12.18*/infoMessage),format.raw/*12.29*/("""</li>
        """)))}),format.raw/*13.10*/("""
    """),format.raw/*14.5*/("""</body>
</html>"""))
      }
    }
  }

  def render(infoMessages:Seq[String]): play.twirl.api.HtmlFormat.Appendable = apply(infoMessages)

  def f:((Seq[String]) => play.twirl.api.HtmlFormat.Appendable) = (infoMessages) => apply(infoMessages)

  def ref: this.type = this

}


}

/**/
object info extends info_Scope0.info
              /*
                  -- GENERATED --
                  DATE: Mon Feb 20 20:09:59 CST 2023
                  SOURCE: /Users/seangrady/Desktop/CS4345/CS4345SemesterProject/ebean-backend/app/views/info.scala.html
                  HASH: 7faec36c93dad7c8e466df254387dbc0485e0e75
                  MATRIX: 748->1|870->28|897->29|1170->275|1218->307|1258->309|1299->322|1331->327|1363->338|1409->353|1441->358
                  LINES: 27->1|32->1|33->2|42->11|42->11|42->11|43->12|43->12|43->12|44->13|45->14
                  -- GENERATED --
              */
          