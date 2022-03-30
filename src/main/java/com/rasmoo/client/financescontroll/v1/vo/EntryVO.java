package com.rasmoo.client.financescontroll.v1.vo;

import java.util.Date;

import com.rasmoo.client.financescontroll.v1.constant.TypeEnum;

import lombok.Data;

@Data
public class EntryVO {
	
	private Long id;

	private TypeEnum tipo;

	private Date data = new Date();

	private int valor;

	private Long categoryId;
	
	public EntryVO() {
		// TODO Auto-generated constructor stub
	}

	public EntryVO(TypeEnum tipo, Date data, int valor, Long categoryId) {
		this.tipo = tipo;
		this.data = data;
		this.valor = valor;
		this.categoryId = categoryId;
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

	public Long getCategoryId() {
		return categoryId;
	}

	public void setCategoryId(Long categoryId) {
		this.categoryId = categoryId;
	}
	
	
	
}
