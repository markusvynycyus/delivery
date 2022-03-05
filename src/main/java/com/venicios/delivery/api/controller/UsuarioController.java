package com.venicios.delivery.api.controller;

import com.venicios.delivery.domain.dto.UsuarioDTO;
import com.venicios.delivery.domain.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/usuarios")
public class UsuarioController {

    @Autowired
    private UsuarioService service;

    @GetMapping(value = "/{id}")
    public UsuarioDTO findById(@PathVariable Long id) {
        return service.findById(id);
    }
}