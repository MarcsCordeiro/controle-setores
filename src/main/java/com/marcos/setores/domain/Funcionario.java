package com.marcos.setores.domain;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@SuppressWarnings("serial")
@Entity
@Table(name="FUNCIONARIOS")
public class Funcionario extends AbstractEntity<Long>{
	
	private String nome;
	private Double salario;
	
	@OneToOne
	@JoinColumn(name="id_endereco_fk")
	private Endereco endereco;
	
	@ManyToOne
	@JoinColumn(name="id_cargo_fk")
	private Cargo cargo;
	
	public Funcionario() {
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Double getSalario() {
		return salario;
	}

	public void setSalario(Double salario) {
		this.salario = salario;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	public Cargo getCargo() {
		return cargo;
	}

	public void setCargo(Cargo cargo) {
		this.cargo = cargo;
	}
	
	

}
