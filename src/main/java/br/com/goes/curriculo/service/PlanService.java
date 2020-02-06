package br.com.goes.curriculo.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.goes.curriculo.dao.PlanRepository;
import br.com.goes.curriculo.dto.CadastroPlanoDto;
import br.com.goes.curriculo.model.Plan;

@Service
public class PlanService {
	
	@Autowired
	private PlanRepository repository;
	
	public Plan create(CadastroPlanoDto dto) 
	{
		Plan plano = dto.toPlano();
		plano = repository.save(plano);
		return plano;
	}

	public List<Plan> getAll() {
		List<Plan> plans = new ArrayList<Plan>();
		Iterable<Plan> findAll = this.repository.findAll();
		findAll.forEach(plan -> plans.add(plan));
		return plans;
	}

	
	
}

