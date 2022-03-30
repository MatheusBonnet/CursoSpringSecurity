package com.rasmoo.client.financescontroll.v1.dto;

import lombok.Data;

@Data
public class CategoryDTO {
	
	private Long id;

	private String nome;

	private String descricao;
	
	public CategoryDTO() {
		// TODO Auto-generated constructor stub
	}

	public CategoryDTO(String nome, String descricao) {
		this.nome = nome;
		this.descricao = descricao;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	

}
