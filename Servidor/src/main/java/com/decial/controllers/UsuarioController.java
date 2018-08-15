package com.decial.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.decial.model.TIPOUSUARIO;
import com.decial.model.Usuario;
import com.decial.repository.UsuarioRepository;

@RestController
@RequestMapping("/usuario")
public class UsuarioController {
	
	@Autowired
	private UsuarioRepository repository;
	
	@GetMapping
	public List<Usuario> getAll()
	{
		return repository.findAll();
	}
	
	@GetMapping(path = "/{tipo}")
	public List<Usuario> getByTipoLike(@PathVariable TIPOUSUARIO tipo)
	{
		return repository.findByTipoLike(tipo);
	}
	
	
	@PostMapping
	public Usuario save(@RequestBody Usuario usuario)
	{
		return repository.save(usuario);
		
	}
	
	@PutMapping(path =("/{id}"))
	public Usuario update(@PathVariable Long id, @RequestBody Usuario usuario)
	
	{
		Usuario user = repository.getOne(id);
			
			if(user == null || user.getId() != usuario.getId())
				return null;
			
			repository.save(usuario);
			
			return user;
	}
	
	@DeleteMapping(path =("/{id}"))
	public Usuario delete(@PathVariable Long id, @RequestBody Usuario usuario)
	
	{
		Usuario user = repository.getOne(id);
			
			if(user == null || user.getId() != usuario.getId())
				return null;
			
			repository.delete(usuario);
			
			return user;
	}
	
	
}
