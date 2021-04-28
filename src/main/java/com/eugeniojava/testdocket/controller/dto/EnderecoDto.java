package com.eugeniojava.testdocket.controller.dto;

import com.eugeniojava.testdocket.model.Endereco;

public class EnderecoDto {

    private final String logradouro;
    private final String numero;
    private final String complemento;
    private final String cidade;
    private final String estado;
    private final String cep;
    private final String cartorio;

    public EnderecoDto(Endereco endereco) {
        this.logradouro = endereco.getLogradouro();
        this.numero = endereco.getNumero();
        this.complemento = endereco.getComplemento();
        this.cidade = endereco.getCidade();
        this.estado = endereco.getEstado();
        this.cep = endereco.getCep();
        this.cartorio = endereco.getCartorio().getNome();
    }

    public String getLogradouro() {
        return logradouro;
    }

    public String getNumero() {
        return numero;
    }

    public String getComplemento() {
        return complemento;
    }

    public String getCidade() {
        return cidade;
    }

    public String getEstado() {
        return estado;
    }

    public String getCep() {
        return cep;
    }

    public String getCartorio() {
        return cartorio;
    }
}
