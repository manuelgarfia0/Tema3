package collections2;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		// Declaración de variables
		Map<String, Double> series = new HashMap<>();
		Scanner scanner = new Scanner(System.in);
		int opcion;
		String nombre;
		double valoracion;
		boolean continuar = true;

		while (continuar) {
			// Menú de opciones
			System.out.println("\nMenú de Gestión de Series:");
			System.out.println("1. Agregar serie");
			System.out.println("2. Buscar serie");
			System.out.println("3. Eliminar serie");
			System.out.println("4. Salir");
			System.out.print("Seleccione una opción: ");
			opcion = scanner.nextInt();
			scanner.nextLine();

			if (opcion == 1) {
				// Agregar serie
				System.out.print("Ingrese el nombre de la serie: ");
				nombre = scanner.nextLine();
				System.out.print("Ingrese la valoración de la serie (0-10): ");
				valoracion = scanner.nextDouble();
				scanner.nextLine();
				series.put(nombre, valoracion);
				System.out.println("Serie agregada correctamente.");
			} else if (opcion == 2) {
				// Buscar serie
				System.out.print("Ingrese el nombre de la serie a buscar: ");
				nombre = scanner.nextLine();
				if (series.containsKey(nombre)) {
					System.out.println("Valoración de " + nombre + ": " + series.get(nombre));
				} else {
					System.out.println("La serie no se encuentra en el sistema.");
				}
			} else if (opcion == 3) {
				// Eliminar serie
				System.out.print("Ingrese el nombre de la serie a eliminar: ");
				nombre = scanner.nextLine();
				if (series.remove(nombre) != null) {
					System.out.println("Serie eliminada correctamente.");
				} else {
					System.out.println("La serie no se encuentra en el sistema.");
				}
			} else if (opcion == 4) {
				// Salir del programa
				System.out.println("Saliendo del programa...");
				continuar = false;
			} else {
				System.out.println("Opción no válida. Intente de nuevo.");
			}
		}

		scanner.close();
	}
}