package collections2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Ejercicio1 {

	public static void main(String[] args) {

		Random random = new Random();
		// Declaro una lista de números enteros que ordena lo insertado por valor
		ArrayList<Integer> numeros = new ArrayList<Integer>();
		// Declaro una variable para los números que tengo que introducir
		int numero;
		// Introducimos números entre el 1 y el 10 en la lista
		while (numeros.size() < 10) {
			numero = random.nextInt(1, 11);
			numeros.add(numero);
		}
		// Mostramos la lista
		System.out.println("Lista: " + numeros);
		// Mezclamos la lista
		Collections.shuffle(numeros);
		// Mostramos la lista otra vez cambiada de orden
		System.out.println("Lista desordenada: " + numeros);
	}

}
