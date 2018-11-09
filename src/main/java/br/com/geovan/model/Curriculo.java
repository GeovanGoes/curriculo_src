/**
 * 
 */
package br.com.geovan.model;

import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

/**
 * @author geovan.goes
 *
 */
@Entity
public class Curriculo
{
	@Id
	@GeneratedValue
	private Long id;
	private String nome;
	@OneToOne
	private Endereco endereco;
	private Date dataNascimento;
	private String numeroCelular;
	private String email;
	
	private String cargo;
	
	@OneToMany
	private List<Formacao> formacao;
	
	@OneToMany
	private List<Habilidade> habilidades;
	
	@OneToMany
	private List<ExperienciaProfissional> trajetoriaProfissional;
	
	@OneToMany
	private List<AtividadeAcademica> atividadesAcademicas;

	
	
	public Curriculo(Long id, String nome, Endereco endereco, Date dataNascimento, String numeroCelular, String email, String cargo,
			List<Formacao> formacao, List<Habilidade> habilidades,
			List<ExperienciaProfissional> trajetoriaProfissional, List<AtividadeAcademica> atividadesAcademicas)
	{
		super();
		this.id = id;
		this.nome = nome;
		this.endereco = endereco;
		this.dataNascimento = dataNascimento;
		this.numeroCelular = numeroCelular;
		this.email = email;
		this.cargo = cargo;
		this.formacao = formacao;
		this.habilidades = habilidades;
		this.trajetoriaProfissional = trajetoriaProfissional;
		this.atividadesAcademicas = atividadesAcademicas;
	}
	
	/**
	 * 
	 */
	public Curriculo()
	{
		// TODO Auto-generated constructor stub
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
	 * @return the nome
	 */
	public String getNome()
	{
		return nome;
	}

	/**
	 * @param nome the nome to set
	 */
	public void setNome(String nome)
	{
		this.nome = nome;
	}

	/**
	 * @return the endereco
	 */
	public Endereco getEndereco()
	{
		return endereco;
	}

	/**
	 * @param endereco the endereco to set
	 */
	public void setEndereco(Endereco endereco)
	{
		this.endereco = endereco;
	}

	/**
	 * @return the dataNascimento
	 */
	public Date getDataNascimento()
	{
		return dataNascimento;
	}

	/**
	 * @param dataNascimento the dataNascimento to set
	 */
	public void setDataNascimento(Date dataNascimento)
	{
		this.dataNascimento = dataNascimento;
	}

	/**
	 * @return the numeroCelular
	 */
	public String getNumeroCelular()
	{
		return numeroCelular;
	}

	/**
	 * @param numeroCelular the numeroCelular to set
	 */
	public void setNumeroCelular(String numeroCelular)
	{
		this.numeroCelular = numeroCelular;
	}

	/**
	 * @return the email
	 */
	public String getEmail()
	{
		return email;
	}

	/**
	 * @param email the email to set
	 */
	public void setEmail(String email)
	{
		this.email = email;
	}

	/**
	 * @return the cargo
	 */
	public String getCargo()
	{
		return cargo;
	}

	/**
	 * @param cargo the cargo to set
	 */
	public void setCargo(String cargo)
	{
		this.cargo = cargo;
	}

	/**
	 * @return the habilidades
	 */
	public List<Habilidade> getHabilidades()
	{
		return habilidades;
	}

	/**
	 * @param habilidades the habilidades to set
	 */
	public void setHabilidades(List<Habilidade> habilidades)
	{
		this.habilidades = habilidades;
	}

	/**
	 * @return the trajetoriaProfissional
	 */
	public List<ExperienciaProfissional> getTrajetoriaProfissional()
	{
		return trajetoriaProfissional;
	}

	/**
	 * @param trajetoriaProfissional the trajetoriaProfissional to set
	 */
	public void setTrajetoriaProfissional(List<ExperienciaProfissional> trajetoriaProfissional)
	{
		this.trajetoriaProfissional = trajetoriaProfissional;
	}

	/**
	 * @return the atividadesAcademicas
	 */
	public List<AtividadeAcademica> getAtividadesAcademicas()
	{
		return atividadesAcademicas;
	}

	/**
	 * @param atividadesAcademicas the atividadesAcademicas to set
	 */
	public void setAtividadesAcademicas(List<AtividadeAcademica> atividadesAcademicas)
	{
		this.atividadesAcademicas = atividadesAcademicas;
	}

	/**
	 * @return the formacao
	 */
	public List<Formacao> getFormacao()
	{
		return formacao;
	}

	/**
	 * @param formacao the formacao to set
	 */
	public void setFormacao(List<Formacao> formacao)
	{
		this.formacao = formacao;
	}
}
