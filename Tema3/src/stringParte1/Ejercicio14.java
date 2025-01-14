package stringParte1;

import java.util.Scanner;

public class Ejercicio14 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		String frase;
		// Array para contar las apariciones de cada letra (26 letras del alfabeto)
		int[] contarLetras = new int[26];
		char letra;

		// Leer la frase del teclado
		System.out.println("Ingrese una frase:");
		frase = scanner.nextLine();

		// Convertir la frase a minúsculas y eliminar espacios
		frase = frase.toLowerCase().replaceAll("[^a-z]", "");

		// Contar las letras
		for (int i = 0; i < frase.length(); i++) {
			letra = frase.charAt(i);
			if (letra >= 'a' && letra <= 'z') {
				contarLetras[letra - 'a']++; // Incrementar el contador
			}
		}

		// Imprimir las veces que sale cada letra
		for (int i = 0; i < contarLetras.length; i++) {
			if (contarLetras[i] > 0) {
				System.out.println((char) (i + 'a') + ": " + contarLetras[i] + " veces");
			}
		}
	}
}