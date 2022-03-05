package com.venicios.delivery.api.controller;

import com.venicios.delivery.domain.model.Produto;
import com.venicios.delivery.domain.model.Restaurante;
import com.venicios.delivery.domain.repository.RestauranteRepository;
import org.modelmapper.ModelMapper;
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
@RequestMapping("/restaurantes")
public class RestauranteController {

    @Autowired
    private RestauranteRepository restauranteRepository;

   // @Autowired
   //private ModelMapper modelMapper;


    @GetMapping
    public ResponseEntity<List<Restaurante>> listarRestaurante(){
        List<Restaurante> restauranteList = restauranteRepository.findAll();
        if(restauranteList.isEmpty()){
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }else{
            return new ResponseEntity<List<Restaurante>>(restauranteList, HttpStatus.OK);
        }

    }

    @GetMapping("/{id}")
    public ResponseEntity<Restaurante> buscarRestauranteId(@PathVariable(value= "id") long id){
        Optional<Restaurante> restauranteO = restauranteRepository.findById(id);
        if(!restauranteO.isPresent()){
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }else{
            return new ResponseEntity<Restaurante>(restauranteO.get(), HttpStatus.OK);
        }
    }
    @GetMapping("/por-nome")
    public List<Restaurante> restaurantesPorNome(String nome, Long cozinhaId) {
        return restauranteRepository.consultarPorNome(nome, cozinhaId);
    }


}
