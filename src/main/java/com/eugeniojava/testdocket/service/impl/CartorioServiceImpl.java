package com.eugeniojava.testdocket.service.impl;

import com.eugeniojava.testdocket.controller.dto.CartorioDto;
import com.eugeniojava.testdocket.controller.form.CartorioForm;
import com.eugeniojava.testdocket.model.Cartorio;
import com.eugeniojava.testdocket.model.Certidao;
import com.eugeniojava.testdocket.model.Endereco;
import com.eugeniojava.testdocket.repository.CartorioRepository;
import com.eugeniojava.testdocket.repository.CertidaoRepository;
import com.eugeniojava.testdocket.repository.EnderecoRepository;
import com.eugeniojava.testdocket.service.CartorioService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class CartorioServiceImpl implements CartorioService {

    private final CartorioRepository cartorioRepository;

    private final CertidaoRepository certidaoRepository;

    private final EnderecoRepository enderecoRepository;

    public CartorioServiceImpl(CartorioRepository cartorioRepository,
                               CertidaoRepository certidaoRepository,
                               EnderecoRepository enderecoRepository) {
        this.cartorioRepository = cartorioRepository;
        this.certidaoRepository = certidaoRepository;
        this.enderecoRepository = enderecoRepository;
    }

    public List<CartorioDto> getAll() {
//        List<Cartorio> cartorios = cartorioRepository.findAll();
        List<Cartorio> cartorios = new ArrayList<>();

        Cartorio cartorio1 = new Cartorio();
        cartorio1.setId(1L);
        cartorio1.setNome("Cartório 1");
        Endereco endereco1 = new Endereco();
        endereco1.setId(1L);
        endereco1.setLogradouro("Avenida Paulista 1");
        endereco1.setNumero("1335");
        endereco1.setComplemento("Apartamento 543A");
        endereco1.setCidade("São Paulo");
        endereco1.setEstado("SP");
        endereco1.setCep("12494-265");
        endereco1.setCartorio(cartorio1);
        Certidao certidao1 = new Certidao();
        certidao1.setId(1L);
        certidao1.setNome("Certidão de nascimento");
        certidao1.setCartorio(cartorio1);
        Certidao certidao2 = new Certidao();
        certidao2.setId(2L);
        certidao2.setNome("Certidão de casamento");
        certidao2.setCartorio(cartorio1);
        List<Certidao> certidoes1 = Arrays.asList(certidao1, certidao2);
        cartorio1.setEndereco(endereco1);
        cartorio1.setCertidoes(certidoes1);
        cartorios.add(cartorio1);

        Cartorio cartorio2 = new Cartorio();
        cartorio2.setId(2L);
        cartorio2.setNome("Cartório 2");
        Endereco endereco2 = new Endereco();
        endereco2.setId(2L);
        endereco2.setLogradouro("Avenida Paulista 2");
        endereco2.setNumero("1335");
        endereco2.setComplemento("Apartamento 543A");
        endereco2.setCidade("São Paulo");
        endereco2.setEstado("SP");
        endereco2.setCep("12494-265");
        endereco2.setCartorio(cartorio2);
        Certidao certidao3 = new Certidao();
        certidao3.setId(3L);
        certidao3.setNome("Certidão de nascimento");
        certidao3.setCartorio(cartorio2);
        Certidao certidao4 = new Certidao();
        certidao4.setId(4L);
        certidao4.setNome("Certidão de casamento");
        certidao4.setCartorio(cartorio2);
        List<Certidao> certidoes2 = Arrays.asList(certidao3, certidao4);
        cartorio2.setEndereco(endereco2);
        cartorio2.setCertidoes(certidoes2);
        cartorios.add(cartorio2);

        Cartorio cartorio3 = new Cartorio();
        cartorio3.setId(3L);
        cartorio3.setNome("Cartório 3");
        Endereco endereco3 = new Endereco();
        endereco3.setId(3L);
        endereco3.setLogradouro("Avenida Paulista 3");
        endereco3.setNumero("1335");
        endereco3.setComplemento("Apartamento 543A");
        endereco3.setCidade("São Paulo");
        endereco3.setEstado("SP");
        endereco3.setCep("12494-265");
        endereco3.setCartorio(cartorio3);
        Certidao certidao5 = new Certidao();
        certidao5.setId(5L);
        certidao5.setNome("Certidão de nascimento");
        certidao5.setCartorio(cartorio3);
        Certidao certidao6 = new Certidao();
        certidao6.setId(6L);
        certidao6.setNome("Certidão de casamento");
        certidao6.setCartorio(cartorio3);
        List<Certidao> certidoes3 = Arrays.asList(certidao5, certidao6);
        cartorio3.setEndereco(endereco3);
        cartorio3.setCertidoes(certidoes3);
        cartorios.add(cartorio3);

        return CartorioDto.fromModels(cartorios);
    }

    public CartorioDto create(CartorioForm cartorioForm) {
        Endereco endereco = cartorioForm.getEndereco().toModel();
        List<Certidao> certidoes = new ArrayList<>();
        cartorioForm.getCertidoes().forEach(cf -> {
            certidoes.add(cf.toModel());
        });
        Cartorio cartorio = cartorioForm.toModel();

        endereco.setCartorio(cartorio);
        certidoes.forEach(c -> c.setCartorio(cartorio));
        cartorio.setEndereco(endereco);
        cartorio.setCertidoes(certidoes);

        cartorioRepository.save(cartorio);
        enderecoRepository.save(endereco);
        certidaoRepository.saveAll(certidoes);

        return new CartorioDto(cartorio);
    }

    @Override
    public void delete(Long id) {
        if (cartorioRepository.findById(id).isPresent()) {
            cartorioRepository.deleteById(id);
        }
    }
}
