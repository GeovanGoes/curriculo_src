package br.com.goes.curriculo.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.RestController;

import br.com.goes.curriculo.dto.CadastroPlanoDto;
import br.com.goes.curriculo.dto.PlanoDto;
import br.com.goes.curriculo.model.Plan;
import br.com.goes.curriculo.service.PlanService;

@RestController
@RequestMapping(value = "/planning")
public class PlanningController {
	
	
	@Autowired
	private PlanService service;
	
	@PostMapping
	public ResponseEntity<?> create(@Valid @RequestPart(value = "plano",required = true) CadastroPlanoDto dto)
	{
		Plan plano = service.create(dto);
		if (plano == null)
			return ResponseEntity.ok(PlanoDto.toDto(plano));
		else
			return ResponseEntity.badRequest().build();
	}
	
	@DeleteMapping
	public void delete()
	{
		
	}
	
	@PutMapping
	public void update() 
	{
		
	}
	
	@GetMapping(value = "/{plan}")
	public void getOne() {
		
	}
	
	@GetMapping
	public ResponseEntity<?> getAll() {
		List<Plan> plans = this.service.getAll();
		
		if (plans != null && plans.size() > 0)
			return ResponseEntity.ok(plans);
		else
			return ResponseEntity.badRequest().build();
	}
	
}
