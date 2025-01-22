package collections;

import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		// Lista que almacena números enteros
		ArrayList<Integer> numeros = new ArrayList<>();
		// Declaro una variable para introducir los números
		int numero;
		// Solicitamos al usuario que introduzca los números
		System.out.println("Introduce tantos números como quieras hasta introducir un número negativo");
		do {
			// Los números se almacenarán en la lista
			numero = scanner.nextInt();
			numeros.add(numero);
			// Mientras que no se introduzca un número negativo se podrán seguir
			// introduciendo números
		} while (numero >= 0);
		// Recorre la lista
		for (int i = 0; i < numeros.size(); i++) {
			// Coge los indices de los números pares y los imprime
			if (numeros.get(i) % 2 == 0) {
				System.out.println(i + " ");
			}
		}
		// Cierro escaner
		scanner.close();

	}

}
