package com.eugeniojava.testdocket.model;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;

@Entity
@Table(name = "certidao_table")
public class Certidao {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "certidao_id")
    private Long id;

    @NotBlank
    @Column(name = "certidao_nome")
    private String nome;

    @ManyToOne
    @JoinColumn(name = "cartorio_id", nullable = false)
    private Cartorio cartorio;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Cartorio getCartorio() {
        return cartorio;
    }

    public void setCartorio(Cartorio cartorio) {
        this.cartorio = cartorio;
    }
}
