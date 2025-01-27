package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Ejercicio3 {

	public static void main(String[] args) {

		Random random = new Random();
		// Lista que almacena números enteros
		ArrayList<Integer> numeros = new ArrayList<>();
		// Creamos una variable para los números
		int numero;
		// Hasta que no se añadan 30 números es decir el tamaño de la lista no dejará de
		// añadir números
		while (numeros.size() < 30) {
			numero = random.nextInt(1, 11);
			numeros.add(numero);
		}

		// Ordenamos la lista
		Collections.sort(numeros);
		// Mostramos la lista
		System.out.println(numeros);

	}

}