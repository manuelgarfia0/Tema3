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
		// Mientras que la lista no introduzca 10
		while (numeros.size() < 10) {
			numero = random.nextInt(1, 11);
			numeros.add(numero);
		}
		System.out.println(numeros);
		List<Integer> desordena = new ArrayList<Integer>(numeros);
		Collections.shuffle(desordena);
		System.out.println(desordena);
	}

}
