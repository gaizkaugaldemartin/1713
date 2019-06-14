package com.ipartek.formacion.utilidades;

import static org.junit.Assert.*;

import org.junit.Test;

public class calculadoradevoluciontest {

	@Test(expected = Exception.class)
	public void entregadomenorimporteException() throws Exception {

		calculadoradevolucion.vueltas(100, 2);
	}

	@Test(expected = Exception.class)
	public void importenegativoException() throws Exception {

		calculadoradevolucion.vueltas(-100, 2);
	}

	@Test(expected = Exception.class)
	public void entregadonegativoException() throws Exception {

		calculadoradevolucion.vueltas(100, -2);
	}

	@Test

	public void importeExacto() throws Exception {

		calculadoradevolucion.vueltas(100, 100);

		int[] vueltas = calculadoradevolucion.vueltas(500, 501);

	
		assertEquals("500", 0 , vueltas[0]);
		assertEquals("200", 1 , vueltas[1]);
		assertEquals("100", 1 , vueltas[2]);
		assertEquals("50", 0 , vueltas[3]);
		assertEquals("20", 0 , vueltas[4]);
		assertEquals("10", 0 , vueltas[5]);
		assertEquals("5", 0 , vueltas[6]);
		assertEquals("2", 0 , vueltas[7]);
		assertEquals("1", 1 , vueltas[8]);
		assertEquals("50 cents", 0 , vueltas[9]);
		assertEquals("20 cents", 0 , vueltas[10]);
		assertEquals("10 cents", 0 , vueltas[11]);
		assertEquals("5 cents", 0 , vueltas[12]);
		assertEquals("2 cents", 0 , vueltas[13]);
		assertEquals("1 cents", 0 , vueltas[14]);
		
		
		}
		
		
		
	}


