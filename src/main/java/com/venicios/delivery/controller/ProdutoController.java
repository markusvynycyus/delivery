package com.venicios.delivery.controller;

import com.venicios.delivery.model.Cidade;
import com.venicios.delivery.model.Cozinha;
import com.venicios.delivery.model.Produto;
import com.venicios.delivery.repository.ProdutoRepository;
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
@RequestMapping(value="/produtos")
public class ProdutoController {

    @Autowired
    private ProdutoRepository produtoRepository;

    @GetMapping
    public ResponseEntity<List<Produto>> listarProduto(){
        List<Produto> produtoList = produtoRepository.findAll();
        if(produtoList.isEmpty()){
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }else{
            return new ResponseEntity<List<Produto>>(produtoList, HttpStatus.OK);
        }

    }

    @GetMapping("/{id}")
    public ResponseEntity<Produto> buscarProdutoId(@PathVariable(value= "id") long id){
        Optional<Produto> produtoO = produtoRepository.findById(id);
        if(!produtoO.isPresent()){
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }else{
            return new ResponseEntity<Produto>(produtoO.get(), HttpStatus.OK);
        }
    }

}
