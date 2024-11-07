package boletin1;

import java.util.Scanner;

public class Ejercicio6 {

	public static void main(String[] args) {
		// Creo un escaner para que el usuario pueda introducir los numeros
		Scanner teclado = new Scanner(System.in);
		// Creo una tabla para los 8 números que hay que introducir
		int numeros[] = new int[8];
		// Creo un for para modificar la tabla
		for (int i = 0; i < numeros.length; i++) {
			System.out.println("Introduce un número: ");
			numeros[i] = teclado.nextInt();
		}
		// Creo un for-each para poder imprimir la tabla
		for (int valor : numeros) {
			System.out.print(valor + " ");
			// Creo un if y después un else para que me identifique si un número es par o
			// impar
			if (valor % 2 == 0) {
				System.out.println(" Par");
			} else {
				System.out.println("Impar");
			}
		}
	}

}
