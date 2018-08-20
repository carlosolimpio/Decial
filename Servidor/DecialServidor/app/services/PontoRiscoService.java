package services;

import java.util.List;

import com.avaje.ebean.Ebean;

import models.PontoRisco;

public class PontoRiscoService {

	
	public static List<PontoRisco> getAll()
	{
		return Ebean.createQuery(PontoRisco.class).where().findList();
	}
}
