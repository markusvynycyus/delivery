package com.venicios.delivery.Controller;

import com.venicios.delivery.Repository.CidadeRepository;
import com.venicios.delivery.model.Cidade;
import com.venicios.delivery.model.Cozinha;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
}
