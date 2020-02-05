package br.com.goes.curriculo.dto;

import java.util.List;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import br.com.goes.curriculo.model.Plan;

public class CadastroPlanoDto {
	
	@NotNull
	@NotEmpty
	private String title;
	
	private String description;
	
	private List<FotoDto> fotos;

	public String getTitle() {
		return title;
	}
	
	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public List<FotoDto> getFotos() {
		return fotos;
	}

	public void setFotos(List<FotoDto> fotos) {
		this.fotos = fotos;
	}

	/***
	 * 
	 * @return
	 */
	public Plan toPlano() {
		return new Plan(getTitle(), getDescription(), FotoDto.toFotoList(getFotos()));
	}
}
