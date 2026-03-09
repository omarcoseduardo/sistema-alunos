package com.demo.sistema_alunos.controller;

import com.demo.sistema_alunos.dto.SystemInformation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;

@RestController
@RequestMapping("/sistema")
public class SistemaController {

    @GetMapping("/info")
    public SystemInformation obterInformacoesSistema() {

        return new SystemInformation(
                "sistema-alunos",
                "1.0.0",
                LocalDateTime.now(),
                "operacional"
        );
    }
}