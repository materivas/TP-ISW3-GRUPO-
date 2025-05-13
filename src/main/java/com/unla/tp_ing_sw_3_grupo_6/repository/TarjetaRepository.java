package com.unla.tp_ing_sw_3_grupo_6.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.unla.tp_ing_sw_3_grupo_6.entity.Tarjeta;

public interface TarjetaRepository extends JpaRepository<Tarjeta, Long> {
	Tarjeta findByCodigo(String codigo);
}
