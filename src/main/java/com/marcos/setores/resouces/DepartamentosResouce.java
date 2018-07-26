package com.marcos.setores.resouces;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.marcos.setores.domain.Departamento;
import com.marcos.setores.services.DepartamentoService;

@RestController
@RequestMapping(value="/departamentos")
public class DepartamentosResouce {
	
	@Autowired
	private DepartamentoService service;

	@RequestMapping(value="/{id}", method=RequestMethod.GET)
	public ResponseEntity<?> find(@PathVariable Long id){
		
		Departamento obj = service.bucarId(id);
		return ResponseEntity.ok().body(obj);
	}
}
