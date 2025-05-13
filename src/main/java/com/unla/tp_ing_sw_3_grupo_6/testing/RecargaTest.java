package com.unla.tp_ing_sw_3_grupo_6.testing;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.unla.tp_ing_sw_3_grupo_6.entity.Recarga;

public class RecargaTest {

	@Test
	public void testMontoPositivo() {
		Recarga recarga = new Recarga();
		recarga.setMonto(-500D);
		assertEquals(150.0, recarga.getMonto(), 0.001);
	}

	@Test(expected = IllegalArgumentException.class)
	public void testMontoNegativoNoPermitido() {
		new Recarga(1L, -200D, null, null);
	}
}