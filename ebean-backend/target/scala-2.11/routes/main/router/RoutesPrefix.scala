
// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/kendalllboesch/Desktop/Current/CS4345-SoftwareEngineering/SemProject/TAScheduler/ebean-backend/conf/routes
// @DATE:Wed Mar 01 13:15:01 CST 2023


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
