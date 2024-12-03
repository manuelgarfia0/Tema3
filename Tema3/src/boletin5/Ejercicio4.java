package boletin5;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio4 {

	static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		// Variables
		char pieza;
		int posFila;
		int posColumna;
		char tablero[][] = new char[8][8];

		for (int i = 0; i < tablero.length; i++) {
			for (int j = 0; j < tablero[i].length; j++) {
				tablero[i][j] = '-';
			}
		}

		System.out.println("Indique el tipo de pieza: ");
		pieza = scanner.next().charAt(0);

		System.out.println("Indica la columna en la que se encuentra (0-7): ");
		posColumna = scanner.nextInt();

		System.out.println("Indica la fila en la que se encuentra (0-7): ");
		posFila = scanner.nextInt();

		switch (pieza) {
		case 'A' -> {
			tablero = alfil(posFila, posColumna, tablero);
		}
		case 'T' -> {
			tablero = torre(posFila, posColumna, tablero);

		}
		case 'C' -> {
			tablero = caballo(posFila, posColumna, tablero);

		}
		case 'D' -> {
			tablero = dama(posFila, posColumna, tablero);

		}
		}

		for (char fila[] : tablero) {
			for (char col : fila) {
				System.out.print(col + " ");

			}
			System.out.println();
		}
		scanner.close();
	}

	static char[][] torre(int posFila, int posColumna, char tablero[][]) {

		for (int i = 0; i < tablero.length; i++) {
			tablero[posFila][i] = 'X';
			tablero[i][posColumna] = 'X';
		}

		tablero[posFila][posColumna] = 'T';

		return tablero;
	}

	static char[][] dama(int posFila, int posColumna, char tablero[][]) {
		for (int i = 0; i < tablero.length; i++) {
			tablero[posFila][i] = 'X';
			tablero[i][posColumna] = 'X';
		}

		for (int i = 0; i < tablero.length; i++) {
			if (posFila - i >= 0 && posColumna - i >= 0) {
				tablero[posFila - i][posColumna - i] = 'X'; // Diagonal superior izquierda
			}
			if (posFila + i < tablero.length && posColumna - i >= 0) {
				tablero[posFila + i][posColumna - i] = 'X'; // Diagonal inferior izquierda
			}
			if (posFila + i < tablero.length && posColumna + i < tablero[0].length) {
				tablero[posFila + i][posColumna + i] = 'X'; // Diagonal inferior derecha
			}
			if (posFila - i >= 0 && posColumna + i < tablero[0].length) {
				tablero[posFila - i][posColumna + i] = 'X'; // Diagonal superior derecha
			}
		}

		tablero[posFila][posColumna] = 'D';

		return tablero;
	}

	static char[][] alfil(int posFila, int posColumna, char tablero[][]) {

		for (int i = 0; i < tablero.length; i++) {
			if (posFila - i >= 0 && posColumna - i >= 0) {
				tablero[posFila - i][posColumna - i] = 'X'; // Diagonal superior izquierda
			}
			if (posFila + i < tablero.length && posColumna - i >= 0) {
				tablero[posFila + i][posColumna - i] = 'X'; // Diagonal inferior izquierda
			}
			if (posFila + i < tablero.length && posColumna + i < tablero[0].length) {
				tablero[posFila + i][posColumna + i] = 'X'; // Diagonal inferior derecha
			}
			if (posFila - i >= 0 && posColumna + i < tablero[0].length) {
				tablero[posFila - i][posColumna + i] = 'X'; // Diagonal superior derecha
			}
		}

		tablero[posFila][posColumna] = 'A';

		return tablero;
	}

	static char[][] caballo(int posFila, int posColumna, char tablero[][]) {

		if (posFila - 1 >= 0 && posColumna - 2 >= 0) {
			tablero[posFila - 1][posColumna - 2] = 'X';
		}
		if (posFila - 2 >= 0 && posColumna - 1 >= 0) {
			tablero[posFila - 2][posColumna - 1] = 'X';
		}
		if (posFila + 1 < tablero.length && posColumna - 2 >= 0) {
			tablero[posFila + 1][posColumna - 2] = 'X';
		}
		if (posFila + 2 < tablero.length && posColumna - 1 >= 0) {
			tablero[posFila + 2][posColumna - 1] = 'X';
		}
		if (posFila - 2 >= 0 && posColumna + 1 < tablero.length) {
			tablero[posFila - 2][posColumna + 1] = 'X';
		}
		if (posFila - 1 >= 0 && posColumna + 2 < tablero.length) {
			tablero[posFila - 1][posColumna + 2] = 'X';
		}
		if (posFila + 1 < tablero.length && posColumna + 2 < tablero.length) {
			tablero[posFila + 1][posColumna + 2] = 'X';
		}
		if (posFila + 2 < tablero.length && posColumna + 1 < tablero.length) {
			tablero[posFila + 2][posColumna + 1] = 'X';
		}

		tablero[posFila][posColumna] = 'C';

		return tablero;
	}
}