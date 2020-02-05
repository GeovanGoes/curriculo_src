package br.com.goes.curriculo.dao;

import org.springframework.data.repository.CrudRepository;

import br.com.goes.curriculo.model.Plan;

public interface PlanRepository extends CrudRepository<Plan, Long> {
	
}
