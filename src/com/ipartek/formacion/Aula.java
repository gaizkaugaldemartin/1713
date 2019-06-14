package com.ipartek.formacion;

public class Aula {

	public static void main(String[] args) {

		// declarar array con nombre alumnos
		String[] alumnos = { 
						     "Ander",
							 "Mounir", 
				             "Andoni",
				             "Asier",
				             "Jon C",
				             "Arkaitz",
				             "Aritz",
				             "Manuel",
				             "Iker",
				             "Eder I",
				             "Eder S",
				             "Gaizka",
				             "Borja",
				             "Verónica",
				             "Jon A",
				             "José Luis"};

		// generar numero aleatorio 0 - alumnos.length
		int numero = (int) (Math.random() * alumnos.length);

		System.out.println("El Volunatior es " + alumnos[numero]);


		
		for (int i = 0; i < alumnos.length; i++) {
			

			if (numero == i) {

				System.out.println("*** " + alumnos[i]);

			} else {

				System.out.println(i + " " + alumnos[i]);

			}

		} // end for
		
		
		

	}

}
