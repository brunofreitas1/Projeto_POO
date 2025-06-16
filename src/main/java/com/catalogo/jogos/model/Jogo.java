package com.catalogo.jogos.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

import java.time.LocalDate;

@Data
@Entity
public class Jogo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank
    private String nome;

    @Column(length = 1000)
    private String descricao;

    private String desenvolvedora;

    private String genero;

    private String plataforma;

    private LocalDate dataLancamento;

    private String classificacaoIndicativa;

    private Double notaMedia;

    @NotNull
    private Double preco;
}
