package collections;

import java.util.Random;
import java.util.TreeSet;

public class Ejercicio4 {

	public static void main(String[] args) {
		Random random = new Random();
		// Creamos una lista de números enteros que ordena por valor, es decir de menor
		// a mayor
		TreeSet<Integer> conjuntoNumeros = new TreeSet<>();
		// Declaramos una variable para los números
		int numero;
		// Mientras que no haya 20 números es decir el tamaño de la lista se seguiran
		// añadiendo
		while (conjuntoNumeros.size() < 20) {
			numero = random.nextInt(1, 101);
			conjuntoNumeros.add(numero);
		}
		// Mostramos la lista
		System.out.println(conjuntoNumeros);

	}

}
