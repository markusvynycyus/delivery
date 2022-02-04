package com.venicios.delivery.domain.repository;

import com.venicios.delivery.domain.model.Restaurante;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface RestauranteRepository extends JpaRepository<Restaurante, Long> {

    List<Restaurante> consultarPorNome(String nome, @Param("id") Long cozinha);

}
