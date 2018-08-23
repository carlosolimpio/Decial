
// @GENERATOR:play-routes-compiler
// @SOURCE:C:/Users/tamir/Documents/Java/Decial/Servidor/DecialServidor/conf/routes
// @DATE:Thu Aug 23 13:21:44 BRT 2018

package controllers;

import router.RoutesPrefix;

public class routes {
  
  public static final controllers.ReversePontoRiscoController PontoRiscoController = new controllers.ReversePontoRiscoController(RoutesPrefix.byNamePrefix());
  public static final controllers.ReverseAssets Assets = new controllers.ReverseAssets(RoutesPrefix.byNamePrefix());
  public static final controllers.ReverseUsuarioController UsuarioController = new controllers.ReverseUsuarioController(RoutesPrefix.byNamePrefix());

  public static class javascript {
    
    public static final controllers.javascript.ReversePontoRiscoController PontoRiscoController = new controllers.javascript.ReversePontoRiscoController(RoutesPrefix.byNamePrefix());
    public static final controllers.javascript.ReverseAssets Assets = new controllers.javascript.ReverseAssets(RoutesPrefix.byNamePrefix());
    public static final controllers.javascript.ReverseUsuarioController UsuarioController = new controllers.javascript.ReverseUsuarioController(RoutesPrefix.byNamePrefix());
  }

}
