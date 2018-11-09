/**
 * 
 */
package br.com.geovan.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

/**
 * @author geovan.goes
 *
 */
@Entity
public class Habilidade
{
	@Id
	@GeneratedValue
	private Long id;
	
	@ManyToOne
	private TipoHabilidade tipoHabilidade;
	
	private String titulo;
	private String nivel;
	
	/**
	 * 
	 */
	public Habilidade()
	{
		// TODO Auto-generated constructor stub
	}
	
	public Habilidade(Long id, TipoHabilidade tipoHabilidade, String titulo, String nivel)
	{
		super();
		this.id = id;
		this.tipoHabilidade = tipoHabilidade;
		this.titulo = titulo;
		this.nivel = nivel;
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
	 * @return the tipoHabilidade
	 */
	public TipoHabilidade getTipoHabilidade()
	{
		return tipoHabilidade;
	}
	/**
	 * @param tipoHabilidade the tipoHabilidade to set
	 */
	public void setTipoHabilidade(TipoHabilidade tipoHabilidade)
	{
		this.tipoHabilidade = tipoHabilidade;
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
	 * @return the nivel
	 */
	public String getNivel()
	{
		return nivel;
	}
	/**
	 * @param nivel the nivel to set
	 */
	public void setNivel(String nivel)
	{
		this.nivel = nivel;
	}
}
