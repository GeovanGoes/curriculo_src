/**
 * 
 */
package br.com.goes.curriculo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

/**
 * @author geovan.goes
 *
 */
@Entity
public class Formacao
{
	@Id
	@GeneratedValue
	private Long id;
	private String nomeInstituicao;
	private String descricaoInstituicao;
	private String nomeCurso;
	private boolean isConcluido;
	private String anoConlusao;
	@ManyToOne
	private TipoFormacao tipoFormacao;
	
	
	
	/**
	 * 
	 */
	public Formacao()
	{
		// TODO Auto-generated constructor stub
	}

	public Formacao(Long id, String nomeInstituicao, String descricaoInstituicao, boolean isConcluido, String anoConlusao, TipoFormacao tipoFormacao, String nomeCurso)
	{
		super();
		this.id = id;
		this.nomeInstituicao = nomeInstituicao;
		this.descricaoInstituicao = descricaoInstituicao;
		this.isConcluido = isConcluido;
		this.anoConlusao = anoConlusao;
		this.tipoFormacao = tipoFormacao;
		this.nomeCurso = nomeCurso;
	}

	
	/**
	 * @return the tipoFormacao
	 */
	public TipoFormacao getTipoFormacao()
	{
		return tipoFormacao;
	}


	/**
	 * @param tipoFormacao the tipoFormacao to set
	 */
	public void setTipoFormacao(TipoFormacao tipoFormacao)
	{
		this.tipoFormacao = tipoFormacao;
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
	 * @return the nomeInstituicao
	 */
	public String getNomeInstituicao()
	{
		return nomeInstituicao;
	}
	/**
	 * @param nomeInstituicao the nomeInstituicao to set
	 */
	public void setNomeInstituicao(String nomeInstituicao)
	{
		this.nomeInstituicao = nomeInstituicao;
	}
	/**
	 * @return the descricaoInstituicao
	 */
	public String getDescricaoInstituicao()
	{
		return descricaoInstituicao;
	}
	/**
	 * @param descricaoInstituicao the descricaoInstituicao to set
	 */
	public void setDescricaoInstituicao(String descricaoInstituicao)
	{
		this.descricaoInstituicao = descricaoInstituicao;
	}
	/**
	 * @return the isConcluido
	 */
	public boolean isConcluido()
	{
		return isConcluido;
	}
	/**
	 * @param isConcluido the isConcluido to set
	 */
	public void setConcluido(boolean isConcluido)
	{
		this.isConcluido = isConcluido;
	}
	/**
	 * @return the anoConlusao
	 */
	public String getAnoConlusao()
	{
		return anoConlusao;
	}
	/**
	 * @param anoConlusao the anoConlusao to set
	 */
	public void setAnoConlusao(String anoConlusao)
	{
		this.anoConlusao = anoConlusao;
	}

	public String getNomeCurso() {
		return nomeCurso;
	}

	public void setNomeCurso(String nomeCurso) {
		this.nomeCurso = nomeCurso;
	}
}
