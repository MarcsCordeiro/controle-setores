package com.marcos.setores.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.marcos.setores.domain.Cargo;
import com.marcos.setores.repositores.CargoRepository;
import com.marcos.setores.services.exceptions.ObjectNotFoundException;

	@Service
	public class CargoService {

		@Autowired
		private CargoRepository cr;
		
		public Cargo buscarPorId(Long id) {
			Optional<Cargo> obj = cr.findById(id);
			return obj.orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado! Id: " + id + ", Tipo: " + Cargo.class.getName()));
		}
	}


