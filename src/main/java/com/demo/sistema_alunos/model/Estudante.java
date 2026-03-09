package com.demo.sistema_alunos.model;

import jakarta.persistence.*;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="estudante")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Estudante {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, length = 100)
    private String nome;

    @Column(nullable = false, unique = true)
    private Integer matricula;

    @ManyToOne
    @JoinColumn(name = "curso_id", nullable = false) // cria a FK no banco
    private Curso curso;
}
