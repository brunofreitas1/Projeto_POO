package com.catalogo.jogos.model;

import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
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

