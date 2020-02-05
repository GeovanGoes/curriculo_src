package br.com.goes.curriculo.dto;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import br.com.goes.curriculo.model.Usuario;

/***
 * 
 * @author geovan.goes
 *
 */
public class CadastroUsuarioDto {
	
	@NotNull
	@NotEmpty
	private String nome;
	
	@NotNull
	@NotEmpty
	@Email
	private String email;
	
	@NotNull
	@NotEmpty
	@Size(min = 5)
	private String userName;
	
	@NotNull
	@NotEmpty
	@Size(min = 8)
	private String senha;
	
	
	public CadastroUsuarioDto() {
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



	private CadastroUsuarioDto(@NotNull @NotEmpty String nome, @NotNull @NotEmpty @Email String email,
			@NotNull @NotEmpty @Size(min = 5) String userName, @NotNull @NotEmpty @Size(min = 8) String senha) {
		super();
		this.nome = nome;
		this.email = email;
		this.userName = userName;
		this.senha = senha;
	}
	
	/***
	 * 
	 * @param usuario
	 * @return
	 */
	public static CadastroUsuarioDto toDto(Usuario usuario) 
	{
		return new CadastroUsuarioDto(usuario.getNome(), usuario.getEmail(), usuario.getUserName(), null);
	}
	
	/**
	 * 
	 * @return
	 */
	public Usuario toUsuario()
	{
		return new Usuario(getNome(), getEmail(), getUserName(), getSenha());
	}
}
