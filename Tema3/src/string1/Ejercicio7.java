package string1;

import java.util.Scanner;

public class Ejercicio7 {

	static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		// Declaramos dos cadenas
		String frase;
		String palabra = "";
		int cantidad;
		// Pedimos al usuario que introduzca una frase
		System.out.println("Introduce una frase: ");
		frase = scanner.nextLine();
		// Pedimos al usuario que nos de la palabra que quiere buscar dentro de la frase
		System.out.println("Dime la palabra ");
		palabra = scanner.nextLine();
		// Llamamos a la función
		cantidad = comprobar(frase, palabra);
		// Mostramos por consola las veces que sale la palabra pedida
		System.out.println("La palabra esta repetida un total de " + cantidad + " veces.");
	}

	static int comprobar(String frase, String palabra) {
		// Declaramos las siguientes variables
		int contador = 0;
		int posicion;
		int posInicio;
		// Sacamos la posicion de la primera iteración
		posicion = frase.indexOf(palabra, 0);
		// Mientras que la palabra aparezca, el código hará lo siguiente
		while (posicion > 0) {
			contador++;
			posInicio = posicion + palabra.length();
			posicion = frase.indexOf(palabra, posInicio);
		}
		return contador;
	}
}
