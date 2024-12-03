package boletin5;

import java.util.Arrays;
import java.util.Random;

public class Ejercicio2 {

	public static void main(String[] args) {

		int tabla[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };

		desordenarTabla(tabla);

		System.out.println(Arrays.toString(tabla));

	}

	static void desordenarTabla(int[] tabla) {

		Random random = new Random();

		int posAleatoria;
		int aux;

		for (int i = 0; i < tabla.length; i++) {
			posAleatoria = random.nextInt(0, tabla.length);
			aux = tabla[i];
			tabla[i] = tabla[posAleatoria];
			tabla[posAleatoria] = aux;
		}

	}

}