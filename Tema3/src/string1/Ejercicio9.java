package string1;

import java.util.Scanner;

public class Ejercicio9 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		String frase;
		String mensajeTraducido;

		System.out.println("Introduce una frase en el idioma de Javalandia:");
		frase = scanner.nextLine();

		mensajeTraducido = traducirFrase(frase);

		if (!mensajeTraducido.isEmpty()) {
			System.out.println("Mensaje traducido: " + mensajeTraducido);
		} else {
			System.out.println("La frase no está en el idioma de Javalandia.");
		}
	}

	public static String traducirFrase(String frase) {
		String resultado = "";

		// Eliminar espacios en blanco al inicio y al final
		frase = frase.trim();

		// Verificar si cumple con el primer dialecto (comienza con "Javalín, javalón")
		if (frase.startsWith("Javalín, javalón")) {
			// Eliminar la muletilla inicial y espacios/tabulaciones
			resultado = frase.substring("Javalín, javalón".length()).trim();
		} else if (frase.endsWith("javalén, len, len")) {
			// Verificar si cumple con el segundo dialecto (termina con "javalén, len, len")
			// Eliminar la muletilla final y espacios/tabulaciones
			resultado = frase.substring(0, frase.length() - "javalén, len, len".length()).trim();
		}

		return resultado;
	}
}