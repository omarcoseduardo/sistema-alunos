package com.demo.sistema_alunos.service;

import com.demo.sistema_alunos.model.Curso;
import com.demo.sistema_alunos.repository.CursoRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CursoService {
    private final CursoRepository cursoRepository;

    public CursoService(CursoRepository cursoRepository) {
        this.cursoRepository = cursoRepository;
    }

    public Curso adicionarCurso(Curso curso) {
        return cursoRepository.save(curso);
    }

    public List<Curso> buscarTodos() {
        return cursoRepository.findAll();
    }

    public Optional<Curso> buscarPorId(Long id) {
        return cursoRepository.findById(id);
    }

    public void deletarCurso(Long id) {
        cursoRepository.deleteById(id);
    }

    public Curso alterarCurso(Long id, Curso cursoAlterado) {
        Curso curso = cursoRepository.findById(id).orElseThrow(() -> new RuntimeException("Curso não encontrado via id" + id));

        curso.setCategoria(cursoAlterado.getCategoria());

        return cursoRepository.save(curso);
    }
}