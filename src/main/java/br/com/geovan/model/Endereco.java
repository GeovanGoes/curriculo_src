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
public class Endereco
{
	@Id
	@GeneratedValue
	private Long id;
	private String rua;
	private String estado;
	private String cidade;
	private String cep;
	/**
	 * @return the id
	 */
	
	
	
	public Long getId()
	{
		return id;
	}
	
	/**
	 * 
	 */
	public Endereco()
	{
		// TODO Auto-generated constructor stub
	}
	
	public Endereco(Long id, String rua, String estado, String cidade, String cep)
	{
		super();
		this.id = id;
		this.rua = rua;
		this.estado = estado;
		this.cidade = cidade;
		this.cep = cep;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(Long id)
	{
		this.id = id;
	}
	/**
	 * @return the rua
	 */
	public String getRua()
	{
		return rua;
	}
	/**
	 * @param rua the rua to set
	 */
	public void setRua(String rua)
	{
		this.rua = rua;
	}
	/**
	 * @return the estado
	 */
	public String getEstado()
	{
		return estado;
	}
	/**
	 * @param estado the estado to set
	 */
	public void setEstado(String estado)
	{
		this.estado = estado;
	}
	/**
	 * @return the cidade
	 */
	public String getCidade()
	{
		return cidade;
	}
	/**
	 * @param cidade the cidade to set
	 */
	public void setCidade(String cidade)
	{
		this.cidade = cidade;
	}
	/**
	 * @return the cep
	 */
	public String getCep()
	{
		return cep;
	}
	/**
	 * @param cep the cep to set
	 */
	public void setCep(String cep)
	{
		this.cep = cep;
	}
}
