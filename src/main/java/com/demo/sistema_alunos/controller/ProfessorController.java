package com.demo.sistema_alunos.controller;

import com.demo.sistema_alunos.model.Professor;
import com.demo.sistema_alunos.service.ProfessorService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping({"/professor"})
public class ProfessorController {

    private final ProfessorService professorService;

    public ProfessorController(ProfessorService professorService) {
        this.professorService = professorService;
    }

    @GetMapping
    public List<Professor> buscarTodos() {
        return professorService.buscarTodos();
    }

    @GetMapping("/{id}")
    public Professor buscarPorId(@PathVariable Long id) {
        return professorService.buscarPorId(id).orElse(null);
    }

    @DeleteMapping("/{id}")
    public void deletarProfessor(@PathVariable Long id){
        professorService.deletarProfessor(id);
    }

    @PostMapping
    public Professor adcionarProfessor(@RequestBody Professor professor) {
        return professorService.adicionarProfessor(professor);
    }

    @PutMapping("/{id}")
    public Professor alterarProfessor(@PathVariable Long id, @RequestBody Professor professorAlterado){
        return professorService.alterarProfessor(id,professorAlterado);
    }

}
