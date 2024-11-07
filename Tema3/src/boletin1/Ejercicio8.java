package boletin1;

import java.util.Random;
import java.util.Scanner;

public class Ejercicio8 {

	public static void main(String[] args) {
		// Creo un escaner y un random para que los números de la tabla sean aleatorios
		// y el usuario después introduzca el número que quiere ver cuantas veces está
		Scanner teclado = new Scanner(System.in);
		Random random = new Random();
		// Creo una tabla para los 100 números
		int numeros[] = new int[100];
		int numPosicion;
		// Creo un contador para saber las veces que se repite el número que me pida el
		// usuario
		int contador = 0;
		// Creo un for para que se introduzcan los 100 números aleatorios
		for (int i = 0; i < numeros.length; i++) {
			numeros[i] = random.nextInt(11);
		}
		// Creo un for-each para imprimir esos 100 números en pantalla
		for (int valor : numeros) {
			System.out.println(valor);
		}
		// Pido al usuario que introduzca un número
		System.out.println("Introduce un número del 1 al 10 para saber en cuantas posiciones del array está: ");
		numPosicion = teclado.nextInt();
		// Uso un for-each para lea los números de la tabla otra vez
		for (int valor : numeros) {
			// Dentro del for-each creo un if para que cada vez que el programa lea el
			// número que ha introducido el usuario sume uno al contador y así saber cuantas
			// veces ha aparecido
			if (valor == numPosicion) {
				contador++;
			}
		}
		System.out.println(numPosicion + " aparece " + contador + " veces");

	}

}