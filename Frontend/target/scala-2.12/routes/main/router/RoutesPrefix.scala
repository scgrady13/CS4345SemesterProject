// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/davidberberian/Desktop/TaSystemnow/TASystem/Frontend/conf/routes
// @DATE:Tue Mar 07 23:36:04 CST 2023


package router {
  object RoutesPrefix {
    private var _prefix: String = "/"
    def setPrefix(p: String): Unit = {
      _prefix = p
    }
    def prefix: String = _prefix
    val byNamePrefix: Function0[String] = { () => prefix }
  }
}
