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

import com.decial.model.PontoRisco;
import com.decial.model.RISCO;
import com.decial.model.STATUS;
import com.decial.repository.PontoRiscoRepository;

@RestController
@RequestMapping("/ponto_risco")
public class PontoRiscoController {

	@Autowired
	private PontoRiscoRepository repository;
	
	@GetMapping
	public List<PontoRisco> findAll()
	{
		return repository.findAll();
	}
	
	@GetMapping(path = "/{cep}")
	public List<PontoRisco> findByCepLike(@PathVariable String cep)
	{
		return repository.findByCepLike(cep);
	}
	
	@GetMapping(path = "/{risco}")
	public List<PontoRisco> findByRiscoLike(RISCO risco)
	{
		return repository.findByRiscoLike(risco);
	}
	
	@PostMapping
	public void	 save(@RequestBody PontoRisco pontoRisco)
	{
		 repository.save(pontoRisco);
	}
	
	@GetMapping(path = ("/{status}"))
	public List<PontoRisco> findByStatusLike(STATUS status)
	{
		return repository.findByStatusLike(status);
	}
	
	@PutMapping(path = ("/{id}"))
	public PontoRisco update(Long id, @RequestBody PontoRisco pontoRisco)
	{
		PontoRisco ponto = repository.getOne(id);
		
		if(ponto == null | ponto.getId() != pontoRisco.getId())
			return null;
		
		return repository.save(pontoRisco);
	}
	
	@DeleteMapping(path = ("/{id}"))
	public PontoRisco delete(Long id, @RequestBody PontoRisco pontoRisco)
	{
		PontoRisco ponto = repository.getOne(id);
		
		if(ponto == null | ponto.getId() != pontoRisco.getId())
			return null;
		
		 repository.delete(pontoRisco);
		 
		 return ponto;
	}
}
