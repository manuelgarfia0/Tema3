package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Ejercicio3 {

	public static void main(String[] args) {

		Random random = new Random();

		ArrayList<Integer> numeros = new ArrayList<>();

		int numero;

		while (numeros.size() < 30) {
			numero = random.nextInt(1, 11);
			numeros.add(numero);
		}

		Collections.sort(numeros);
		
		System.out.println(numeros);

	}

}