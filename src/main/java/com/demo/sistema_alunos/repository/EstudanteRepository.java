package com.demo.sistema_alunos.repository;

import com.demo.sistema_alunos.model.Estudante;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface EstudanteRepository extends JpaRepository<Estudante, Long> {

}
