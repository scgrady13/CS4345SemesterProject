// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/seangrady/Desktop/CS4345/CS4345SemesterProject/Frontend/conf/routes
// @DATE:Mon Feb 20 19:45:38 CST 2023


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
