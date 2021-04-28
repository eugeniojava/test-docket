package com.eugeniojava.testdocket.model;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;

@Entity
@Table(name = "endereco_table")
public class Endereco {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "endereco_id")
    private Long id;

    @NotBlank
    @Column(name = "endereco_logradouro")
    private String logradouro;

    @NotBlank
    @Column(name = "endereco_numero")
    private String numero;

    @NotBlank
    @Column(name = "endereco_complemento")
    private String complemento;

    @NotBlank
    @Column(name = "endereco_cidade")
    private String cidade;

    @NotBlank
    @Column(name = "endereco_estado")
    private String estado;

    @NotBlank
    @Column(name = "endereco_cep")
    private String cep;

    @OneToOne(mappedBy = "endereco")
    @JoinColumn(name = "cartorio_id", nullable = false)
    private Cartorio cartorio;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public Cartorio getCartorio() {
        return cartorio;
    }

    public void setCartorio(Cartorio cartorio) {
        this.cartorio = cartorio;
    }
}
