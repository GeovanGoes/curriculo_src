package br.com.goes.curriculo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.goes.curriculo.model.Curriculo;
import br.com.goes.curriculo.service.CurriculoService;

@RestController
@RequestMapping(value = "/curriculo")
public class CurriculoController 
{
	@Autowired
	private CurriculoService service;
	
	@GetMapping
	public ResponseEntity<?> findAll()
	{
		return ResponseEntity.ok(this.service.findAll());
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<?> findById(@PathVariable("id") long id)
	{
		Curriculo curriculo = this.service.findById(id);		
		return curriculo == null ? ResponseEntity.notFound().build() : ResponseEntity.ok(curriculo);
	}
}
