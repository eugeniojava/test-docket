package com.eugeniojava.testdocket.controller.form;

import com.eugeniojava.testdocket.model.Certidao;

import javax.validation.constraints.NotBlank;

public class CertidaoForm {

    @NotBlank
    private String nome;

    public Certidao toModel() {
        Certidao certidao = new Certidao();

        certidao.setNome(nome);

        return certidao;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "CertidaoForm{" +
                "nome='" + nome + '\'' +
                '}';
    }
}
