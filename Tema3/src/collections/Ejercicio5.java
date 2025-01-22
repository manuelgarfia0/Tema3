package collections;

import java.util.LinkedHashSet;
import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		LinkedHashSet<String> nombres = new LinkedHashSet<>();

		String nombre = "";

		while (!nombres.contains("fin")) {
			System.out.println("Introduce un nombre: ");
			nombre = scanner.nextLine();
			nombres.add(nombre);
		}

		System.out.println(nombres);

	}

}
