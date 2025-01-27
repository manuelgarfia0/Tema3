package collections;

import java.util.Scanner;
import java.util.TreeSet;

public class Ejercicio6 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		// Creamos una lista de cadenas que ordena por valor, es decir de menor a mayor
		TreeSet<String> nombres = new TreeSet<>();
		// Declaro una cadena y la inicializo a cadena abierta
		String nombre = "";
		// Mientras que la cadena no contenga fin no dejara de pedir nombres
		while (!nombres.contains("fin")) {
			System.out.println("Introduce un nombre: ");
			nombre = scanner.nextLine();
			nombres.add(nombre);
		}
		// Hacemos que la lista se ordene por orden alfabético
		
		// Mostramos la lista
		System.out.println(nombres);

	}

}
