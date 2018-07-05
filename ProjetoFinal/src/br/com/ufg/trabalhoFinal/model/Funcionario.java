package br.com.ufg.trabalhoFinal.model;

import java.io.Serializable;

public class Funcionario extends Pessoa implements Serializable {
	
	private Integer codigo;
        
        private Double salario;

	public Funcionario(String nome, Integer codigo, int idade, char sexo, Double salario) {
		super();
		this.nome = nome;
		this.codigo = codigo;
		this.idade = idade;
		this.sexo = sexo;
                this.salario = salario;
	}

	public String getNome() {
		return nome;
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

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public char getSexo() {
		return sexo;
	}

	public void setSexo(char sexo) {
		this.sexo = sexo;
	}

        public Double getSalario() {
            return salario;
        }

        public void setSalario(Double salario) {
            this.salario = salario;
        }
}
