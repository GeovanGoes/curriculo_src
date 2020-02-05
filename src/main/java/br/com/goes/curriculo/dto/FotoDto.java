package br.com.goes.curriculo.dto;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import br.com.goes.curriculo.model.Foto;

public class FotoDto {
	
	@NotNull
	@NotEmpty
	private String titulo;
	
	@NotNull
	@NotEmpty
	private String encodedFile;
	
	public FotoDto(String titulo, String encodedFile) {
		super();
		this.titulo = titulo;
		this.encodedFile = encodedFile;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getEncodedFile() {
		return encodedFile;
	}
	public void setEncodedFile(String encodedFile) {
		this.encodedFile = encodedFile;
	}
	
	public Foto toFoto() {
		return new Foto(getTitulo(), getEncodedFile());
	}
	
	public static List<Foto> toFotoList(List<FotoDto> dtos){
		return dtos.stream().map(dto -> dto.toFoto()).collect(Collectors.toList());
	}

}
