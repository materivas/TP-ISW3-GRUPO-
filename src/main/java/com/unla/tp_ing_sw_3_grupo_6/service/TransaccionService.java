package com.unla.tp_ing_sw_3_grupo_6.service;

import java.util.List;

import com.unla.tp_ing_sw_3_grupo_6.entity.Transaccion;

public interface TransaccionService {
	Transaccion crear(Transaccion t);

	List<Transaccion> listarTodas();

	Transaccion obtenerPorId(Long id);
}
