package com.marcos.setores.domain;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonManagedReference;

@SuppressWarnings("serial")
@Entity
@Table(name="DEPARTAMENTOS")
public class Departamento extends AbstractEntity<Long>{

	private String nome;
	@JsonManagedReference
	@OneToMany(mappedBy="departamento")
	private List<Cargo> cargos = new ArrayList<>();
	
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

	public List<Cargo> getCargos() {
		return cargos;
	}

	public void setCargos(List<Cargo> cargos) {
		this.cargos = cargos;
	}
	
	
	
	
}
