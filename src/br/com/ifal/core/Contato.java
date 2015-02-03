package br.com.ifal.core;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.Email;

public class Contato {

	private int id;
	/*Estas anotações servem para validação, serão utilizadas somente quando existir
	 * a anotação @Valid*/
	@NotNull (message="O nome deve ter no mínimo 3 caracteres!")
	@Size (min=3, message="O nome deve ter no mínimo 3 caracteres!") 
	private String nome;
	@NotNull (message="Insira um endereço de e-mail válido!")
	@Email (message="Insira um endereço de e-mail válido!")
	private String email;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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
}
