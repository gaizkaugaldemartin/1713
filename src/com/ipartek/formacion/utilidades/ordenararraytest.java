package com.ipartek.formacion.utilidades;

import static org.junit.Assert.*;

import org.junit.Test;

public class ordenararraytest {

	@Test
	public void ordenartest() throws Exception {
		// fail("Not yet implemented");

		int[] prueba = { 2, 5, 7, 1, 8 };

		int[] ordenarprueba = array.ordenar(prueba);

		assertEquals(1, ordenarprueba[0]);
		assertEquals(2, ordenarprueba[1]);
		assertEquals(5, ordenarprueba[2]);
		assertEquals(7, ordenarprueba[3]);
		assertEquals(8, ordenarprueba[4]);

	}

	@Test(expected = Exception.class)
	public void ordenar() throws Exception {
		// fail("Not yet implemented");

		array.ordenar(null);

	}

}
