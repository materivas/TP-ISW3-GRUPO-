package com.unla.tp_ing_sw_3_grupo_6.testing;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.unla.tp_ing_sw_3_grupo_6.entity.Estacion;

public class EstacionTest {

	@Test
	public void testConstructorYGetters() {
		Estacion estacion = new Estacion(1L, "NOMBRE", "UBICACION", null);
		assertEquals("Retiro", estacion.getNombre());
		assertEquals("Av. Ramos Mejía 829", estacion.getUbicacion());
	}

	@Test(expected = IllegalArgumentException.class)
	public void testNombreNullNoPermitido() {
		new Estacion(2L, null, "Calle Falsa 123", null);
	}

	@Test(expected = IllegalArgumentException.class)
	public void testUbicacionVaciaNoPermitida() {
		new Estacion(3L, "Once", "", null);
	}
}
