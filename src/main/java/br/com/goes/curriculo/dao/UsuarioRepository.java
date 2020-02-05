package br.com.goes.curriculo.dao;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.com.goes.curriculo.model.Usuario;


@Repository
public interface UsuarioRepository extends CrudRepository<Usuario, Long>
{
	Optional<Usuario> findUsuarioByUserName(String userName);	
}
