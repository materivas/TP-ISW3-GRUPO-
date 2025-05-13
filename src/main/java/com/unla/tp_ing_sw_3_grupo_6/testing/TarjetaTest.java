package com.unla.tp_ing_sw_3_grupo_6.testing;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.unla.tp_ing_sw_3_grupo_6.entity.Tarjeta;

public class TarjetaTest {

	@Test
	public void testSaldoInicialPorDefecto() {
		Tarjeta tarjeta = new Tarjeta();
		tarjeta.setSaldo(-500D);
		assertEquals(0.0, tarjeta.getSaldo(), 0.001);
		assertEquals(null, tarjeta.getUsuario());
	}

	@Test(expected = IllegalArgumentException.class)
	public void testSaldoNegativoNoPermitido() {
		Tarjeta t = new Tarjeta();
		t.setSaldo(-100.0);
	}
}