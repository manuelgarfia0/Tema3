package collections;

import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

public class Ejercicio4 {

	public static void main(String[] args) {

		Set<Integer> conjuntoNumeros = new TreeSet<>();

		Random random = new Random();

		int numero;

		while (conjuntoNumeros.size() < 20) {
			numero = random.nextInt(1, 101);
			conjuntoNumeros.add(numero);
		}

		System.out.println(conjuntoNumeros);

	}

}
