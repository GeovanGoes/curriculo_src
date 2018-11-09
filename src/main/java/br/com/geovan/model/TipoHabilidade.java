/**
 * 
 */
package br.com.geovan.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * @author geovan.goes
 *
 */
@Entity
public class TipoHabilidade
{
	@Id
	@GeneratedValue
	private Long id;
	private String titulo;
	
	
	/**
	 * 
	 */
	public TipoHabilidade()
	{
		// TODO Auto-generated constructor stub
	}
	
	
	public TipoHabilidade(Long id, String titulo)
	{
		super();
		this.id = id;
		this.titulo = titulo;
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
}
