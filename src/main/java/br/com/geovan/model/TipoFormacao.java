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
public class TipoFormacao
{
	@Id
	@GeneratedValue
	private Long id;
	private String descricao;
	
	/**
	 * 
	 */
	public TipoFormacao()
	{
		// TODO Auto-generated constructor stub
	}
	
	public TipoFormacao(Long id, String descricao)
	{
		super();
		this.id = id;
		this.descricao = descricao;
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
}
