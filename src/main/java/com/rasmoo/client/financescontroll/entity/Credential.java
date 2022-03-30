package com.rasmoo.client.financescontroll.entity;

import javax.persistence.Embeddable;

import lombok.Data;

@Embeddable
@Data
public class Credential {
	
	private String email;

	private String senha;

	public Credential(String email, String senha) {
		this.email = email;
		this.senha = senha;
	}
	
	public Credential() {
		// TODO Auto-generated constructor stub
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}
	
	
	
}
