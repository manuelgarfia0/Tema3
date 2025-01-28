package string1;

import java.util.Scanner;

public class Ejercicio4 {

	static Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) {
		// Declaramos una cadena frase
		String frase;
		// Pedimos al usuario que introduzca una frase
		System.out.println("Introduce una frase: ");
		frase = scanner.nextLine();
		// Llamamos a la función
		reversa (frase);
	}
	
	static String reversa(String fraseUsuario) {
		// Declaro una cadena dnd se almacenara la frase invertida
		String fraseInvertida = "";
		// Hacemos un bucle para leer la frase del reves
		for(int i = fraseUsuario.length() - 1; i>=0; i--) {
			fraseInvertida = fraseInvertida + fraseUsuario.charAt(i);
		}
		// Imprimimos la frase invertida
		System.out.println(fraseInvertida);
		// Devolvemos la frase
		return fraseInvertida;
	}

}
