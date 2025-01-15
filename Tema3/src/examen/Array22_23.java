package examen;

import java.util.Random;
import java.util.Scanner;

public class Array22_23 {

	static final int tamaño = 3;
	static final char vacio = '-';
	static final char usuario = 'X';
	static final char programa = 'O';
	static char[][] tablero = new char[tamaño][tamaño];

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		boolean jugarOtraVez;
		int turno;
		boolean hayGanador;

		do {
			limpiarTablero();
			System.out.println("¡Bienvenido al Tres en Raya!");

			turno = jugadorInicial();
			System.out.println("Comienza " + (turno == 1 ? "el usuario." : "el programa."));

			hayGanador = false;
			while (!hayGanador && !tableroLleno()) {
				imprimeTablero();
				if (turno == 1) {
					boolean movimientoValido;
					do {
						int fila;
						int columna;
						System.out.println("Tu turno. Introduce fila y columna (0-2):");
						fila = scanner.nextInt();
						columna = scanner.nextInt();
						movimientoValido = usuarioMueveFicha(fila, columna);
						if (!movimientoValido) {
							System.out.println("Movimiento no válido. Inténtalo de nuevo.");
						}
					} while (!movimientoValido);
				} else {
					mueveFichaAleatoria();
					System.out.println("El programa ha realizado su movimiento.");
				}

				hayGanador = esGanador(turno == 1 ? usuario : programa);
				turno = 1 - turno; // Cambia de turno
			}

			imprimeTablero();

			if (hayGanador) {
				System.out.println("¡" + (turno == 0 ? "Usuario" : "Programa") + " ha ganado!");
			} else {
				System.out.println("Empate. El tablero está lleno.");
			}

			System.out.println("¿Quieres jugar otra vez? (s/n):");
			jugarOtraVez = scanner.next().equalsIgnoreCase("s");

		} while (jugarOtraVez);

		System.out.println("¡ADIÓS!");
	}

	static void imprimeTablero() {
		for (int i = 0; i < tamaño; i++) {
			for (int j = 0; j < tamaño; j++) {
				System.out.print(tablero[i][j] + " \t");
			}
			System.out.println();
		}
	}

	static int jugadorInicial() {
		Random random = new Random();
		return random.nextInt(2);
	}

	static void mueveFichaAleatoria() {
		Random random = new Random();
		int fila = random.nextInt(tamaño);
		int columna = random.nextInt(tamaño);
		while (tablero[fila][columna] != vacio) {
			fila = random.nextInt(tamaño);
			columna = random.nextInt(tamaño);
		}
		tablero[fila][columna] = programa;
	}

	static boolean usuarioMueveFicha(int fila, int columna) {
		boolean resultado = false;
		if (fila >= 0 && fila < tamaño && columna >= 0 && columna < tamaño) {
			if (tablero[fila][columna] == vacio) {
				tablero[fila][columna] = usuario;
				resultado = true;
			}
		}
		return resultado;
	}

	static void limpiarTablero() {
		for (int i = 0; i < tamaño; i++) {
			for (int j = 0; j < tamaño; j++) {
				tablero[i][j] = vacio;
			}
		}
	}

	static boolean esGanador(char ficha) {
		boolean ganador = false;
		for (int i = 0; i < tamaño; i++) {
			if (tablero[i][0] == ficha && tablero[i][1] == ficha && tablero[i][2] == ficha) {
				ganador = true;
			}
			if (tablero[0][i] == ficha && tablero[1][i] == ficha && tablero[2][i] == ficha) {
				ganador = true;
			}
		}
		if (tablero[0][0] == ficha && tablero[1][1] == ficha && tablero[2][2] == ficha) {
			ganador = true;
		}
		if (tablero[0][2] == ficha && tablero[1][1] == ficha && tablero[2][0] == ficha) {
			ganador = true;
		}
		return ganador;
	}

	static boolean tableroLleno() {
		boolean lleno = true;
		for (int i = 0; i < tamaño; i++) {
			for (int j = 0; j < tamaño; j++) {
				if (tablero[i][j] == vacio) {
					lleno = false;
				}
			}
		}
		return lleno;
	}
}