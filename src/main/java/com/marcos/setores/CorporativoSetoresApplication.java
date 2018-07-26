package com.marcos.setores;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.marcos.setores.domain.Departamento;
import com.marcos.setores.repositores.DepartamentosRepository;

@SpringBootApplication
public class CorporativoSetoresApplication implements CommandLineRunner{

	@Autowired
	private DepartamentosRepository dr;
	
	public static void main(String[] args) {
		SpringApplication.run(CorporativoSetoresApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		Departamento dep1 = new Departamento("Tecnologia da Informação");
		Departamento dep2 = new Departamento("Contabilidade");
		
		dr.saveAll(Arrays.asList(dep1, dep2));
	}
	
	
}
