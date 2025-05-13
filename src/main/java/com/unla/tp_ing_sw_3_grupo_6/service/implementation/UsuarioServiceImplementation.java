package com.unla.tp_ing_sw_3_grupo_6.service.implementation;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.unla.tp_ing_sw_3_grupo_6.entity.Usuario;
import com.unla.tp_ing_sw_3_grupo_6.repository.UsuarioRepository;
import com.unla.tp_ing_sw_3_grupo_6.service.UsuarioService;

@Service
@Transactional(readOnly = true)
public class UsuarioServiceImplementation implements UsuarioService {

	private final UsuarioRepository usuarioRepository;

	public UsuarioServiceImplementation(UsuarioRepository repo) {
		this.usuarioRepository = repo;
	}

	@Override
	@Transactional
	public Usuario crear(Usuario usuario) {
		return usuarioRepository.save(usuario);
	}

	@Override
	public List<Usuario> findAll() {
		return usuarioRepository.findAll();
	}

	@Override
	public Usuario findById(Long id) {
		return usuarioRepository.findById(id).orElse(null);
	}

	@Override
	public Usuario findByEmail(String email) {
		return usuarioRepository.findByEmail(email);
	}

	@Override
	public Usuario findByEmailAndContrasenia(String email, String contrasenia) {
		return usuarioRepository.findByEmailAndContrasenia(email, contrasenia);
	}

	@Override
	public Usuario findByDni(int dni) {
		return usuarioRepository.findByDni(dni);
	}
}