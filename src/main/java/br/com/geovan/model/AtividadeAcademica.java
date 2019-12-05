/**
 * 
 */
package br.com.geovan.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * @author geovan.goes
 *
 */
@Entity
public class AtividadeAcademica
{
	@Id
	@GeneratedValue
	private Long id;
	private String titulo;
	private String descricao;
	@Column(length = 5000)
	private String detalhes;
	
	/**
	 * 
	 */
	public AtividadeAcademica()
	{
		// TODO Auto-generated constructor stub
	}
	
	
	public AtividadeAcademica(Long id, String titulo, String descricao, String detalhes)
	{
		super();
		this.id = id;
		this.titulo = titulo;
		this.descricao = descricao;
		this.detalhes = detalhes;
	}
	/**
	 * @return the id
	 */
	public Long getId()
	{
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(Long id)
	{
		this.id = id;
	}
	/**
	 * @return the titulo
	 */
	public String getTitulo()
	{
		return titulo;
	}
	/**
	 * @param titulo the titulo to set
	 */
	public void setTitulo(String titulo)
	{
		this.titulo = titulo;
	}
	/**
	 * @return the descricao
	 */
	public String getDescricao()
	{
		return descricao;
	}
	/**
	 * @param descricao the descricao to set
	 */
	public void setDescricao(String descricao)
	{
		this.descricao = descricao;
	}
	/**
	 * @return the detalhes
	 */
	public String getDetalhes()
	{
		return detalhes;
	}
	/**
	 * @param detalhes the detalhes to set
	 */
	public void setDetalhes(String detalhes)
	{
		this.detalhes = detalhes;
	}
}
