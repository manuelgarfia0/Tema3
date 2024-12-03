package ejerciciosexamen;

import java.util.Random;
import java.util.Scanner;

public class BuscaElTesoro {

	static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		// Inicializar el tablero
		char[][] tablero = new char[5][5]; // Tablero de 5x5
		inicializarTablero(tablero);

		// Colocar el tesoro en una posición aleatoria
		int filaTesoro = generarPosicionAleatoria();
		int columnaTesoro = generarPosicionAleatoria();

		// Jugar
		int intentos = 0;
		boolean tesoroEncontrado = false;

		while (!tesoroEncontrado) {
			mostrarTablero(tablero);
			System.out.println("Intento " + (intentos + 1));
			System.out.print("Indica la fila (A-E): ");
			String filaInput = scanner.nextLine().toUpperCase();
			System.out.print("Indica la columna (0-4): ");
			int columna = scanner.nextInt();
			scanner.nextLine(); // Limpiar el buffer

			// Convertir la letra de fila a índice
			int fila = filaInput.charAt(0) - 'A'; // Convertir la letra a índice (A -> 0, B -> 1, etc.)

			// Verificar si el jugador ha encontrado el tesoro
			tesoroEncontrado = manejarAtaque(fila, columna, filaTesoro, columnaTesoro, tablero);

			intentos++;
		}

		System.out.println("¡Felicidades! Has encontrado el tesoro en " + intentos + " intentos.");
		scanner.close();
	}

	// Método para inicializar el tablero con agua '-'
	public static void inicializarTablero(char[][] tablero) {
		for (int i = 0; i < tablero.length; i++) {
			for (int j = 0; j < tablero[i].length; j++) {
				tablero[i][j] = '-'; // Casillas vacías
			}
		}
	}

	// Método para generar una posición aleatoria (entre 0 y 4)
	public static int generarPosicionAleatoria() {
		Random random = new Random();
		return random.nextInt(5); // Genera un número aleatorio entre 0 y 4
	}

	// Método para mostrar el tablero con letras en las filas y números en las
	// columnas
	public static void mostrarTablero(char[][] tablero) {
		// Imprimir los números de las columnas (0-4)
		System.out.print("   "); // Espacio para la fila de letras
		for (int i = 0; i < tablero[0].length; i++) {
			System.out.print(i + " ");
		}
		System.out.println(); // Salto de línea

		// Imprimir el tablero con las letras de las filas (A-E)
		for (int i = 0; i < tablero.length; i++) {
			System.out.print((char) ('A' + i) + "  "); // Imprimir la letra de la fila (A, B, C, D, E)
			for (char col : tablero[i]) {
				System.out.print(col + " ");
			}
			System.out.println(); // Salto de línea
		}
	}

	// Método para manejar el ataque del jugador (comprobar si encontró el tesoro)
	public static boolean manejarAtaque(int fila, int columna, int filaTesoro, int columnaTesoro, char[][] tablero) {
		boolean tesoroEncontrado = false;

		// Verificar si la casilla ya ha sido atacada
		if (tablero[fila][columna] == 'O' || tablero[fila][columna] == 'T') {
			System.out.println("Ya has atacado esa casilla.");
		} else {
			// Si la casilla es el tesoro ('T'), marcarla como encontrada
			if (fila == filaTesoro && columna == columnaTesoro) {
				System.out.println("¡Felicidades! Has encontrado el tesoro.");
				tablero[fila][columna] = 'T'; // Marcamos el tesoro como encontrado
				tesoroEncontrado = true; // Termina el juego
			}
			// Si la casilla es agua ('-'), marcarla como fallida
			else {
				System.out.println("¡Agua! No has encontrado el tesoro.");
				tablero[fila][columna] = 'O'; // Marcamos como fallido
			}
		}

		return tesoroEncontrado;
	}
}