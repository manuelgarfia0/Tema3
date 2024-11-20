package boletin4_1;

import java.util.Arrays;
import java.util.Random;

public class Ejercicio3 {

	public static void main(String[] args) {

		int longitud = 10;
		int fin = 100;

		int[] pares = rellenaPares(longitud, fin);

		System.out.println("Número pares:");
		for (int num : pares) {
			System.out.print(num + " ");
		}
	}

	static int[] rellenaPares(int longitud, int fin) {
		int[] tabla;
		int par;

		tabla = new int[longitud];
		Random random = new Random();

		for (int i = 0; i < longitud; i++) {
			do {
				par = random.nextInt(2, fin + 1);
			} while (par % 2 != 0);
			tabla[i] = par;
		}
		Arrays.sort(tabla);

		return tabla;
	}
}