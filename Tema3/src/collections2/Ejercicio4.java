package collections2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		// Declaración de variables
		ArrayList<String> nombres = new ArrayList<>();
		Scanner scanner = new Scanner(System.in);
		int opcion;
		String nombre, eliminar, buscar;

		do {
			// Menú de opciones
			System.out.println("\nMenú:");
			System.out.println("1. Añadir nuevo nombre");
			System.out.println("2. Eliminar un nombre");
			System.out.println("3. Ordenar la lista");
			System.out.println("4. Buscar un nombre");
			System.out.println("5. Salir");
			System.out.print("Seleccione una opción: ");
			opcion = scanner.nextInt();
			scanner.nextLine();

			switch (opcion) {
			case 1:
				// Añadir un nuevo nombre a la lista
				System.out.print("Ingrese el nombre: ");
				nombre = scanner.nextLine();
				nombres.add(nombre);
				break;
			case 2:
				// Eliminar un nombre de la lista
				System.out.print("Ingrese el nombre a eliminar: ");
				eliminar = scanner.nextLine();
				nombres.remove(eliminar);
				break;
			case 3:
				// Ordenar la lista alfabéticamente
				Collections.sort(nombres);
				System.out.println("Lista ordenada: " + nombres);
				break;
			case 4:
				// Buscar un nombre en la lista
				System.out.print("Ingrese el nombre a buscar: ");
				buscar = scanner.nextLine();
				if (nombres.contains(buscar)) {
					System.out.println("El nombre está en la lista.");
				} else {
					System.out.println("El nombre no se encuentra en la lista.");
				}
				break;
			case 5:
				// Salir del programa
				System.out.println("Saliendo del programa...");
				break;
			default:
				System.out.println("Opción no válida. Intente de nuevo.");
			}
		} while (opcion != 5);

		scanner.close();
	}
}