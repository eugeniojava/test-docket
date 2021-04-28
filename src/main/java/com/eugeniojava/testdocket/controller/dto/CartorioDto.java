package com.eugeniojava.testdocket.controller.dto;

import com.eugeniojava.testdocket.model.Cartorio;

import java.util.List;
import java.util.stream.Collectors;

public class CartorioDto {

    private final Long id;
    private final String nome;
    private final EnderecoDto endereco;
    private final List<CertidaoDto> certidoes;

    public CartorioDto(Cartorio cartorio) {
        this.id = cartorio.getId();
        this.nome = cartorio.getNome();
        this.endereco = new EnderecoDto(cartorio.getEndereco());
        this.certidoes = CertidaoDto.fromModels(cartorio.getCertidoes());
    }

    public static List<CartorioDto> fromModels(List<Cartorio> cartorios) {
        return cartorios
                .stream()
                .map(CartorioDto::new)
                .collect(Collectors.toList());
    }

    public Long getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public EnderecoDto getEndereco() {
        return endereco;
    }

    public List<CertidaoDto> getCertidoes() {
        return certidoes;
    }
}

