package collections;

import java.util.Scanner;
import java.util.TreeMap;

public class Ejercicio7 {

	public static void main(String[] args) {
        // Crear un TreeMap para almacenar las palabras
        TreeMap<String, String> diccionario = new TreeMap<>();

        // Insertar 20 palabras iniciales en el diccionario
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

        do {
            // Mostrar el menú
            System.out.println("1. Inserta palabra");
            System.out.println("2. Busca palabra");
            System.out.println("0. Salir");
            System.out.print("Elige una opción: ");

            // Leer la opción del usuario
            opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {
                case 1:
                    System.out.print("Introduce la palabra en español: ");
                    String palabraEsp = scanner.nextLine().toLowerCase();
                    System.out.print("Introduce la traducción al inglés: ");
                    String palabraIng = scanner.nextLine().toLowerCase();
                    diccionario.put(palabraEsp, palabraIng);
                    System.out.println("Palabra añadida con éxito.");
                    break;

                case 2:
                    System.out.print("Introduce la palabra en español a buscar: ");
                    String buscarPalabra = scanner.nextLine().toLowerCase();
                    if (diccionario.containsKey(buscarPalabra)) {
                        System.out.println("La traducción al inglés es: " + diccionario.get(buscarPalabra));
                    } else {
                        System.out.println("La palabra no está en el diccionario.");
                    }
                    break;
                case 0:
                    System.out.println("¡Adiós!");
                    break;

                default:
                    System.out.println("Opción no válida. Intenta de nuevo.");
                    break;
            }
        } while (opcion != 0);

        scanner.close();
    }
}
