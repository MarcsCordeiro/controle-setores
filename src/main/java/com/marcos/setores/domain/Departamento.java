package com.marcos.setores.domain;

import javax.persistence.Entity;
import javax.persistence.Table;

@SuppressWarnings("serial")
@Entity
@Table(name="DEPARTAMENTOS")
public class Departamento extends AbstractEntity<Long>{

	private String nome;
	
	public Departamento() {
	}

	public Departamento(String nome) {
		super();
		this.nome = nome;
	}



	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	
}
