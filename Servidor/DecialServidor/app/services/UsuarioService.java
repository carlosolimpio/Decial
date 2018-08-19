package services;

import java.util.List;

import com.avaje.ebean.Ebean;

import models.Usuario;

public class UsuarioService {

	
	public static List<Usuario> getAll()
	{
		return Ebean.createQuery(Usuario.class).where().findList();
	}
}
