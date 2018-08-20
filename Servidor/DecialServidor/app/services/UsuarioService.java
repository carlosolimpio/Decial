package services;

import java.util.List;

import com.avaje.ebean.Ebean;

import enums.TIPOUSUARIO;
import models.Usuario;

public class UsuarioService {

	
	public static List<Usuario> getAll()
	{
		return Ebean.createQuery(Usuario.class).where().findList();
	}
	
	public static List<Usuario> getByTipoUsuario(TIPOUSUARIO tipo)
	{
		return Ebean.createQuery(Usuario.class).where().eq("tipo", tipo).findList();
	}
	
	public static Usuario getUsuarioID(Long id)
	{
		return Ebean.createQuery(Usuario.class).where().idEq(id).findUnique();
	}
}
