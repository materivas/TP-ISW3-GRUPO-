package com.unla.tp_ing_sw_3_grupo_6.service;

import java.util.List;

import com.unla.tp_ing_sw_3_grupo_6.entity.Usuario;

public interface UsuarioService {
	Usuario crear(Usuario u);

	List<Usuario> findAll();

	Usuario findById(Long id);

	Usuario findByEmail(String email);

	Usuario findByEmailAndContrasenia(String email, String contrasenia);

	Usuario findByDni(int dni);
}
