package com.ipartek.formacion.utilidades;

public class array {

	public static int[] ordenar(int[] arraydesordenado)throws Exception {

	//	if(arraydesordenado == null) {
			
		//	throws new Exception("No puede ser null");
			
			
	//	}
		
		
		// ordenar array de menor a mayor

		// int[] arrayordenado = new int[arraydesordenado.length];

		int aux = 0;

		for (int i = 0; i < arraydesordenado.length; i++) {

			for (int j = 0; j < arraydesordenado.length - i - 1; j++) {

				if (arraydesordenado[j] > arraydesordenado[j + 1]) {

					aux = arraydesordenado[j + 1];

					arraydesordenado[j + 1] = arraydesordenado[j];

					arraydesordenado[j] = aux;

				}
			}
		}

		return arraydesordenado;

	}

}
