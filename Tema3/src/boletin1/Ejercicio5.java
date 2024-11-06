package boletin1;

import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {

		// Creao un escaner para que el usuario pueda introducir los números
		Scanner teclado = new Scanner(System.in);

		// Creo una tabla para los 10 números a introducir
		double numeros[] = new double[10];
		double sumaNumeros = 0;
		double max = Double.MIN_VALUE;
		double min = Double.MAX_VALUE;

		// Creo un for para que el usuario pueda modificar la tabla
		for (int i = 0; i < numeros.length; i++) {
			System.out.println("Introduce un número: ");
			numeros[i] = teclado.nextDouble();
			sumaNumeros += numeros[i];
			// Creo estos if para poder sacar el número máximo y el número mínimo
			if (numeros[i] > max) {
				max = numeros[i];
			}
			if (numeros[i] < min) {
				min = numeros[i];
			}
		}
		// Mostrar suma, máximo y mínimo
		System.out.println("La suma de los números es: " + sumaNumeros);
		System.out.println("El número mayor es: " + max);
		System.out.println("El número menor es: " + min);

	}

}