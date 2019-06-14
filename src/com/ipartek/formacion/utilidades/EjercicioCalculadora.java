package com.ipartek.formacion.utilidades;

import com.ipartek.formacion.Perro;

public class EjercicioCalculadora {

	public static void main(String[] args) {

		// metodos de instancia y objeto

		Perro p = new Perro();
		p.toString();

		// metodos estaticos o de clase,obligatorio que sea static

		Math.random();
		int resultado = calculadora.sumar(2, 3);
		int resultado1 = calculadora.restar(2, 3);
		System.out.println("2 + 3=" + resultado);
		System.out.println("2 - 3=" + resultado);
	}

}
