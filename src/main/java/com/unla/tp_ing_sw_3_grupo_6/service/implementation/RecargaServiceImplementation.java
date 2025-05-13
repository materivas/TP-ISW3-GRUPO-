package com.unla.tp_ing_sw_3_grupo_6.service.implementation;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.unla.tp_ing_sw_3_grupo_6.entity.Recarga;
import com.unla.tp_ing_sw_3_grupo_6.repository.RecargaRepository;
import com.unla.tp_ing_sw_3_grupo_6.service.RecargaService;

@Service
@Transactional(readOnly = true)
public class RecargaServiceImplementation implements RecargaService {

	private final RecargaRepository recargaRepository;

	public RecargaServiceImplementation(RecargaRepository repo) {
		this.recargaRepository = repo;
	}

	@Override
	@Transactional
	public Recarga crear(Recarga r) {
		return recargaRepository.save(r);
	}

	@Override
	public List<Recarga> findAll() {
		return recargaRepository.findAll();
	}

	@Override
	public Recarga findById(Long id) {
		return recargaRepository.findById(id).orElse(null);
	}
}
