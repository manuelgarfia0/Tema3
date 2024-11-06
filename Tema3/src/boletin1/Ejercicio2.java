package boletin1;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		// Creo la tabla para los números
		double numeros[] = new double[5];
		// Introduzco un escaner para que el usuario pueda introducir números
		Scanner teclado = new Scanner(System.in);
		// Creo un for para que el usuario pueda modificar la tabla
		for (int i = 0; i < numeros.length; i++) {
			System.out.println("Introduce 5 números: ");
			numeros[i] = teclado.nextDouble();
		}
		// Creo un for-each para ver los valores que se han introducido en la tabla
		// anteriormente
		for (double valor : numeros) {
			System.out.print(valor + " ");
		}

	}

}