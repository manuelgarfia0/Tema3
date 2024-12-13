package stringParte1;

import java.util.Scanner;

public class Ejercicio3 {

	static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		// Declaramos una cadena para que la frase que va a introducir el usuario
		String fraseUsuario;
		// Le pedimos al usuario que introduzca una frase
		System.out.println("Introduce una frase: ");
		fraseUsuario = scanner.nextLine();
		// Llamamos a la función con la frase que introduce el usuario
		// Imprimimos el contador
		System.out.println(espaciosBlancos(fraseUsuario));
	}

	static int espaciosBlancos(String frase) {
		// Inicializamos un contador a 0
		int contador = 0;
		// Con un for hago que recorra la frase caracter por caracter
		for (int i = 0; i < frase.length(); i++) {
			// Si detecta un espacio en blanco suma uno al contador
			if (frase.charAt(i) == ' ') {
				contador++;
			}
		}
		// Devolvemos el resultado
		return contador;
	}

}
