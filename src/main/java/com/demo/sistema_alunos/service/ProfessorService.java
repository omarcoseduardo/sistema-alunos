package com.demo.sistema_alunos.service;

import com.demo.sistema_alunos.model.Professor;
import com.demo.sistema_alunos.repository.ProfessorRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProfessorService {
    private final ProfessorRepository professorRepository;

    public ProfessorService(ProfessorRepository professorRepository) {
        this.professorRepository = professorRepository;
    }

    public Professor adicionarProfessor(Professor professor) {
        return professorRepository.save(professor);
    }

    public List<Professor> buscarTodos() {
        return professorRepository.findAll();
    }

    public Optional<Professor> buscarPorId(Long id) {
        return professorRepository.findById(id);
    }

    public void deletarProfessor(Long id) {
        professorRepository.deleteById(id);
    }

    public Professor alterarProfessor(Long id, Professor professorAlterado) {
        Professor professor = professorRepository.findById(id).orElseThrow(() -> new RuntimeException("Professor não encontrado via id" + id));

        professor.setNome(professorAlterado.getNome());

        return professorRepository.save(professor);
    }
}