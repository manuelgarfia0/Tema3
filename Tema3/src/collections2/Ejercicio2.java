package collections2;

import java.util.LinkedHashSet;
import java.util.Random;

public class Ejercicio2 {

	public static void main(String[] args) {

		Random random = new Random();
		// Lista de números enteros que ordena por insercción
		LinkedHashSet<Integer> numeros = new LinkedHashSet<Integer>();
		// Variable para insertar los números en la lista
		int numero;
		// Introducimos 10 números aleatorios entre 1 y 20
		while (numeros.size() < 10) {
			numero = random.nextInt(1, 21);
			numeros.add(numero);
		}
		// Muestro la lista
		System.out.println(numeros);
	}

}
