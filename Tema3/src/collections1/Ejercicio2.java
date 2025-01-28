package collections1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Ejercicio2 {

	public static void main(String[] args) {

		Random random = new Random();
		// Lista que almacena números enteros
		ArrayList<Integer> numeros = new ArrayList<>();
		// Declaro una variable para introducir los números
		int numero;
		// Declaro una variable para el tamaño de la lista
		int tamaño;
		int maximo;
		int minimo;
		int suma = 0;
		double media = 0;
		// Hago que el tamaño de la lista sea aleatorio entre 5 y 10
		tamaño = random.nextInt(5, 11);
		// Hasta que no se introduzcan tantos números como el tamaño de la lista no
		// parará de pedir números
		while (numeros.size() < tamaño) {
			// Se introduciran en la lista números aleatorios entre 1 y 100
			numero = random.nextInt(1, 101);
			numeros.add(numero);
		}
		// Se almacenará en la variable el número con mayor valor de la lista
		maximo = Collections.max(numeros);
		// Se almacenará en la variable el número con menor valor de la lista
		minimo = Collections.min(numeros);
		// Suma
		for (int i = 0; i < numeros.size(); i++) {
			numeros.get(i);

		}
		// Imprimimos la lista y los valores que se piden
		System.out.println(numeros);
		System.out.println(maximo);
		System.out.println(minimo);
		System.out.println(suma);
		System.out.println(media);
	}

}
