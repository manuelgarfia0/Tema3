package collections;

import java.util.Scanner;
import java.util.TreeSet;

public class Ejercicio6 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		TreeSet<String> nombres = new TreeSet<>();

		String nombre = "";

		while (!nombres.contains("fin")) {
			System.out.println("Introduce un nombre: ");
			nombre = scanner.nextLine();
			nombres.add(nombre);
		}
		
		System.out.println(nombres);

	}

}
