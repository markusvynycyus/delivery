package com.venicios.delivery.repository;

import com.venicios.delivery.model.Estado;
import com.venicios.delivery.model.Restaurante;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EstadoRepository extends JpaRepository<Estado, Long> {


}
