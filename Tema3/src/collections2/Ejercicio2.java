package collections2;

import java.util.LinkedHashSet;
import java.util.Random;

public class Ejercicio2 {

	public static void main(String[] args) {

		Random random = new Random();

		LinkedHashSet<Integer> numeros = new LinkedHashSet<Integer>();
		int numero;

		while (numeros.size() < 10) {
			numero = random.nextInt(1, 21);
			numeros.add(numero);
		}
		System.out.println(numeros);
	}

}
