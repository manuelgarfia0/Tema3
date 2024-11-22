package boletin4_1;

import java.util.Arrays;
import java.util.Random;

public class Ejercicio3 {

	public static void main(String[] args) {
		// Creo la longitud y el maxímo de número de la tabla
		int longitud = 10;
		int fin = 100;
		// Llamo a la fución
		int[] pares = rellenaPares(longitud, fin);
		// Muestro la tabla
		System.out.println("Número pares:");
		for (int num : pares) {
			System.out.print(num + " ");
		}
	}

	// Creo una función para crear la tabla de pares
	static int[] rellenaPares(int longitud, int fin) {
		// Creo la tabla y la variable par
		int[] tabla;
		int par;
		// Le asigno la longitud a la tabla
		tabla = new int[longitud];
		// Creo un random para los números de dentro de la tabla
		Random random = new Random();
		// Creo un for para rellenar la tabla
		for (int i = 0; i < longitud; i++) {
			// Creo un do-while para que cree números pares hasta que llene la tabla
			do {
				par = random.nextInt(2, fin + 1);
			} while (par % 2 != 0);
			tabla[i] = par;
		}
		// Ordeno la tabla
		Arrays.sort(tabla);

		return tabla;
	}
}