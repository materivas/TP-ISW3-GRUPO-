package com.unla.tp_ing_sw_3_grupo_6.testing;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.unla.tp_ing_sw_3_grupo_6.entity.MedioTransporte;

public class MedioTransporteTest {

	@Test
	public void testConstructorYGetters() {
		MedioTransporte medioTransporte = new MedioTransporte(1L, "colectivo", "C123");
		assertEquals("colectivo", medioTransporte.getTipo());
		assertEquals("C123", medioTransporte.getNombre());
	}

	@Test(expected = IllegalArgumentException.class)
	public void testTipoInvalidoLanzaExcepcion() {
		new MedioTransporte(2L, "avion", "A001");
	}

	@Test(expected = IllegalArgumentException.class)
	public void testCodigoNullNoPermitido() {
		new MedioTransporte(3L, "tren", null);
	}
}