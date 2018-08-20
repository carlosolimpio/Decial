
// @GENERATOR:play-routes-compiler
// @SOURCE:C:/xampp/htdocs/ProjetoWeb/Servidor/DecialServidor/conf/routes
// @DATE:Sun Aug 19 21:08:57 BRT 2018

import play.api.mvc.{ QueryStringBindable, PathBindable, Call, JavascriptLiteral }
import play.core.routing.{ HandlerDef, ReverseRouteContext, queryString, dynamicString }


import _root_.controllers.Assets.Asset
import _root_.play.libs.F

// @LINE:8
package controllers {

  // @LINE:8
  class ReverseAssets(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:8
    def versioned(file:Asset): Call = {
      implicit val _rrc = new ReverseRouteContext(Map(("path", "/public")))
      Call("GET", _prefix + { _defaultPrefix } + "assets/" + implicitly[PathBindable[Asset]].unbind("file", file))
    }
  
  }

  // @LINE:11
  class ReverseUsuarioController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:15
    def delete(id:Long): Call = {
      import ReverseRouteContext.empty
      Call("DELETE", _prefix + { _defaultPrefix } + "usuarios/" + implicitly[PathBindable[Long]].unbind("id", id))
    }
  
    // @LINE:14
    def update(id:Long): Call = {
      import ReverseRouteContext.empty
      Call("PUT", _prefix + { _defaultPrefix } + "usuarios/" + implicitly[PathBindable[Long]].unbind("id", id))
    }
  
    // @LINE:11
    def getAll(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "usuarios")
    }
  
    // @LINE:17
    def getAllExterno(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "usuarios_externo")
    }
  
    // @LINE:12
    def getById(id:Long): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "usuarios/" + implicitly[PathBindable[Long]].unbind("id", id))
    }
  
    // @LINE:16
    def getAllAdmin(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "usuarios_admin")
    }
  
    // @LINE:13
    def save(): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "usuarios")
    }
  
  }


}
