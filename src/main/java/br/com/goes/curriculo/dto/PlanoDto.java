package br.com.goes.curriculo.dto;

import java.util.List;

import br.com.goes.curriculo.model.Plan;

public class PlanoDto extends CadastroPlanoDto {
	
	private Long id;
	
	public PlanoDto(Long id, String title, List<FotoDto> fotos, String description) {
		super();
		this.id = id;
		super.setTitle(title);
		super.setFotos(fotos);
		super.setDescription(description);
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	
	public static PlanoDto toDto(Plan plano) {
		return new PlanoDto(plano.getId(), plano.getTitle(), FotoDto.toFotoDtoList(plano.getFotos()) , plano.getDescription());
	}
}
