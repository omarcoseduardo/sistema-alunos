package com.demo.sistema_alunos.dto;

import java.time.LocalDateTime;

public class SystemInformation {

    private String nome;
    private String versao;
    private LocalDateTime dataHora;
    private String status;

    public SystemInformation(String nome, String versao, LocalDateTime dataHora, String status) {
        this.nome = nome;
        this.versao = versao;
        this.dataHora = dataHora;
        this.status = status;
    }

    public String getNome() {
        return nome;
    }

    public String getVersao() {
        return versao;
    }

    public LocalDateTime getDataHora() {
        return dataHora;
    }

    public String getStatus() {
        return status;
    }
}
