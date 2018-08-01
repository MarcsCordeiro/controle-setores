package com.marcos.setores.resouces;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.marcos.setores.domain.Cargo;
import com.marcos.setores.services.CargoService;

@RestController
@RequestMapping(value="/cargos")
public class CargoResouce {

	@Autowired
	private CargoService service;
	
	@RequestMapping(value="/{id}", method=RequestMethod.GET)
	public ResponseEntity<?> find(@PathVariable Long id){
		
		Cargo obj = service.buscarPorId(id);
		return ResponseEntity.ok().body(obj);
	}
}
