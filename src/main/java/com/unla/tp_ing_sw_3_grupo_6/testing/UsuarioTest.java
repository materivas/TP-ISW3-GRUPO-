package com.unla.tp_ing_sw_3_grupo_6.testing;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.unla.tp_ing_sw_3_grupo_6.entity.Usuario;

public class UsuarioTest {

	@Test
	public void testConstructorYGetters() {
		Usuario usuario = new Usuario("NOMBRE", "APELLIDO", "EMAIL@GMAIL.COM", "CONTRASENIA", null, "ROL", "TIPO_DNI",
				1111111, "GENERO", "11 1111-1111");
		usuario.setId(1L);
		assertEquals("Juan", usuario.getNombre());
		assertEquals("jperez@example.com", usuario.getEmail());
		assertEquals("USUARIO", usuario.getRol());
	}

	@Test(expected = IllegalArgumentException.class)
	public void testEmailInvalido() {
		new Usuario("NOMBRE", "APELLIDO", "EMAIL-GMAIL_COM", "CONTRASENIA", null, "ROL", "TIPO_DNI", 1111111, "GENERO",
				"11 1111-1111");
	}
}
