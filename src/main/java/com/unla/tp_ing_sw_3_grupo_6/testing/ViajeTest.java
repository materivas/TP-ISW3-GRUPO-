package com.unla.tp_ing_sw_3_grupo_6.testing;

import static org.junit.Assert.assertEquals;

import java.time.LocalDateTime;

import org.junit.Test;

import com.unla.tp_ing_sw_3_grupo_6.entity.Viaje;

public class ViajeTest {

	@Test
	public void testConstructorYGetters() {
		LocalDateTime ingreso = LocalDateTime.of(2025, 5, 1, 7, 30);
		Viaje viaje = new Viaje(1L, LocalDateTime.now(), null, null, null, null);
		assertEquals(null, viaje.getEstacionOrigen());
		assertEquals(null, viaje.getEstacionDestino());
		assertEquals(ingreso, viaje.getFechaHora());
	}

	@Test
	public void testEgresoNullPermitidoMientrasNoSeCierre() {
		Viaje v = new Viaje(1L, null, null, null, null, null);
		assertEquals(null, v.getFechaHora());
	}
}