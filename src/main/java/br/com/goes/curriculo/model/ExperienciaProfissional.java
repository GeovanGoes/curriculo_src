/**
 * 
 */
package br.com.goes.curriculo.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * @author geovan.goes
 *
 */
@Entity
public class ExperienciaProfissional
{
	@Id
	@GeneratedValue
	private Long id;
	private String nomeEmpresa;
	private String descricaoEmpresa;
	private String cargo;
	private Date dataInicio;
	private Date dataFim;
	private String descricaoExperiencia;
	
	
	/**
	 * 
	 */
	public ExperienciaProfissional()
	{
		// TODO Auto-generated constructor stub
	}
	
	public ExperienciaProfissional(Long id, String nomeEmpresa, String descricaoEmpresa, Date dataInicio, Date dataFim, String descricaoExperiencia, String cargo)
	{
		super();
		this.id = id;
		this.nomeEmpresa = nomeEmpresa;
		this.descricaoEmpresa = descricaoEmpresa;
		this.dataInicio = dataInicio;
		this.dataFim = dataFim;
		this.descricaoExperiencia = descricaoExperiencia;
		this.cargo = cargo;
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
	 * @return the nomeEmpresa
	 */
	public String getNomeEmpresa()
	{
		return nomeEmpresa;
	}
	/**
	 * @param nomeEmpresa the nomeEmpresa to set
	 */
	public void setNomeEmpresa(String nomeEmpresa)
	{
		this.nomeEmpresa = nomeEmpresa;
	}
	/**
	 * @return the descricaoEmpresa
	 */
	public String getDescricaoEmpresa()
	{
		return descricaoEmpresa;
	}
	/**
	 * @param descricaoEmpresa the descricaoEmpresa to set
	 */
	public void setDescricaoEmpresa(String descricaoEmpresa)
	{
		this.descricaoEmpresa = descricaoEmpresa;
	}
	/**
	 * @return the dataInicio
	 */
	public Date getDataInicio()
	{
		return dataInicio;
	}
	/**
	 * @param dataInicio the dataInicio to set
	 */
	public void setDataInicio(Date dataInicio)
	{
		this.dataInicio = dataInicio;
	}
	/**
	 * @return the dataFim
	 */
	public Date getDataFim()
	{
		return dataFim;
	}
	/**
	 * @param dataFim the dataFim to set
	 */
	public void setDataFim(Date dataFim)
	{
		this.dataFim = dataFim;
	}
	/**
	 * @return the descricaoExperiencia
	 */
	public String getDescricaoExperiencia()
	{
		return descricaoExperiencia;
	}
	/**
	 * @param descricaoExperiencia the descricaoExperiencia to set
	 */
	public void setDescricaoExperiencia(String descricaoExperiencia)
	{
		this.descricaoExperiencia = descricaoExperiencia;
	}

	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}
}
