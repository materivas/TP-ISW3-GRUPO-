package com.unla.tp_ing_sw_3_grupo_6.testing;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class TestRunner {
	public static void main(String[] args) {
		Class<?>[] tests = { UsuarioTest.class, TarjetaTest.class, RecargaTest.class, EstacionTest.class,
				MedioTransporteTest.class, TransaccionTest.class, ViajeTest.class };
		Result result = JUnitCore.runClasses(tests);

		System.out.println("+++++ Resultados de Pruebas Unitarias α +++++");
		System.out.printf("Total pruebas: %d, Fallidas: %d%n", result.getRunCount(), result.getFailureCount());

		for (Failure failure : result.getFailures()) {
			System.out.printf("Prueba fallida: %s%nMotivo: %s%n", failure.getTestHeader(), failure.getMessage());
		}

		System.out.println(result.wasSuccessful() ? "¡Todos los tests pasaron!" : "Algunas pruebas fallaron.");
	}
}