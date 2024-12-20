package boletin3;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		// Creo un escaner para que el usuario pueda introducir los datos que se le pide
		Scanner teclado = new Scanner(System.in);
		// Creo las variables de fila y columnas y la tabla
		int fila;
		int col;
		int[][] tabla;

		// Le pido al usuario el número de filas y columnas
		System.out.print("Introduce el número de filas: ");
		fila = teclado.nextInt();

		System.out.print("Introduce el número de columnas: ");
		col = teclado.nextInt();

		tabla = new int[fila][col];

		// Relleno la tabla con los valores 10 * i + j
		for (int i = 0; i < fila; i++) {
			for (int j = 0; j < col; j++) {
				tabla[i][j] = 10 * i + j;
			}
		}

		// Muestro la tabla
		System.out.println("Tabla bidimensional:");
		for (int i = 0; i < fila; i++) {
			for (int j = 0; j < col; j++) {
				System.out.print(tabla[i][j] + "\t");
			}
			System.out.println();
		}
	}
}