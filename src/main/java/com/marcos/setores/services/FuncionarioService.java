package com.marcos.setores.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.marcos.setores.domain.Funcionario;
import com.marcos.setores.repositores.FuncionarioRepository;
import com.marcos.setores.services.exceptions.ObjectNotFoundException;

@Service
public class FuncionarioService {

	@Autowired
	private FuncionarioRepository fr;
	
	public Funcionario buscarPorId(Long id) {
		Optional<Funcionario> obj = fr.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado! Id: " + id + ", Tipo: " + Funcionario.class.getName()));
	}
}
