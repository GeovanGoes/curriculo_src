/**
 * 
 */
package br.com.geovan.service;

import br.com.geovan.dao.CurriculoRepository;
import br.com.geovan.model.AtividadeAcademica;
import br.com.geovan.model.Curriculo;
import br.com.geovan.model.Endereco;
import br.com.geovan.model.ExperienciaProfissional;
import br.com.geovan.model.Formacao;
import br.com.geovan.model.Habilidade;
import br.com.geovan.model.TipoFormacao;
import br.com.geovan.model.TipoHabilidade;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author geovan.goes
 *
 */
@Service
public class AdminService
{
	@Autowired
	private CurriculoRepository curriculoRepository;

	public void testDatabaseModel()
	{
		Long id = 1L;
		String nome = "Geovan Tester";
		Endereco endereco = new Endereco(1L, "Rua do josé", "SP", "São Paulo", "05661-060");
		Date dataNascimento = new Date();
		String numeroCelular = "(11) 98976-2229";
		String email = "geovansilvagoes@gmail.com";
		String cargo = "Desenvolvedor";
		List<Formacao> formacaoAcademica = new ArrayList<Formacao>();
		//formacaoAcademica.add(new Formacao(1L, "SENAC", "", true, "2015", new TipoFormacao(1L, "Academica")));
		
		List<Habilidade> habilidades = new ArrayList<>();
		habilidades.add(new Habilidade(1L, new TipoHabilidade(1L, ""), "SQL", "Básico"));
		
		List<ExperienciaProfissional> trajetoriaProfissional = new ArrayList<>();
		//trajetoriaProfissional.add(new ExperienciaProfissional(1L, "GoPoints", "", new Date(), new Date(), "Desenv."));
		
		List<AtividadeAcademica> atividadesAcademicas = new ArrayList<AtividadeAcademica>();
		atividadesAcademicas.add(new AtividadeAcademica(1L, "Sistema de cadastro de pessoas", "Desenvolvido apenas para estudo", "esse projeto foi legal."));
		
		Curriculo curriculo = new Curriculo();
		
		
		curriculoRepository.save(curriculo);
	}
	
	private Set<?> toSet(List<?> list) {
		return list.stream().collect(Collectors.toSet());
	}
}
