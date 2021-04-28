package com.eugeniojava.testdocket.controller.form;

import com.eugeniojava.testdocket.model.Cartorio;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.util.List;

public class CartorioForm {

    @NotBlank
    private String nome;

    @NotNull
    private EnderecoForm endereco;

    @NotNull
    private List<CertidaoForm> certidoes;

    public Cartorio toModel() {
        Cartorio cartorio = new Cartorio();

        cartorio.setNome(nome);

        return cartorio;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public EnderecoForm getEndereco() {
        return endereco;
    }

    public void setEndereco(EnderecoForm endereco) {
        this.endereco = endereco;
    }

    public List<CertidaoForm> getCertidoes() {
        return certidoes;
    }

    public void setCertidoes(List<CertidaoForm> certidoes) {
        this.certidoes = certidoes;
    }

    @Override
    public String toString() {
        return "CartorioForm{" +
                "nome='" + nome + '\'' +
                ", endereco=" + endereco +
                ", certidoes=" + certidoes +
                '}';
    }
}
