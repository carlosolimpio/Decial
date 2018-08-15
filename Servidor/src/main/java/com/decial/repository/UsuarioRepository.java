package com.decial.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.decial.model.TIPOUSUARIO;
import com.decial.model.Usuario;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Long>{
	
	public List<Usuario> findByTipoLike(TIPOUSUARIO tipo);
	
}
