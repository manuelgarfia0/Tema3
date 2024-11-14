package boletin2;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int[] primero = new int[10];
		int[] segundo = new int[10];

		System.out.println("Introduce 20 valores enteros:");

		// Lleno el primer array con los primeros 10 valores
		for (int i = 0; i < 10; i++) {
			System.out.print("Valor " + (i + 1) + ": ");
			primero[i] = scanner.nextInt();
		}

		// Lleno el segundo array con los últimos 10 valores
		for (int i = 0; i < 10; i++) {
			System.out.print("Valor " + (i + 11) + ": ");
			segundo[i] = scanner.nextInt();
		}

		// Comparo ambos arrays
		if (Arrays.equals(primero, segundo)) {
			System.out.println("Los dos arrays son iguales.");
		} else {
			System.out.println("Los dos arrays son diferentes.");
		}
	}
}