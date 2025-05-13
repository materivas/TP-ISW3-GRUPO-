package com.unla.tp_ing_sw_3_grupo_6.service.implementation;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.unla.tp_ing_sw_3_grupo_6.entity.Estacion;
import com.unla.tp_ing_sw_3_grupo_6.repository.EstacionRepository;
import com.unla.tp_ing_sw_3_grupo_6.service.EstacionService;

@Service
@Transactional(readOnly = true)
public class EstacionServiceImplementation implements EstacionService {

	private final EstacionRepository estacionRepository;

	public EstacionServiceImplementation(EstacionRepository repo) {
		this.estacionRepository = repo;
	}

	@Override
	@Transactional
	public Estacion crear(Estacion e) {
		return estacionRepository.save(e);
	}

	@Override
	public List<Estacion> findAll() {
		return estacionRepository.findAll();
	}

	@Override
	public Estacion findById(Long id) {
		return estacionRepository.findById(id).orElse(null);
	}
}
