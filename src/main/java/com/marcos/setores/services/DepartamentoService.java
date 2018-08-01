package com.marcos.setores.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.marcos.setores.domain.Departamento;
import com.marcos.setores.repositores.DepartamentosRepository;
import com.marcos.setores.services.exceptions.ObjectNotFoundException;

@Service
public class DepartamentoService {

	@Autowired
	private DepartamentosRepository dr;
	
	public Departamento bucarId(Long id) {
		Optional<Departamento> obj = dr.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado! Id: " + id + ",Tipo: " + Departamento.class.getName()));
	}
}
