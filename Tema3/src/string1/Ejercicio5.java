package string1;

import java.util.Scanner;

public class Ejercicio5 {

	static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		// Declaramos una cadena para la frase que se va a formar y otra para las
		// palabras individualmente
		String palabra = "";
		String frase = "";
		// Pedimos al usuario que introduzca la primera palabra
		System.out.println("Dime una frase palabra por palabra");
		palabra = scanner.nextLine();
		// Hacemos un while para que mientras que el usuario no introduzca la palabra
		// "fin" seguirá preguntandole palabras
		while (!palabra.equalsIgnoreCase("fin")) {
			frase += palabra + " ";
			palabra = "";
			System.out.println("Introduce una palabra: ");
			palabra = scanner.nextLine();
		}
		// Mostramos la frase en consola
		System.out.println(frase);

	}

}
