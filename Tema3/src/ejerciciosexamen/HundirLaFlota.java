package ejerciciosexamen;

import java.util.Scanner;

public class HundirLaFlota {

	static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		// Inicializar el tablero
		char[][] tablero = new char[5][5]; // Tablero de 5x5
		inicializarTablero(tablero);

		// Colocar los barcos
		colocarBarcos(tablero);

		// Jugar
		int intentos = 0;
		boolean juegoTerminado = false;

		while (!juegoTerminado) {
			mostrarTablero(tablero);
			System.out.println("Intento " + (intentos + 1));
			System.out.print("Indica la fila para atacar (A-E): ");
			String filaInput = scanner.nextLine().toUpperCase(); // Capturamos la fila como letra
			System.out.print("Indica la columna para atacar (0-4): ");
			int columna = scanner.nextInt();
			scanner.nextLine(); // Limpiar el buffer de entrada

			// Convertir la letra de fila a índice
			int fila = filaInput.charAt(0) - 'A'; // Convertir la letra a índice (A -> 0, B -> 1, etc.)

			// Verificar si el ataque fue exitoso o fallido
			juegoTerminado = manejarAtaque(fila, columna, tablero);

			intentos++;
		}

		System.out.println("¡Juego terminado!");
		scanner.close();
	}

	// Método para manejar el ataque (con solo un return)
	static boolean manejarAtaque(int fila, int columna, char[][] tablero) {
		boolean juegoTerminado = false;

		// Verificar si la casilla ya ha sido atacada
		if (tablero[fila][columna] == 'X' || tablero[fila][columna] == 'O') {
			System.out.println("Ya has atacado esa casilla.");
		} else {
			// Si la casilla es un barco ('B'), marcarla como tocada
			if (tablero[fila][columna] == 'B') {
				System.out.println("¡Tocado!");
				tablero[fila][columna] = 'X'; // Marcamos como tocado
			}
			// Si la casilla es agua ('-'), marcarla como fallida
			else if (tablero[fila][columna] == '-') {
				System.out.println("¡Agua! No has tocado ningún barco.");
				tablero[fila][columna] = 'O'; // Marcamos como fallido
			}
		}

		// Verificar si todos los barcos han sido hundidos
		if (todosLosBarcosHundidos(tablero)) {
			System.out.println("¡Has hundido todos los barcos!");
			juegoTerminado = true;
		}

		return juegoTerminado; // Solo un return aquí
	}

	// Método para inicializar el tablero con agua '-'
	static void inicializarTablero(char[][] tablero) {
		for (int i = 0; i < tablero.length; i++) {
			for (int j = 0; j < tablero[i].length; j++) {
				tablero[i][j] = '-'; // Marcar casillas de agua
			}
		}
	}

	// Método para colocar barcos en el tablero
	static void colocarBarcos(char[][] tablero) {
		// Colocamos algunos barcos manualmente
		// 'B' representa un barco
		tablero[1][1] = 'B'; // Barco en (1, 1)
		tablero[2][2] = 'B'; // Barco en (2, 2)
		tablero[3][3] = 'B'; // Barco en (3, 3)
		// Puedes colocar más barcos de forma similar
	}

	// Método para mostrar el tablero con letras en las filas y números en las
	// columnas
	static void mostrarTablero(char[][] tablero) {
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

	// Método para verificar si todos los barcos han sido hundidos
	static boolean todosLosBarcosHundidos(char[][] tablero) {
		boolean todosHundidos = true; // Asumimos que todos los barcos están hundidos

		for (int i = 0; i < tablero.length; i++) {
			for (int j = 0; j < tablero[i].length; j++) {
				if (tablero[i][j] == 'B') {
					todosHundidos = false; // Si encontramos un barco, no todos están hundidos
				}
			}
		}

		return todosHundidos; // Retornamos el resultado final
	}
}