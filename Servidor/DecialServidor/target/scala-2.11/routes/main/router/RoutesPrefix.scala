
// @GENERATOR:play-routes-compiler
// @SOURCE:C:/xampp/htdocs/ProjetoWeb/Servidor/DecialServidor/conf/routes
// @DATE:Sun Aug 19 21:08:57 BRT 2018


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
