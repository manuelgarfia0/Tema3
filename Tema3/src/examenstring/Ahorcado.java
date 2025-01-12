package examenstring;

import java.util.Random;
import java.util.Scanner;

public class Ahorcado {

	// Variables globales
	static final String[] palabras = { "humanidad", "persona", "hombre", "mujer", "individuo", "cuerpo", "pierna",
			"cabeza", "brazo", "familia" };
	static final int NUMINTENTOS = 7;
	static String palabraSecreta;
	static String palabraPista;
	static String noAcertadas = "";

	// Función que genera una palabra aleatoria
	static void generaPalabra() {
		Random random = new Random();
		palabraSecreta = palabras[random.nextInt(palabras.length)];
		palabraPista = "_".repeat(palabraSecreta.length());
	}

	// Función para mostrar el menú
	static int menu() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Seleccione una de las siguientes opciones:");
		System.out.println("1. Introducir letra.");
		System.out.println("2. Introducir palabra.");
		int opcion = 0;
		while (opcion != 1 && opcion != 2) {
			try {
				opcion = Integer.parseInt(scanner.nextLine());
				if (opcion != 1 && opcion != 2) {
					System.out.println("Opción inválida. Intente nuevamente.");
				}
			} catch (NumberFormatException e) {
				System.out.println("Opción inválida. Intente nuevamente.");
			}
		}
		return opcion;
	}

	// Función para comprobar una letra
	static void compruebaLetra(char letra) {
		letra = Character.toLowerCase(letra);
		if (palabraSecreta.contains(String.valueOf(letra))) {
			StringBuilder nuevaPista = new StringBuilder(palabraPista);
			for (int i = 0; i < palabraSecreta.length(); i++) {
				if (palabraSecreta.charAt(i) == letra) {
					nuevaPista.setCharAt(i, letra);
				}
			}
			palabraPista = nuevaPista.toString();
		} else if (!noAcertadas.contains(String.valueOf(letra))) {
			noAcertadas += letra + " ";
		}
	}

	// Función para comprobar una palabra
	static boolean compruebaPalabra(String palabra) {
		palabra = palabra.toLowerCase();
		boolean esCorrecta = palabra.equals(palabraSecreta);
		if (esCorrecta) {
			palabraPista = palabraSecreta;
		}
		return esCorrecta;
	}

	// Función para pintar la pista
	static void pintaPista() {
		System.out.println("Letras usadas no acertadas: " + noAcertadas);
		System.out.println("Pista: " + palabraPista);
	}

	// Función principal (main)
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		generaPalabra();
		pintaPista();
		int intentosRestantes = NUMINTENTOS;
		boolean juegoTerminado = false;

		while (!juegoTerminado && intentosRestantes > 0) {
			int opcion = menu();

			if (opcion == 1) { // Introducir letra
				System.out.print("Introduzca una letra: ");
				char letra = scanner.nextLine().charAt(0);
				String pistaAnterior = palabraPista;
				compruebaLetra(letra);
				if (pistaAnterior.equals(palabraPista) && !noAcertadas.contains(String.valueOf(letra))) {
					intentosRestantes--;
				}
			} else if (opcion == 2) { // Introducir palabra
				System.out.print("Introduzca la palabra: ");
				String palabra = scanner.nextLine();
				if (!compruebaPalabra(palabra)) {
					intentosRestantes--;
				}
			}

			pintaPista();
			System.out.println("Intentos restantes: " + intentosRestantes);
			juegoTerminado = palabraPista.equals(palabraSecreta);
		}

		if (palabraPista.equals(palabraSecreta)) {
			System.out.println("¡¡ENHORABUENA!! HAS ACERTADO");
		} else {
			System.out.println("GAME OVER");
			System.out.println("La palabra era: " + palabraSecreta);
		}

		scanner.close();
	}
}