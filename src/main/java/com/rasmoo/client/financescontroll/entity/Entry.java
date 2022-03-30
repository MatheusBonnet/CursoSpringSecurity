package com.rasmoo.client.financescontroll.entity;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.rasmoo.client.financescontroll.v1.constant.TypeEnum;

import lombok.Data;

@Data
@Entity
@Table(name = "ENTRY")
public class Entry {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id")
	private Long id;
	
	@Column(name = "type")
	private TypeEnum tipo;
	
	@Column(name = "date")
	private Date data = new Date();
	
	@Column(name = "value")
	private int valor;
	
	@OneToOne(cascade = CascadeType.REFRESH)
	private Category categoria = new Category();
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JsonIgnore
	private User user;
	
	public Entry() {
		// TODO Auto-generated constructor stub
	}

	public Entry(TypeEnum tipo, Date data, int valor, Category categoria, User user) {
		this.tipo = tipo;
		this.data = data;
		this.valor = valor;
		this.categoria = categoria;
		this.user = user;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public TypeEnum getTipo() {
		return tipo;
	}

	public void setTipo(TypeEnum tipo) {
		this.tipo = tipo;
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}

	public int getValor() {
		return valor;
	}

	public void setValor(int valor) {
		this.valor = valor;
	}

	public Category getCategoria() {
		return categoria;
	}

	public void setCategoria(Category categoria) {
		this.categoria = categoria;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}
	
}
