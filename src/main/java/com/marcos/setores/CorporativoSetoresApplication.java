package com.marcos.setores;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.marcos.setores.domain.Cargo;
import com.marcos.setores.domain.Departamento;
import com.marcos.setores.repositores.CargoRepository;
import com.marcos.setores.repositores.DepartamentosRepository;

@SpringBootApplication
public class CorporativoSetoresApplication implements CommandLineRunner{

	@Autowired
	private DepartamentosRepository dr;
	@Autowired
	private CargoRepository cr;
	
	public static void main(String[] args) {
		SpringApplication.run(CorporativoSetoresApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		Departamento dep1 = new Departamento("Tecnologia da Informação");
		Departamento dep2 = new Departamento("Contabilidade");
		
		Cargo c1 = new Cargo("Programador Java Jr");
		Cargo c2 = new Cargo("Programador C#");
		Cargo c3 = new Cargo("Gerente de Projetos");
		Cargo c4 = new Cargo("Auxiliar de contabilidade");
		Cargo c5 = new Cargo("Contador");
		
		dep1.getCargos().addAll(Arrays.asList(c1, c2, c3));
		dep2.getCargos().addAll(Arrays.asList(c4, c5));
		
		c1.setDepartamento(dep1);
		c2.setDepartamento(dep1);
		c3.setDepartamento(dep1);
		c4.setDepartamento(dep2);
		c5.setDepartamento(dep2);
		
		c1.getDepartamento();
		c2.getDepartamento();
		c3.getDepartamento();
		c4.getDepartamento();
		c5.getDepartamento();
		
		dr.saveAll(Arrays.asList(dep1, dep2));
		cr.saveAll(Arrays.asList(c1,c2,c3,c4,c5));
	}
	
	
}
