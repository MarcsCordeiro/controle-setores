package com.marcos.setores.repositores;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.marcos.setores.domain.Departamento;

@Repository
public interface DepartamentosRepository extends JpaRepository<Departamento, Long> {

}
