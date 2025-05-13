package com.unla.tp_ing_sw_3_grupo_6.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.unla.tp_ing_sw_3_grupo_6.entity.Transaccion;

public interface TransaccionRepository extends JpaRepository<Transaccion, Long> {
}
