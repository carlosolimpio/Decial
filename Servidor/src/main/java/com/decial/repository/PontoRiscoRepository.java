package com.decial.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.decial.model.PontoRisco;
import com.decial.model.RISCO;
import com.decial.model.STATUS;

@Repository
public interface PontoRiscoRepository extends JpaRepository<PontoRisco, Long> {
	
	public List<PontoRisco> findByCepLike(String cep);
	public List<PontoRisco> findByRiscoLike(RISCO risco);
	public List<PontoRisco> findByStatusLike(STATUS status);
	
	
}
