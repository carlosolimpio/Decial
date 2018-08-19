package controllers;

import java.util.List;

import interceptors.ApiInterceptor;
import models.Usuario;
import play.libs.Json;
import play.mvc.Controller;
import play.mvc.Result;
import services.UsuarioService;

@play.mvc.With({ ApiInterceptor.class })
public class UsuarioController extends Controller{
	
	public Result getAll()
	{
		List<Usuario> lu = UsuarioService.getAll();
		return ok(Json.toJson(lu));
	}

}
