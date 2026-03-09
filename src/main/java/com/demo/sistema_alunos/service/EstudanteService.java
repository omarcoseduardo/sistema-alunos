package com.demo.sistema_alunos.service;

import com.demo.sistema_alunos.model.Estudante;
import com.demo.sistema_alunos.repository.EstudanteRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EstudanteService {
    private final EstudanteRepository estudanteRepository;

    public EstudanteService(EstudanteRepository estudanteRepository) {
        this.estudanteRepository = estudanteRepository;
    }

    public Estudante adicionarEstudante(Estudante estudante) {
        return estudanteRepository.save(estudante);
    }

    public List<Estudante> buscarTodos() {
        return estudanteRepository.findAll();
    }

    public Optional<Estudante> buscarPorId(Long id) {
        return estudanteRepository.findById(id);
    }

    public void deletarEstudante(Long id) {
        estudanteRepository.deleteById(id);
    }

    public Estudante alterarEstudante(Long id, Estudante estudanteAlterado) {
        Estudante estudante = estudanteRepository.findById(id).orElseThrow(() -> new RuntimeException("Estudante não encontrado via id" + id));

        estudante.setNome(estudanteAlterado.getNome());

        return estudanteRepository.save(estudante);
    }
}
