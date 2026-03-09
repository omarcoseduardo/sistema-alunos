package com.demo.sistema_alunos.controller;

import com.demo.sistema_alunos.model.Estudante;
import com.demo.sistema_alunos.service.EstudanteService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/estudante")
public class EstudanteController {

    private final EstudanteService estudanteService;

    public EstudanteController(EstudanteService estudanteService) {
        this.estudanteService = estudanteService;
    }

    @GetMapping
    public List<Estudante> buscarTodos() {
        return estudanteService.buscarTodos();
    }

    @GetMapping("/{id}")
    public Estudante buscarPorId(@PathVariable Long id) {
        return estudanteService.buscarPorId(id).orElse(null);
    }

    @DeleteMapping("/{id}")
    public void deletarEstudante(@PathVariable Long id){
        estudanteService.deletarEstudante(id);
    }

    @PostMapping
    public Estudante adicionarEstudante(@RequestBody Estudante estudante) {
        return estudanteService.adicionarEstudante(estudante);
    }

    @PutMapping("/{id}")
    public Estudante alterarEstudante(@PathVariable Long id, @RequestBody Estudante estudanteAlterado){
        return estudanteService.alterarEstudante(id,estudanteAlterado);
    }

}
