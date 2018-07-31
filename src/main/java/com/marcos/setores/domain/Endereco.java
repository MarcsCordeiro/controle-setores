package com.marcos.setores.domain;

import javax.persistence.Entity;
import javax.persistence.Table;

@SuppressWarnings("serial")
@Entity
@Table(name="ENDERECOS")
public class Endereco extends AbstractEntity<Long>{
	
	private String logradouro;
	private int numero;
	private String bairro;
	private String cidade;
	private String cep;
	private String estado;
	
	public Endereco() {
	}

	public Endereco(String logradouro, int numero, String bairro, String cidade, String cep, Estado estado) {
		super();
		this.logradouro = logradouro;
		this.numero = numero;
		this.bairro = bairro;
		this.cidade = cidade;
		this.cep = cep;
		this.estado = estado.getSigla();
	}

	public String getLogradouro() {
		return logradouro;
	}

	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(Estado estado) {
		this.estado = estado.getSigla();
	}
	
	
	
	
	

}
