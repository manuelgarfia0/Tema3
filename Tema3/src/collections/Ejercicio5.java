package collections;

import java.util.LinkedHashSet;
import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		// Creao una lista de cadenas que ordena por insercción
		LinkedHashSet<String> nombres = new LinkedHashSet<>();
		// Declaro una cadena y la inicializo a cadena abierta
		String nombre = "";
		// Mientras que la cadena no contenga fin no dejara de pedir nombres
		while (!nombres.contains("fin")) {
			System.out.println("Introduce un nombre: ");
			nombre = scanner.nextLine();
			nombres.add(nombre);
		}
		// Mostramos la lista
		System.out.println(nombres);

	}

}
