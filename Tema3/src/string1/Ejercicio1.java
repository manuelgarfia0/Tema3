package string1;

import java.util.Scanner;

public class Ejercicio1 {

	static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		// Creamos las dos frases usando Strings
		String frase1;
		String frase2;
		// Pedimos al usuario que introduzca las dos frases
		System.out.println("Introduce la primera frase: ");
		frase1 = scanner.nextLine();
		System.out.println("Introduce la segunda frase: ");
		frase2 = scanner.nextLine();
		// Hacemos que tenga en cuenta los carácteres de cada frase usando .length para
		// saber si la frase es mayor, menor o igual
		if (frase1.length() < frase2.length()) {
			System.out.println("La segunda frase contiene más carácteres que la primera");
		} else if (frase1.length() == frase2.length()) {
			System.out.println("Las dos frases contienen los mismos carácteres");
		} else {
			System.out.println("La primera frase contiene más carácteres que la segunda");
		}

	}

}
