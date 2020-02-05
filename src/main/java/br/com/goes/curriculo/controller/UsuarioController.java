package br.com.goes.curriculo.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.goes.curriculo.dto.CadastroUsuarioDto;
import br.com.goes.curriculo.model.Usuario;
import br.com.goes.curriculo.service.UsuarioService;

@RestController
@RequestMapping(value = "/usuario")
public class UsuarioController 
{
	
	@Autowired
	private UsuarioService service;
	
	@PostMapping
	public ResponseEntity<?> register(@RequestBody(required = true) @Valid CadastroUsuarioDto usuarioDto)
	{
		Usuario usuario = this.service.cadastrarUsuario(usuarioDto);		
		if (usuario != null)
			return ResponseEntity.ok(CadastroUsuarioDto.toDto(usuario));
		return ResponseEntity.badRequest().build();
	}
	
	@GetMapping( value = "/{username}")
	public ResponseEntity<?> info(@PathVariable(value = "username", required = true) String username)
	{
		Usuario usuarioByUserName = this.service.getUsuarioByUserName(username);
		if (usuarioByUserName == null)
			return ResponseEntity.notFound().build();
		return ResponseEntity.ok(usuarioByUserName);
	}
	
	@PutMapping
	public ResponseEntity<?> update()
	{
		return null;
	}
}
