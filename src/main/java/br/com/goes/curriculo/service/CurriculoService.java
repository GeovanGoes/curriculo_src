package br.com.goes.curriculo.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.goes.curriculo.dao.CurriculoRepository;
import br.com.goes.curriculo.model.Curriculo;

@Service
public class CurriculoService 
{
	@Autowired
	private CurriculoRepository repository;
	
	/***
	 * 
	 * @return
	 */
	public List<Curriculo> findAll()
	{
		List<Curriculo> result = new ArrayList<Curriculo>();
		this.repository.findAll().forEach(result::add);
		return result;
	}
	
	/***
	 * 
	 * @param id
	 * @return
	 */
	public Curriculo findById(long id) 
	{
		Optional<Curriculo> optional = this.repository.findById(id);
		if (optional.isPresent())
			return optional.get();
		else
			return null;
	}
}
