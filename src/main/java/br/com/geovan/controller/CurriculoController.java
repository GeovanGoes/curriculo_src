package br.com.geovan.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController(value = "/curriculo")
public class CurriculoController 
{
	@GetMapping
	public ResponseEntity<?> get(){
		return ResponseEntity.ok("it works!");
	}
	
}
