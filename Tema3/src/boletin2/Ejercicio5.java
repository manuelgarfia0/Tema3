package boletin2;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		// Creamos un escaner para que el usuario pueda introducir el número que se le
		// pide
		Scanner teclado = new Scanner(System.in);
		// Creamos un random para que la tabla se rellene de números aleatorios
		Random random = new Random();
		// Creamos la tabla de 1000 de tamaño
		int numeros[] = new int[1000];
		// Creamos una variable para cuando el usuario tenga que introducir el número
		// que se le pide
		int numeroSolicitado = 0;
		// Creamos un variable que sirva como contador
		int contador = 0;
		// Creamos un for para poder llenar la tabla de números aleatorios
		for (int i = 0; i < numeros.length; i++) {
			numeros[i] = random.nextInt(100);
			// Creamos un if para que cada vez que salga el número que pide el usuario lleve
			// un recuento de cuantas veces sale
			if (numeroSolicitado == numeros[i]) {
				contador++;
			}
		}
		// Hacemos que salga la tabla en pantalla
		System.out.println(Arrays.toString(numeros));
		// Preguntamos el número que quiere ver el usuario
		System.out.println("Introduce el número que quieras buscar de la tabla: ");
		numeroSolicitado = teclado.nextInt();
		// Hacemos que salga cuantas veces ha salido
		System.out.println("Este número aparece " + contador + " veces");

	}

}
