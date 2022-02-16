package com.venicios.delivery.api.controller;

import com.venicios.delivery.domain.model.Restaurante;
import com.venicios.delivery.domain.repository.CidadeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.venicios.delivery.domain.model.Cidade;

import java.util.List;

@RestController
@RequestMapping(value="/cidades")
public class CidadeController {

    @Autowired
    private CidadeRepository cidadeRepository;


    @GetMapping
    public ResponseEntity<List<Cidade>> listarCidade(){
        List<Cidade> cidadeList = cidadeRepository.findAll();
        if(cidadeList.isEmpty()){
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }else{
            return new ResponseEntity<List<Cidade>>(cidadeList, HttpStatus.OK);
        }

    }

    @GetMapping("/por-nome")
    public List<Cidade> ciadadesPorNome(String nome, Long estadoId) {
        return cidadeRepository.consultarPorCidadeNome (nome, estadoId);
    }

}
