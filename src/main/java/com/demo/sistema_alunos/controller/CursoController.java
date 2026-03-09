package com.demo.sistema_alunos.controller;

import com.demo.sistema_alunos.model.Curso;
import com.demo.sistema_alunos.service.CursoService;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/curso")
public class CursoController {

    private final CursoService cursoService;

    public CursoController(CursoService cursoService){
        this.cursoService = cursoService;
    }

    @GetMapping
    public List<Curso> buscarTodos(){
        return cursoService.buscarTodos();
    }

    @GetMapping("/{id}")
    public Curso buscarPorId(@PathVariable Long id){
        return cursoService.buscarPorId(id).orElse(null);
    }

    @DeleteMapping("/{id}")
    public void deletarCurso(@PathVariable Long id){
        cursoService.deletarCurso(id);
    }

    @PostMapping
    public Curso adicionarCurso(@RequestBody Curso curso) {
        return cursoService.adicionarCurso(curso);
    }

    @PutMapping("/{id}")
    public Curso alterarCurso(@PathVariable Long id, @RequestBody Curso cursoAlterado){
        return cursoService.alterarCurso(id,cursoAlterado);
    }

}

