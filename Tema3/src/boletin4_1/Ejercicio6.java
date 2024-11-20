package boletin4_1;

import java.util.Arrays;

public class Ejercicio6 {

	public static void main(String[] args) {

		int[] t = { 10, 1, 5, 8, 9, 2 };
		int numElementos = 4;

		int[] tabla = suma(t, numElementos);

		System.out.println(Arrays.toString(tabla));
	}

	static int[] suma(int t[], int numElementos) {

		int[] tabla = new int[numElementos];
		int cont = 0;

		for (int i = 0; i < tabla.length; i++) {
			for (int j = 0; j <= i; j++) {
				cont += j;
			}
			tabla[i] = cont;
		}

		return tabla;
	}
}