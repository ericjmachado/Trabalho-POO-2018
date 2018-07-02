package br.com.ufg.trabalhoFinal.model;

import java.io.Serializable;

import br.com.ufg.trabalhoFinal.Funcionario;

public class Venda implements Serializable {

	private static final long serialVersionUID = 1L;

	private Produto produto;
	
	private Funcionario vendedor;
	
	private Integer quantidade;

	
	
	public Venda(Produto produto, Funcionario vendedor, Integer quantidade) {
		super();
		this.produto = produto;
		this.vendedor = vendedor;
		this.quantidade = quantidade;
	}

	public Produto getProduto() {
		return produto;
	}

	public void setProduto(Produto produto) {
		this.produto = produto;
	}

	public Funcionario getVendedor() {
		return vendedor;
	}

	public void setVendedor(Funcionario vendedor) {
		this.vendedor = vendedor;
	}

	public Integer getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(Integer quantidade) {
		this.quantidade = quantidade;
	}
	
}
