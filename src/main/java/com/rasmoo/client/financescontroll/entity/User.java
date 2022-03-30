package com.rasmoo.client.financescontroll.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.Data;

@Data
@Entity
@Table(name = "USER")
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	@Column(name = "id")
	private Long id;
	
	@Column(name = "name")
	private String nome;

	@JsonIgnore
	@Column(name = "credential")
	private Credential credencial = new Credential();

	@OneToMany(
			mappedBy = "user",
			cascade = CascadeType.ALL,
			orphanRemoval = true
	)
	@Column(name = "entry")
	private List<Entry> lancamento;
	
	public User() {
		// TODO Auto-generated constructor stub
	}

	public User(String nome, Credential credencial, List<Entry> lancamento) {
		this.nome = nome;
		this.credencial = credencial;
		this.lancamento = lancamento;
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

	public Credential getCredencial() {
		return credencial;
	}

	public void setCredencial(Credential credencial) {
		this.credencial = credencial;
	}

	public List<Entry> getLancamento() {
		return lancamento;
	}

	public void setLancamento(List<Entry> lancamento) {
		this.lancamento = lancamento;
	}
	
	

}
