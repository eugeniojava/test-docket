package com.eugeniojava.testdocket.controller;

import com.eugeniojava.testdocket.controller.dto.CartorioDto;
import com.eugeniojava.testdocket.controller.form.CartorioForm;
import com.eugeniojava.testdocket.service.impl.CartorioServiceImpl;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@Controller
@RequestMapping("/cartorios")
public class CartorioController {

    private final CartorioServiceImpl cartorioService;

    public CartorioController(CartorioServiceImpl cartorioService) {
        this.cartorioService = cartorioService;
    }

    @GetMapping
    public String getAll(Model model) {
        model.addAttribute("cartorioDtos", cartorioService.getAll());

        return "cartorios/listaTodos";
    }

    @PostMapping
    public CartorioDto create(
            @Valid @RequestBody CartorioForm cartorioForm) {
        return cartorioService.create(cartorioForm);
    }

    @GetMapping("/delete/{id}")
    public String delete(@PathVariable Long id) {
        cartorioService.delete(id);

        return "redirect:cartorios/listaTodos";
    }
}
