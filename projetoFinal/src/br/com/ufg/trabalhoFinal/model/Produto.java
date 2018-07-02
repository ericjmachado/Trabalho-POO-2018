package br.com.ufg.trabalhoFinal.model;

import java.io.Serializable;

public class Produto implements Serializable {

	private static final long serialVersionUID = 1L;

	private String nome;
	
	private Integer codigo;
	
	private Double valor;

	public String getNome() {
		return nome;
	}
	
	public Produto(String nome, Integer codigo, Double valor) {
		super();
		this.nome = nome;
		this.codigo = codigo;
		this.valor = valor;
	}



	public void setNome(String nome) {
		this.nome = nome;
	}

	public Integer getCodigo() {
		return codigo;
	}

	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}

	public Double getValor() {
		return valor;
	}

	public void setValor(Double valor) {
		this.valor = valor;
	}
	
}
