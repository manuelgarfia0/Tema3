package boletin2;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);

		Integer[] puntuaciones = new Integer[8];

		// Hago un for para que el usuario introduzca las puntuaciones
		System.out.println("Introduce las puntuaciones (1000-2800) de los 8 jugadores:");
		for (int i = 0; i < puntuaciones.length; i++) {
			System.out.print("Puntuación del jugador " + (i + 1) + ": ");
			puntuaciones[i] = teclado.nextInt();
		}

		// Ordenar las puntuaciones en orden descendente
		Arrays.sort(puntuaciones, Collections.reverseOrder());

		// Mostrar las puntuaciones en orden descendente
		System.out.println("Ranking de puntuaciones:");
		for (int i = 0; i < puntuaciones.length; i++) {
			System.out.println("Jugador " + (i + 1) + ": " + puntuaciones[i]);
		}

	}
}