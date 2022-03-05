package com.venicios.delivery.domain.service;

import com.venicios.delivery.domain.dto.UsuarioDTO;
import com.venicios.delivery.domain.model.Usuario;
import com.venicios.delivery.domain.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
public class UsuarioService {

    @Autowired
    private UsuarioRepository repository;

    @Transactional
    public UsuarioDTO findById(Long id) {
        Usuario entity = repository.findById(id).get();
        UsuarioDTO dto = new UsuarioDTO(entity);
        return dto;
    }
}