package boletin2;

import java.util.Arrays;
import java.util.Random;

public class Ejercicio3 {

	public static void main(String[] args) {

		Random random = new Random();

		int array[] = new int[30];
		// Hacemos que el array se llene de valores aleatorios
		for (int i = 0; i < array.length; i++) {
			array[i] = random.nextInt(10);
		}
		// Muestro el array antes de que se haya ordenador
		System.out.println("Array sin ordenar: ");
		for (int valor : array) {
			System.out.print(valor + " ");
		}
		// Ordenar array
		Arrays.sort(array);

		System.out.println("");
		// Muestro el array en orden
		System.out.println("Array ordenado: ");
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
	}

}
