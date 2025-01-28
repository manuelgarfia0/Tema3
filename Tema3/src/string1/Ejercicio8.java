package string1;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio8 {

	public static void main(String[] args) {
		// Crear un objeto Scanner para leer la entrada del usuario
		Scanner scanner = new Scanner(System.in);

		String frase;
		String[] palabras;

		// Pedir al usuario que introduzca una frase
		System.out.println("Introduce una frase:");
		frase = scanner.nextLine();

		// Dividir la frase en palabras utilizando el espacio como delimitador
		palabras = frase.split(" ");

		// Ordenar las palabras alfabéticamente
		Arrays.sort(palabras);

		// Mostrar las palabras ordenadas
		System.out.println("Palabras ordenadas alfabéticamente:");
		for (String palabra : palabras) {
			System.out.println(palabra);
		}
	}
}
