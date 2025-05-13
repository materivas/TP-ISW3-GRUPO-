package com.unla.tp_ing_sw_3_grupo_6.service;

import java.util.List;

import com.unla.tp_ing_sw_3_grupo_6.entity.MedioTransporte;

public interface MedioTransporteService {
	MedioTransporte crear(MedioTransporte m);

	List<MedioTransporte> findAll();

	MedioTransporte findById(Long id);
}
