package com.eugeniojava.testdocket.controller.dto;

import com.eugeniojava.testdocket.model.Certidao;

import java.util.List;
import java.util.stream.Collectors;

public class CertidaoDto {

    private final String nome;

    public CertidaoDto(Certidao certidao) {
        this.nome = certidao.getNome();
    }

    public static List<CertidaoDto> fromModels(List<Certidao> certidoes) {
        return certidoes
                .stream()
                .map(CertidaoDto::new)
                .collect(Collectors.toList());
    }

    public String getNome() {
        return nome;
    }
}
