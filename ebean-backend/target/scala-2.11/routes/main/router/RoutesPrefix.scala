
// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/seangrady/Desktop/CS4345/Lab-2-Ebean/ebean-backend/conf/routes
// @DATE:Sun Feb 19 21:39:57 CST 2023


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
