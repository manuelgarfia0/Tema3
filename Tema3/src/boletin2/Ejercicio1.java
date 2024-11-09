package boletin2;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		int tamaño;
		int valor;

		// Pide al usuario el tamaño de la tabla
		System.out.print("Introduce el tamaño de la tabla: ");
		tamaño = teclado.nextInt();

		// Pider al usuario el número que quiere almacenar en la tabla
		System.out.print("Introduce el valor para cada posición: ");
		valor = teclado.nextInt();

		// Crea la tabla del tamaño que ha pedido el usuario
		int[] tabla = new int[tamaño];
		for (int i = 0; i < tamaño; i++) {
			tabla[i] = valor;
		}

		// Usando un for-each muestra la tabla
		for (int numeros : tabla) {
			System.out.print(numeros + " ");
		}

	}
}