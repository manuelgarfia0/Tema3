package stringParte1;

import java.util.Scanner;

public class Ejercicio6 {

	static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		// Declaramos una cadena para la frase y otra para la frase sin espacios
		String frase;
		String fraseSinEspacio;
		// Pedimos al usuario que introduzca una frase
		System.out.println("Introduce una frase: ");
		frase = scanner.nextLine();
		// Reemplazamos los espacios en blanco de la frase por nada para quitarlos y lo
		// almacenamos en la fraseSinEspacios
		fraseSinEspacio = frase.replace(" ", "");
		// Llamo a la función que invierte la frase para que si es igual a la frase
		// normal, sea palíndroma
		if (palíndroma(fraseSinEspacio).equalsIgnoreCase(fraseSinEspacio)) {
			System.out.println("Es palindrómana");
		} else {
			System.out.println("No es palindrómana");
		}
	}

	static String palíndroma(String fraseUsuario) {
		// Declaro una cadena para la frase invertida y otra para esa misma frase pero
		// sin espacios
		String fraseInvertida = "";
		String fraseSinEspacio;
		// Reemplazamos los espacios en blanco de la frase por nada para quitarlos y lo
		// almacenamos en la fraseSinEspacios
		fraseSinEspacio = fraseInvertida.replace(" ", "");
		// Uso un for para invertir la frase
		for (int i = fraseUsuario.length() - 1; i >= 0; i--) {
			fraseInvertida = fraseInvertida + fraseUsuario.charAt(i);
		}
		// Devuelvo la frase
		return fraseInvertida;
	}

}
