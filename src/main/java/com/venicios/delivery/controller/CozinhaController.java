package com.venicios.delivery.controller;

import com.venicios.delivery.repository.CozinhaRepository;
import com.venicios.delivery.model.Cozinha;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(value="/cozinhas")
public class CozinhaController {

    @Autowired
    private CozinhaRepository cozinhaRepository;

    @GetMapping
    public ResponseEntity<List<Cozinha>> listarCozinha(){
        List<Cozinha> cozinhaList = cozinhaRepository.findAll();
        if(cozinhaList.isEmpty()){
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }else{
            return new ResponseEntity<List<Cozinha>>(cozinhaList, HttpStatus.OK);
        }

    }

    @GetMapping("/{id}")
        public ResponseEntity<Cozinha> buscarCozinhaId(@PathVariable(value= "id") long id){
            Optional<Cozinha> cozinhaO = cozinhaRepository.findById(id);
            if(!cozinhaO.isPresent()){
                return new ResponseEntity<>(HttpStatus.NOT_FOUND);
            }else{
                return new ResponseEntity<Cozinha>(cozinhaO.get(), HttpStatus.OK);
            }
        }
}
