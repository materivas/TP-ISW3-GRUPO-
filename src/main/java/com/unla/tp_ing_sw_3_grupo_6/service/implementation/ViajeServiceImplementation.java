package com.unla.tp_ing_sw_3_grupo_6.service.implementation;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.unla.tp_ing_sw_3_grupo_6.entity.Viaje;
import com.unla.tp_ing_sw_3_grupo_6.repository.ViajeRepository;
import com.unla.tp_ing_sw_3_grupo_6.service.ViajeService;

@Service
@Transactional(readOnly = true)
public class ViajeServiceImplementation implements ViajeService {

	private final ViajeRepository viajeRepository;

	public ViajeServiceImplementation(ViajeRepository repo) {
		this.viajeRepository = repo;
	}

	@Override
	@Transactional
	public Viaje crear(Viaje v) {
		return viajeRepository.save(v);
	}

	@Override
	public List<Viaje> findAll() {
		return viajeRepository.findAll();
	}

	@Override
	public Viaje findById(Long id) {
		return viajeRepository.findById(id).orElse(null);
	}
}
