package string1;

import java.util.Scanner;

public class Ejercicio11 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		// Declaro los conjuntos de letras en arrays
		char[] conj2 = { 'e', 'i', 'k', 'm', 'p', 'q', 'r', 's', 't', 'u', 'v' };
		char[] conj1 = { 'p', 'v', 'i', 'u', 'm', 't', 'e', 'r', 'k', 'q', 's' };
		// Declaro dos cadenas abiertas
		String frase = "";

		String fraseDescodificada = "";

		System.out.println("Introduce una frase para descodificarla: ");
		frase = scanner.nextLine();

		for (int i = 0; i < frase.length(); i++) {
			fraseDescodificada += descodifica(conj1, conj2, frase.charAt(i));
		}

		System.out.println(fraseDescodificada);

	}

	static char descodifica(char conjunto1[], char conjunto2[], char c) {
		// Inicializo el carácter codificado a c
		char charCoded = Character.toLowerCase(c);
		// Paso los char a String
		String conj1Cad = String.valueOf(conjunto1);
		String conj2Cad = String.valueOf(conjunto2);
		// Busco las posición del caracter en el conjunto 1
		int pos = conj1Cad.indexOf(c);

		if (pos >= 0) {
			// Si está en el conjubnto 1 me quedo con las misma posición del conjunto 2
			charCoded = conj2Cad.charAt(pos);
		}
		// Devuelvo la función
		return charCoded;
	}

}