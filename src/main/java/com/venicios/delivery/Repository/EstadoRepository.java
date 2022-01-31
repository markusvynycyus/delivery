package com.venicios.delivery.Repository;

import com.venicios.delivery.Controller.EstadoController;
import com.venicios.delivery.model.Estado;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EstadoRepository extends JpaRepository<Estado, Long> {
}
