package com.unla.tp_ing_sw_3_grupo_6.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.unla.tp_ing_sw_3_grupo_6.entity.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
	Usuario findByEmail(String email);

	Usuario findByEmailAndContrasenia(String email, String contrasenia);

	Usuario findByDni(int dni);
}
