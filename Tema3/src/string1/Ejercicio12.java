package string1;

import java.util.Scanner;

public class Ejercicio12 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		String frase;
		String[] palabras;
		String palabraLarga;

		// Leer una frase del usuario
		System.out.println("Ingrese una frase:");
		frase = scanner.nextLine();

		// Dividir la frase en palabras
		palabras = frase.split(" ");

		// Inicializar variables para la palabra más larga
		palabraLarga = "";
		int numLetras = 0;

		// Buscar la palabra más larga
		for (String palabra : palabras) {
			if (palabra.length() > numLetras) {
				palabraLarga = palabra;
				numLetras = palabra.length();
			}
		}

		// Imprimir el resultado
		System.out.println("La palabra más larga es: " + palabraLarga);
		System.out.println("Número de caracteres: " + numLetras);

	}
}
