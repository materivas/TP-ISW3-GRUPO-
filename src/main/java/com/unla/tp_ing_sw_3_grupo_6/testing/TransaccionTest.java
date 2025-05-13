package com.unla.tp_ing_sw_3_grupo_6.testing;

import static org.junit.Assert.assertEquals;

import java.time.LocalDateTime;

import org.junit.Test;

import com.unla.tp_ing_sw_3_grupo_6.entity.Transaccion;

public class TransaccionTest {

	@Test
	public void testConstructorYGetters() {
		LocalDateTime fecha = LocalDateTime.of(2025, 5, 1, 8, 0);
		Transaccion transaccion = new Transaccion(1L, "TIPO", 20D, null, null, null, null);
		assertEquals(null, transaccion.getTarjeta());
		assertEquals(null, transaccion.getRecarga());
		assertEquals(42.50, transaccion.getImporte(), 0.001);
		assertEquals(fecha, transaccion.getFechaHora());
	}

	@Test(expected = IllegalArgumentException.class)
	public void testMontoNegativoNoPermitido() {
		LocalDateTime fecha = LocalDateTime.now();
		new Transaccion(1L, "TIPO", -20D, fecha, null, null, null);
	}

	@Test(expected = IllegalArgumentException.class)
	public void testFechaNullNoPermitida() {
		new Transaccion(1L, "TIPO", 20D, null, null, null, null);
	}
}
