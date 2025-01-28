package collections1;

import java.util.Scanner;
import java.util.TreeMap;

public class Ejercicio7 {

	public static void main(String[] args) {
		// Creamos una lista de cadenas que ordena por insercción
		TreeMap<String, String> diccionario = new TreeMap<>();

		// Introducimos 20 palabras al mini-diccionario
		diccionario.put("hola", "hello");
		diccionario.put("adios", "goodbye");
		diccionario.put("por favor", "please");
		diccionario.put("gracias", "thank you");
		diccionario.put("perro", "dog");
		diccionario.put("gato", "cat");
		diccionario.put("casa", "house");
		diccionario.put("libro", "book");
		diccionario.put("escuela", "school");
		diccionario.put("mesa", "table");
		diccionario.put("silla", "chair");
		diccionario.put("agua", "water");
		diccionario.put("comida", "food");
		diccionario.put("familia", "family");
		diccionario.put("amigo", "friend");
		diccionario.put("hermano", "brother");
		diccionario.put("hermana", "sister");
		diccionario.put("ciudad", "city");
		diccionario.put("coche", "car");
		diccionario.put("juego", "game");

		Scanner scanner = new Scanner(System.in);
		int opcion;
		String buscarPalabra;

		do {
			// Mostramos el menu
			System.out.println("1. Inserta palabra");
			System.out.println("2. Busca palabra");
			System.out.println("0. Salir");
			System.out.print("Elige una opción: ");

			opcion = scanner.nextInt();
			scanner.nextLine();
			// Uso un switch para que al introducir una de las opciones haga lo que debe de
			// hacer
			switch (opcion) {
			// En el caso 1 deber de introducir una palabra en español y la traducción para
			// añadirla al diccionario
			case 1:
				System.out.print("Introduce la palabra en español: ");
				String palabraEsp = scanner.nextLine().toLowerCase();
				System.out.print("Introduce la traducción al inglés: ");
				String palabraIng = scanner.nextLine().toLowerCase();
				diccionario.put(palabraEsp, palabraIng);
				System.out.println("Palabra añadida con éxito.");
				break;
			// En el segundo caso introducira una palabra de la lista en español para que el
			// código devuelva la traducción
			case 2:
				buscarPalabra = scanner.nextLine().toLowerCase();
				if (diccionario.containsKey(buscarPalabra)) {
					System.out.println("La traducción al inglés es: " + diccionario.get(buscarPalabra));
				} else {
					System.out.println("La palabra no está en el diccionario.");
				}
				break;
			// En el último caso sera para cerrar el diccionario
			case 0:
				System.out.println("¡Adiós!");
				break;
			// Uso un default para que en caso de no introducir ninguna de las opciones
			// anteriores te diga que no es una opción
			default:
				System.out.println("Opción no válida. Intenta de nuevo.");
				break;
			}
			// Mientras que no se elija la opción 0 el código seguira accediendo al menú, en
			// el momento que elijas la opción 0 saldrá del bucle
		} while (opcion != 0);

		scanner.close();
	}
}
