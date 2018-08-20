
// @GENERATOR:play-routes-compiler
// @SOURCE:C:/xampp/htdocs/ProjetoWeb/Servidor/DecialServidor/conf/routes
// @DATE:Sun Aug 19 21:08:57 BRT 2018

package router

import play.core.routing._
import play.core.routing.HandlerInvokerFactory._
import play.core.j._

import play.api.mvc._

import _root_.controllers.Assets.Asset
import _root_.play.libs.F

class Routes(
  override val errorHandler: play.api.http.HttpErrorHandler, 
  // @LINE:8
  Assets_0: controllers.Assets,
  // @LINE:11
  UsuarioController_1: javax.inject.Provider[controllers.UsuarioController],
  val prefix: String
) extends GeneratedRouter {

   @javax.inject.Inject()
   def this(errorHandler: play.api.http.HttpErrorHandler,
    // @LINE:8
    Assets_0: controllers.Assets,
    // @LINE:11
    UsuarioController_1: javax.inject.Provider[controllers.UsuarioController]
  ) = this(errorHandler, Assets_0, UsuarioController_1, "/")

  import ReverseRouteContext.empty

  def withPrefix(prefix: String): Routes = {
    router.RoutesPrefix.setPrefix(prefix)
    new Routes(errorHandler, Assets_0, UsuarioController_1, prefix)
  }

  private[this] val defaultPrefix: String = {
    if (this.prefix.endsWith("/")) "" else "/"
  }

  def documentation = List(
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """assets/""" + "$" + """file<.+>""", """controllers.Assets.versioned(path:String = "/public", file:Asset)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """usuarios""", """@controllers.UsuarioController@.getAll()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """usuarios/""" + "$" + """id<[^/]+>""", """@controllers.UsuarioController@.getById(id:Long)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """usuarios""", """@controllers.UsuarioController@.save()"""),
    ("""PUT""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """usuarios/""" + "$" + """id<[^/]+>""", """@controllers.UsuarioController@.update(id:Long)"""),
    ("""DELETE""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """usuarios/""" + "$" + """id<[^/]+>""", """@controllers.UsuarioController@.delete(id:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """usuarios_admin""", """@controllers.UsuarioController@.getAllAdmin()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """usuarios_externo""", """@controllers.UsuarioController@.getAllExterno()"""),
    Nil
  ).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
    case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
    case l => s ++ l.asInstanceOf[List[(String,String,String)]]
  }}


  // @LINE:8
  private[this] lazy val controllers_Assets_versioned0_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("assets/"), DynamicPart("file", """.+""",false)))
  )
  private[this] lazy val controllers_Assets_versioned0_invoker = createInvoker(
    Assets_0.versioned(fakeValue[String], fakeValue[Asset]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Assets",
      "versioned",
      Seq(classOf[String], classOf[Asset]),
      "GET",
      """ Map static resources from the /public folder to the /assets URL path""",
      this.prefix + """assets/""" + "$" + """file<.+>"""
    )
  )

  // @LINE:11
  private[this] lazy val controllers_UsuarioController_getAll1_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("usuarios")))
  )
  private[this] lazy val controllers_UsuarioController_getAll1_invoker = createInvoker(
    UsuarioController_1.get.getAll(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.UsuarioController",
      "getAll",
      Nil,
      "GET",
      """Usuarios""",
      this.prefix + """usuarios"""
    )
  )

  // @LINE:12
  private[this] lazy val controllers_UsuarioController_getById2_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("usuarios/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_UsuarioController_getById2_invoker = createInvoker(
    UsuarioController_1.get.getById(fakeValue[Long]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.UsuarioController",
      "getById",
      Seq(classOf[Long]),
      "GET",
      """""",
      this.prefix + """usuarios/""" + "$" + """id<[^/]+>"""
    )
  )

  // @LINE:13
  private[this] lazy val controllers_UsuarioController_save3_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("usuarios")))
  )
  private[this] lazy val controllers_UsuarioController_save3_invoker = createInvoker(
    UsuarioController_1.get.save(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.UsuarioController",
      "save",
      Nil,
      "POST",
      """""",
      this.prefix + """usuarios"""
    )
  )

  // @LINE:14
  private[this] lazy val controllers_UsuarioController_update4_route = Route("PUT",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("usuarios/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_UsuarioController_update4_invoker = createInvoker(
    UsuarioController_1.get.update(fakeValue[Long]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.UsuarioController",
      "update",
      Seq(classOf[Long]),
      "PUT",
      """""",
      this.prefix + """usuarios/""" + "$" + """id<[^/]+>"""
    )
  )

  // @LINE:15
  private[this] lazy val controllers_UsuarioController_delete5_route = Route("DELETE",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("usuarios/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_UsuarioController_delete5_invoker = createInvoker(
    UsuarioController_1.get.delete(fakeValue[Long]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.UsuarioController",
      "delete",
      Seq(classOf[Long]),
      "DELETE",
      """""",
      this.prefix + """usuarios/""" + "$" + """id<[^/]+>"""
    )
  )

  // @LINE:16
  private[this] lazy val controllers_UsuarioController_getAllAdmin6_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("usuarios_admin")))
  )
  private[this] lazy val controllers_UsuarioController_getAllAdmin6_invoker = createInvoker(
    UsuarioController_1.get.getAllAdmin(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.UsuarioController",
      "getAllAdmin",
      Nil,
      "GET",
      """""",
      this.prefix + """usuarios_admin"""
    )
  )

  // @LINE:17
  private[this] lazy val controllers_UsuarioController_getAllExterno7_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("usuarios_externo")))
  )
  private[this] lazy val controllers_UsuarioController_getAllExterno7_invoker = createInvoker(
    UsuarioController_1.get.getAllExterno(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.UsuarioController",
      "getAllExterno",
      Nil,
      "GET",
      """""",
      this.prefix + """usuarios_externo"""
    )
  )


  def routes: PartialFunction[RequestHeader, Handler] = {
  
    // @LINE:8
    case controllers_Assets_versioned0_route(params) =>
      call(Param[String]("path", Right("/public")), params.fromPath[Asset]("file", None)) { (path, file) =>
        controllers_Assets_versioned0_invoker.call(Assets_0.versioned(path, file))
      }
  
    // @LINE:11
    case controllers_UsuarioController_getAll1_route(params) =>
      call { 
        controllers_UsuarioController_getAll1_invoker.call(UsuarioController_1.get.getAll())
      }
  
    // @LINE:12
    case controllers_UsuarioController_getById2_route(params) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_UsuarioController_getById2_invoker.call(UsuarioController_1.get.getById(id))
      }
  
    // @LINE:13
    case controllers_UsuarioController_save3_route(params) =>
      call { 
        controllers_UsuarioController_save3_invoker.call(UsuarioController_1.get.save())
      }
  
    // @LINE:14
    case controllers_UsuarioController_update4_route(params) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_UsuarioController_update4_invoker.call(UsuarioController_1.get.update(id))
      }
  
    // @LINE:15
    case controllers_UsuarioController_delete5_route(params) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_UsuarioController_delete5_invoker.call(UsuarioController_1.get.delete(id))
      }
  
    // @LINE:16
    case controllers_UsuarioController_getAllAdmin6_route(params) =>
      call { 
        controllers_UsuarioController_getAllAdmin6_invoker.call(UsuarioController_1.get.getAllAdmin())
      }
  
    // @LINE:17
    case controllers_UsuarioController_getAllExterno7_route(params) =>
      call { 
        controllers_UsuarioController_getAllExterno7_invoker.call(UsuarioController_1.get.getAllExterno())
      }
  }
}
