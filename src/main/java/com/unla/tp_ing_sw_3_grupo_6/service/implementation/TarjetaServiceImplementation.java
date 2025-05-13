package com.unla.tp_ing_sw_3_grupo_6.service.implementation;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.unla.tp_ing_sw_3_grupo_6.entity.Tarjeta;
import com.unla.tp_ing_sw_3_grupo_6.repository.TarjetaRepository;
import com.unla.tp_ing_sw_3_grupo_6.service.TarjetaService;

@Service
@Transactional(readOnly = true)
public class TarjetaServiceImplementation implements TarjetaService {

	private final TarjetaRepository tarjetaRepository;

	public TarjetaServiceImplementation(TarjetaRepository repo) {
		this.tarjetaRepository = repo;
	}

	@Override
	@Transactional
	public Tarjeta crear(Tarjeta t) {
		return tarjetaRepository.save(t);
	}

	@Override
	public List<Tarjeta> findAll() {
		return tarjetaRepository.findAll();
	}

	@Override
	public Tarjeta findById(Long id) {
		return tarjetaRepository.findById(id).orElse(null);
	}

	@Override
	public Tarjeta findByCodigo(String codigo) {
		return tarjetaRepository.findByCodigo(codigo);
	}
}