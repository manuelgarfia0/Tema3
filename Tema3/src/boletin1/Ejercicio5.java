package boletin1;

import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		// Creo una tabla para los 10 números a introducir
		double numeros[] = new double[10];
		// Creao un escaner para que el usuario pueda introducir los números
		Scanner teclado = new Scanner(System.in);
		double sumaNumeros;
		double max = Double.MAX_VALUE;
		double min = Double.MIN_VALUE;
		// Creo un for para que el usuario pueda modificar la tabla
		for (int i = 0; i < numeros.length; i++) {
			System.out.println("Introduce un número: ");
			numeros[i] = teclado.nextDouble();
		}
		// Creo un for-each para proyectar la tabla
		for (double valor : numeros) {
			System.out.print(valor + " ");
		}

	}

}