/**
 * 
 */
package br.com.goes.curriculo.service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.goes.curriculo.dao.CurriculoRepository;
import br.com.goes.curriculo.model.AtividadeAcademica;
import br.com.goes.curriculo.model.Curriculo;
import br.com.goes.curriculo.model.Endereco;
import br.com.goes.curriculo.model.ExperienciaProfissional;
import br.com.goes.curriculo.model.Formacao;
import br.com.goes.curriculo.model.Habilidade;
import br.com.goes.curriculo.model.TipoHabilidade;

/**
 * @author geovan.goes
 *
 */
@Service
public class AdminService
{
	@Autowired
	private CurriculoRepository curriculoRepository;

	private Set<?> toSet(List<?> list) {
		return list.stream().collect(Collectors.toSet());
	}
}
