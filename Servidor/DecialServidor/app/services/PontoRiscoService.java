package services;

import java.util.List;

import com.avaje.ebean.Ebean;

import enums.RISCO;
import models.PontoRisco;

public class PontoRiscoService {

	
	public static List<PontoRisco> getAll()
	{
		List<PontoRisco> lpr =  Ebean.createQuery(PontoRisco.class).where().findList();
		return lpr;
	}
	
	public static PontoRisco getById(Long id)
	{
		return Ebean.createQuery(PontoRisco.class).where().idEq(id).findUnique();
	}
	
	public static List<PontoRisco> getByCep(String cep)
	{
		return Ebean.createQuery(PontoRisco.class).where().eq("cep", cep).findList();
	}
	
	public static List<PontoRisco> getByRisco(RISCO risco)
	{
		return Ebean.createQuery(PontoRisco.class).where().eq("risco", risco).findList();
	}
}
