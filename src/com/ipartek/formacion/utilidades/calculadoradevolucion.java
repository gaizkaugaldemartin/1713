package com.ipartek.formacion.utilidades;

public class calculadoradevolucion {
	public static final float[] BILLETES_MONEDAS = {

			// billetes

			500, 200, 100, 50, 20, 10, 5,

			// monedas

			2, 1, 0.50f, 0.20f, 0.10f, 0.05f, 0.02f, 0.01f,

	};

	/**
	 * Calcula las vueltas obtimas para retotnar el menos numero de billetes y
	 * monedas
	 * 
	 * @param importe  float costo del acrticulo a comprar
	 * @param entegado float dinero entregado para comprar
	 * @return int[] cantidad de billetes y monedas retornadas
	 * @see public static final float[] BILLETES_MONEDAS
	 * @throws Exception importe mayor > que el entregado o si importe < 0 o
	 *                   entregado < 0
	 */

	public static int[] vueltas(float importe, float entregado) throws Exception {

		float dinerorestante = 0;
		int[] billetesvuelta = new int[BILLETES_MONEDAS.length];
		int billete = 0;

		dinerorestante = entregado - importe;

		int contador = 0;

		while (dinerorestante > 0) {

			float dinerorestaste = 0;
			billete = (int) (dinerorestaste / BILLETES_MONEDAS[contador]);

			if (billete != 0) {

				dinerorestante = dinerorestaste - (billete * BILLETES_MONEDAS[contador]);

				billetesvuelta[contador] = billete;

			} else {

				billetesvuelta[contador] = 0;

			}

			contador++;

		}
		;

		return billetesvuelta;

		// tener solo un return
		
		//redondear para que no pierda decimales math.round(billetesvuelta*100f/100f)

	}

}
