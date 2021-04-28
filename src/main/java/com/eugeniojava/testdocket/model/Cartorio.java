package com.eugeniojava.testdocket.model;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import java.util.List;

@Entity
@Table(name = "cartorio_table")
public class Cartorio {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "cartorio_id")
    private Long id;

    @NotBlank
    @Column(name = "cartorio_nome")
    private String nome;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "endereco_id", referencedColumnName =
            "endereco_id")
    private Endereco endereco;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "cartorio")
    private List<Certidao> certidoes;

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

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public List<Certidao> getCertidoes() {
        return certidoes;
    }

    public void setCertidoes(List<Certidao> certidoes) {
        this.certidoes = certidoes;
    }
}
