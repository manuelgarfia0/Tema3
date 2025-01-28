package collections1;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Ejercicio9 {

	public static void main(String[] args) {

		Scanner reader = new Scanner(System.in);

		// Declaro la variable que se va a corresponder con la clave a almacenar
		int numero;

		// Declaro la variable donde se va a almacenar el valor del mapa
		Integer valor;

		// Declaro la variable para almacenar la respuesta del usuario sobre si quiere
		// volver a introducir números
		String repetir;

		// Creamos una lista de cadenas que ordena por insercción
		TreeMap<Integer, Integer> numeros = new TreeMap<>();

		// Creamos una lista de cadenas que ordena por insercción
		TreeMap<Integer, Integer> estrellas = new TreeMap<>();

		do {
			// Pedimos 5 números
			System.out.println("Introduzca 5 números:");
			for (int i = 1; i <= 5; i++) {
				numero = reader.nextInt();
				addNumber(numero, numeros);
			}

			// Pedimos 2 estrellas
			System.out.println("Introduzca 2 estrellas:");
			for (int i = 1; i <= 2; i++) {
				numero = reader.nextInt();
				addNumber(numero, estrellas);
			}

			System.out.println("Conteo actual: ");
			System.out.println(numeros);
			System.out.println(estrellas);

			System.out.println("¿Quiere introducir otra apuesta?");
			repetir = reader.next();
			// Mientras que el usuario responda si el bucle continuará
		} while (repetir.equals("si"));

		reader.close();
	}

	static void addNumber(int number, Map<Integer, Integer> mapa) {
		// Comprobamos si la estrella ya está
		Integer valor = mapa.get(number);
		if (valor == null) {
			// Si la estrella no está almacenada se añade con valor=1
			mapa.put(number, 1);
		} else {
			// Incrementamos el valor
			valor++;
			// Se actualiza el valor de la estrella
			mapa.put(number, valor);
		}
	}
}