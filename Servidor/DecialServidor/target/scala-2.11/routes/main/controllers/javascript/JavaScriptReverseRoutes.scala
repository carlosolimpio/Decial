
// @GENERATOR:play-routes-compiler
// @SOURCE:C:/xampp/htdocs/ProjetoWeb/Servidor/DecialServidor/conf/routes
// @DATE:Sun Aug 19 21:08:57 BRT 2018

import play.api.routing.JavaScriptReverseRoute
import play.api.mvc.{ QueryStringBindable, PathBindable, Call, JavascriptLiteral }
import play.core.routing.{ HandlerDef, ReverseRouteContext, queryString, dynamicString }


import _root_.controllers.Assets.Asset
import _root_.play.libs.F

// @LINE:8
package controllers.javascript {
  import ReverseRouteContext.empty

  // @LINE:8
  class ReverseAssets(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:8
    def versioned: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Assets.versioned",
      """
        function(file1) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "assets/" + (""" + implicitly[PathBindable[Asset]].javascriptUnbind + """)("file", file1)})
        }
      """
    )
  
  }

  // @LINE:11
  class ReverseUsuarioController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:15
    def delete: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.UsuarioController.delete",
      """
        function(id0) {
          return _wA({method:"DELETE", url:"""" + _prefix + { _defaultPrefix } + """" + "usuarios/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id0)})
        }
      """
    )
  
    // @LINE:14
    def update: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.UsuarioController.update",
      """
        function(id0) {
          return _wA({method:"PUT", url:"""" + _prefix + { _defaultPrefix } + """" + "usuarios/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id0)})
        }
      """
    )
  
    // @LINE:11
    def getAll: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.UsuarioController.getAll",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "usuarios"})
        }
      """
    )
  
    // @LINE:17
    def getAllExterno: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.UsuarioController.getAllExterno",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "usuarios_externo"})
        }
      """
    )
  
    // @LINE:12
    def getById: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.UsuarioController.getById",
      """
        function(id0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "usuarios/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id0)})
        }
      """
    )
  
    // @LINE:16
    def getAllAdmin: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.UsuarioController.getAllAdmin",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "usuarios_admin"})
        }
      """
    )
  
    // @LINE:13
    def save: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.UsuarioController.save",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "usuarios"})
        }
      """
    )
  
  }


}
