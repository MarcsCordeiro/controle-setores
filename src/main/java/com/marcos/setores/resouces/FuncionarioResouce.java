package com.marcos.setores.resouces;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.marcos.setores.domain.Funcionario;
import com.marcos.setores.services.FuncionarioService;

@RestController
@RequestMapping(value="/funcionarios")
public class FuncionarioResouce {
	
	@Autowired
	private FuncionarioService service;

	@RequestMapping(value="/{id}", method=RequestMethod.GET)
	public ResponseEntity<?> find(@PathVariable Long id){
		
		Funcionario obj = service.buscarPorId(id);
		return ResponseEntity.ok().body(obj);
	}
}
