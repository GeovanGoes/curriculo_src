package br.com.goes.curriculo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Usuario 
{
	@Id
	@GeneratedValue
	private Long id;
	
	private String nome;
	
	private String email;
	
	private String userName;
	
	private String senha;
	
	public Usuario() {
	}
	
	
	
	public Usuario(String nome, String email, String userName, String senha) {
		super();
		this.nome = nome;
		this.email = email;
		this.userName = userName;
		this.senha = senha;
	}



	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
}
