package collections;

import java.util.Scanner;
import java.util.TreeMap;

public class Ejercicio7 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		TreeMap<String, String> diccionario = new TreeMap<>();

		int menu = 0;
		String español;
		String traduccion;

		switch (menu) {
		case 1:
			System.out.println("Inserta palabra: ");
			español = scanner.nextLine();
			traduccion = scanner.nextLine();
		case 2:
			System.out.println("Busca palabra: ");
		case 0:
			System.out.println("Salir: ");
		}

	}

}
