package br.com.goes.curriculo.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.goes.curriculo.dao.UsuarioRepository;
import br.com.goes.curriculo.dto.CadastroUsuarioDto;
import br.com.goes.curriculo.model.Usuario;

@Service
public class UsuarioService {
	
	@Autowired
	private UsuarioRepository repository;
	
	public Usuario getUsuarioByUserName (String userName) {
		Optional<Usuario> findUsuarioByUserName = this.repository.findUsuarioByUserName(userName);
		
		if (findUsuarioByUserName.isPresent())
			return findUsuarioByUserName.get();
		return null;
	}
	
	
	public Usuario cadastrarUsuario(CadastroUsuarioDto usuarioDto)
	{
		Usuario usuario = usuarioDto.toUsuario();
		usuario = repository.save(usuario);
		return usuario;
	}
}
