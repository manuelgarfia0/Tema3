package boletin2;

import java.util.Arrays;

public class Ejercicio7 {

	public static void main(String[] args) {
		// Creo una tabla con 55 de tamaño porque es el necesario en este caso
		int[] numeros = new int[55];
		// Creo una variable
		int rep = 0;

		// Creo un for para llenar la tabla con cada número del 1 al 10
		for (int i = 1; i <= 10; i++) {
			Arrays.fill(numeros, rep, rep + i, i);
			rep += i;
		}

		// Muestro la tabla
		System.out.println(Arrays.toString(numeros));
	}
}