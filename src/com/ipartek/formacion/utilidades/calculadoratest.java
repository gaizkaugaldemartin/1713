package com.ipartek.formacion.utilidades;

import static org.junit.Assert.*;

import org.junit.Test;

public class calculadoratest {

	@Test
	public void testSumar() {
		// fail("Not yet implemented");
		int resultado = calculadora.sumar(2, 3);
		assertEquals("No suma bien", 5, resultado);
	}

	@Test
	public void testrestar() {

		assertEquals(0, calculadora.restar(2, 2));
		assertEquals(-1, calculadora.restar(2, 3));
		assertEquals(1, calculadora.restar(3, 2));
	}

	@Test
	public void testmultiplicar() {
		// fail("Not yet implemented");
		assertEquals(4, calculadora.multiplicar(2, 2));
		assertEquals(0, calculadora.multiplicar(2, 0));
		assertEquals(0, calculadora.multiplicar(0, 2));
		assertEquals(-4, calculadora.multiplicar(2, -2));
	}

	

}
