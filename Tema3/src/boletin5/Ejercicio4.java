package boletin5;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio4 {

	static Scanner teclado = new Scanner(System.in);
	
	public static void main(String[] args) {

		char tablero[][] = new char[8][8];
		int posFila;
		int posColumna;
		char pieza;

		for (int i = 0; i < tablero.length; i++) {
			Arrays.fill(tablero[i], '-');
		}
		
		System.out.println("¿En que fila quieres posicionarte? ");
		posFila = teclado.nextInt();
		System.out.println("¿En qué columna quieres posicionarte? ");
		posColumna = teclado.nextInt();
		System.out.println("¿Qué pieza quieres poner? ");
		pieza = teclado.next().charAt(0);
		
		
	}

	static void torre(char[][] tablero, int posFila, int posColumna, char T) {
		
		tablero[posFila][posColumna] = 'T';
		
		for(int i = 0; i<tablero.length; i++) {
			if (i != posFila) {
				
			}
		}
		
	}

	static void dama(int posFila, int posColumna, char D) {

		
		
	}

	static void alfil(int posFila, int posColumna, char A) {

		
		
	}

	static void caballo(int posFila, int posColumna, char C) {

		
		
	}
}
