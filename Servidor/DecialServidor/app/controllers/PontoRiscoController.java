package controllers;

import java.util.List;

import interceptors.ApiInterceptor;
import models.PontoRisco;
import play.libs.Json;
import play.mvc.Controller;
import play.mvc.Result;
import services.PontoRiscoService;

@play.mvc.With({ ApiInterceptor.class })
public class PontoRiscoController extends Controller {
	
	
	public Result getAll()
	{
		List<PontoRisco> lpr = PontoRiscoService.getAll();
		
		return ok(Json.toJson(lpr));
	}
	
}
