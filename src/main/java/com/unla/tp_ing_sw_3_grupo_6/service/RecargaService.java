package com.unla.tp_ing_sw_3_grupo_6.service;

import java.util.List;

import com.unla.tp_ing_sw_3_grupo_6.entity.Recarga;

public interface RecargaService {
	Recarga crear(Recarga r);

	List<Recarga> findAll();

	Recarga findById(Long id);
}
