package controllers;

import java.awt.image.BufferedImage;
import java.util.List;

import com.fasterxml.jackson.databind.JsonNode;

import enums.TIPOUSUARIO;
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
	
	public Result getById(Long id)
	{
		Usuario usuario = UsuarioService.getUsuarioID(id);
		return ok(Json.toJson(usuario));
	}
	
	public Result getAllExterno()
	{
		List<Usuario> usuario = UsuarioService.getByTipoUsuario(TIPOUSUARIO.COMUM);
		return ok(Json.toJson(usuario));
	}
	
	public Result getAllAdmin()
	{
		List<Usuario> usuario = UsuarioService.getByTipoUsuario(TIPOUSUARIO.ADM);
		return ok(Json.toJson(usuario));
	}
	
	
	public Result update(Long id, String login, String senha,String email, String nome, String sobreNome, String rua, String cidade, String pais, String cep, Integer tipo, String sobreMim, String caminhoImagem)
	{
		JsonNode resultado = request().body().asJson();
		
		//String login = resultado.get("login").asText();
		//String senha = resultado.get("senha").asText();
		//String email = resultado.get("email").asText();
		//String nome = resultado.get("nome").asText();
		//String sobreNome = resultado.get("sobreNome").asText();
		//String rua = resultado.get("rua").asText();
		//String cidade =  resultado.get("cidade").asText();
		//String pais = resultado.get("pais").asText();
		//String cep= resultado.get("cep").asText();
		//int tipo =  resultado.get("tipo").asInt();
		TIPOUSUARIO tipoUsuario = TIPOUSUARIO.values()[tipo];
		//String caminhoImagem = resultado.get("caminhhoImagem").asText();
		//String sobreMim = resultado.get("sobreMim").asText();
		
		
		Usuario usuario = UsuarioService.getUsuarioID(id);
		
		if(usuario == null)
			return ok(Json.toJson(new Usuario()));;
		
		usuario.setLogin(login);
		usuario.setSenha(senha);
		usuario.setEmail(email);
		usuario.setNome(nome);
		usuario.setSobreNome(sobreNome);
		usuario.setRua(rua);
		usuario.setCidade(cidade);
		usuario.setPais(pais);
		usuario.setCep(cep);
		usuario.setTipo(tipoUsuario);
		usuario.setCaminhoImagem(caminhoImagem);
		usuario.setSobreMim(sobreMim);
		usuario.save();
		return ok(Json.toJson(usuario));
	}
	
	public Result delete(Long id)
	{
		Usuario usuario = UsuarioService.getUsuarioID(id);
		
		if(usuario == null)
			return null;
		
		usuario.delete();
		return ok(Json.toJson(usuario));
	}
	
	
	
	public Result save(String login, String senha,String email, String nome, String sobreNome, String rua, String cidade, String pais, String cep, Integer tipo, String sobreMim, String caminhoImagem)
	{
		//JsonNode resultado = request().body().asJson();
		
		try{
			
			//String login = resultado.get("login").asText();
			//String senha = resultado.get("senha").asText();
			//String email = resultado.get("email").asText();
			//String nome = resultado.get("nome").asText();
			//String sobreNome = resultado.get("sobreNome").asText();
			//String rua = resultado.get("rua").asText();
			//String cidade =  resultado.get("cidade").asText();
		//	String pais = resultado.get("pais").asText();
			//String cep= resultado.get("cep").asText();
			//int tipo =  resultado.get("tipo").asInt();
			TIPOUSUARIO tipoUsuario = TIPOUSUARIO.values()[tipo];
			//String sobreMim = resultado.get("sobreMim").asText();
			//String caminhoImagem = resultado.get("caminhhoImagem").asText();
			Usuario usuario = new Usuario(login, senha, email, nome, sobreNome, rua, cidade, pais, cep, tipoUsuario, sobreMim, caminhoImagem);
			
			usuario.save();
			
			
			return ok(Json.toJson(usuario));
			
		} catch (Exception e) {
			return null;
		}
		
		
	}
	
	
	public Result login(String login, String senha)
	{
		//JsonNode resultado = request().body().asJson();
		
		//String login = "ramices"; //= resultado.get("login").asText();
		//String senha = "12345";//= resultado.get("senha").asText();
		
		Usuario usuario = UsuarioService.login(login, senha);
		
		if(usuario== null)
		{
			return ok(Json.toJson(new Usuario()));
		}
		return ok(Json.toJson(usuario));
		
	}

}
