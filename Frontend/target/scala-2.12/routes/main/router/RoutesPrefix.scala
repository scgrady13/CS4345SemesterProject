// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/kendalllboesch/Desktop/Current/CS4345-SoftwareEngineering/SemProject/TAScheduler/Frontend/conf/routes
// @DATE:Tue Feb 28 20:53:43 CST 2023


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
