package com.unla.tp_ing_sw_3_grupo_6.configuration;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;

import com.unla.tp_ing_sw_3_grupo_6.service.UsuarioService;

import jakarta.annotation.PostConstruct;

@Component
public class PasswordEncryptor {
	private final UsuarioService usuarioService;
	private final PasswordEncoder encoder = new BCryptPasswordEncoder(10);

	public PasswordEncryptor(UsuarioService usuarioService) {
		this.usuarioService = usuarioService;
	}

	@PostConstruct
	public void init() {
		usuarioService.findAll().forEach(usuario -> {
			usuario.setContrasenia(encoder.encode(usuario.getContrasenia()));
			usuarioService.crear(usuario);
		});
	}
}
