package com.venicios.delivery.domain.repository;

import com.venicios.delivery.domain.model.Cidade;
import com.venicios.delivery.domain.model.Restaurante;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CidadeRepository extends JpaRepository<Cidade, Long> {

    @Query("from Cidade where nome like %:nome% and estado.id = :id")
    List<Cidade> consultarPorCidadeNome(String nome, @Param("id") Long estado);


}
