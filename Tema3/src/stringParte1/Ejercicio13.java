package stringParte1;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio13 {

	static boolean anagramas(String palabra1, String palabra2) {
		// Inicializar una variable para el resultado
		boolean resultado = true;

		// Eliminar espacios y convertir a minúsculas
		palabra1 = palabra1.replaceAll("\\s+", "").toLowerCase();
		palabra2 = palabra2.replaceAll("\\s+", "").toLowerCase();

		// Si las longitudes son diferentes, no son anagramas
		if (palabra1.length() != palabra2.length()) {
			resultado = false;
		} else {
			// Convertir a arrays de caracteres y ordenarlos
			char[] array1 = palabra1.toCharArray();
			char[] array2 = palabra2.toCharArray();
			Arrays.sort(array1);
			Arrays.sort(array2);

			// Comparar los arrays ordenados
			resultado = Arrays.equals(array1, array2);
		}

		return resultado;
	}

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		// Ejemplo de uso
		String palabra1 = "";
		String palabra2 = "";

		System.out.println("Introduce una palabra: ");
		palabra1 = scanner.nextLine();
		System.out.println("Introduce otra palabra para ver si es anagrama de la anterior: ");
		palabra2 = scanner.nextLine();

		if (anagramas(palabra1, palabra2)) {
			System.out.println(palabra1 + " y " + palabra2 + " son anagramas.");
		} else {
			System.out.println(palabra1 + " y " + palabra2 + " no son anagramas.");
		}
	}
}