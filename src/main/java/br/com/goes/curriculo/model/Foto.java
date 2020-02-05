package br.com.goes.curriculo.model;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

public class Foto {

	@Id
	@GeneratedValue
	private Long id;
	
	private String titulo;
	
	@Column(length = Integer.MAX_VALUE)
	private String encodedFile;

	public Foto() {
	}
	
	public Foto(String titulo, String encodedFile) {
		super();
		this.titulo = titulo;
		this.encodedFile = encodedFile;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
}
