package com.marcos.setores;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.marcos.setores.domain.Cargo;
import com.marcos.setores.domain.Departamento;
import com.marcos.setores.domain.Endereco;
import com.marcos.setores.domain.Estado;
import com.marcos.setores.domain.Funcionario;
import com.marcos.setores.repositores.CargoRepository;
import com.marcos.setores.repositores.DepartamentosRepository;
import com.marcos.setores.repositores.EnderecoRepository;
import com.marcos.setores.repositores.FuncionarioRepository;

@SpringBootApplication
public class CorporativoSetoresApplication implements CommandLineRunner{

	@Autowired
	private DepartamentosRepository dr;
	@Autowired
	private CargoRepository cr;
	@Autowired
	private FuncionarioRepository fr;
	@Autowired
	private EnderecoRepository er;
	
	public static void main(String[] args) {
		SpringApplication.run(CorporativoSetoresApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		Departamento dep1 = new Departamento("Tecnologia da Informação");
		Departamento dep2 = new Departamento("Contabilidade");
		
		Cargo c1 = new Cargo("Programador Java Jr", dep1);
		Cargo c2 = new Cargo("Programador C#", dep1);
		Cargo c3 = new Cargo("Gerente de Projetos", dep1);
		Cargo c4 = new Cargo("Auxiliar de contabilidade", dep2);
		Cargo c5 = new Cargo("Contador", dep2);
		
		dep1.getCargos().addAll(Arrays.asList(c1, c2, c3));
		dep2.getCargos().addAll(Arrays.asList(c4, c5));
		
		dr.saveAll(Arrays.asList(dep1, dep2));
		cr.saveAll(Arrays.asList(c1,c2,c3,c4,c5));
		
		Endereco end1 = new Endereco("Rua do Meio", 123, "Jaranda", "Crato", "5588994466", Estado.CE);
		Endereco end2 = new Endereco("Rua da Luz", 556, "Javali", "Ramos", "5566145612", Estado.PE);
		Endereco end3 = new Endereco("Rua Torta", 652, "Gasolina", "Brejo Santo", "6644778822", Estado.BA);
		Endereco end4 = new Endereco("Rua do Branco", 223, "Cajarana", "Jantar", "3311122255", Estado.RJ);
		
		Funcionario f1 = new Funcionario("Maria Mesma", 2.500, end1, c4);
		Funcionario f2 = new Funcionario("Rubens Paiva", 4.250, end3, c5);
		Funcionario f3 = new Funcionario("Rodrigo Campos", 4.650, end2, c3);
		Funcionario f4 = new Funcionario("Marcos Silva", 1.500, end4, c1);
		
		c1.getFuncionarios().addAll(Arrays.asList(f4));
		c3.getFuncionarios().addAll(Arrays.asList(f3));
		c4.getFuncionarios().addAll(Arrays.asList(f1));
		c5.getFuncionarios().addAll(Arrays.asList(f2));
		
		fr.saveAll(Arrays.asList(f1, f2, f3, f4));
		er.saveAll(Arrays.asList(end1, end2, end3, end4));
	}
	
}
