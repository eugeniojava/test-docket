package com.eugeniojava.testdocket.service;

import com.eugeniojava.testdocket.controller.dto.CartorioDto;
import com.eugeniojava.testdocket.controller.form.CartorioForm;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface CartorioService {

    List<CartorioDto> getAll();

    CartorioDto create(CartorioForm cartorioForm);

    void delete(Long id);
}
