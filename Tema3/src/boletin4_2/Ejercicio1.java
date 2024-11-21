package boletin4_2;

import java.util.Random;

public class Ejercicio1 {

	public static void main(String[] args) {

		int filas = 6;
		int columnas = 10;
		int[][] tabla = new int[filas][columnas];
		Random random = new Random();

		for (int i = 0; i < filas; i++) {
			for (int j = 0; j < columnas; j++) {
				tabla[i][j] = random.nextInt(1001);
			}
		}

		System.out.println("Tabla generada:");
		for (int i = 0; i < filas; i++) {
			for (int j = 0; j < columnas; j++) {
				System.out.print(tabla[i][j] + "\t");
			}
			System.out.println();
		}

		int[] minMax = encontrarMinMax(tabla);

		System.out.println("\nMínimo valor de la tabla: " + minMax[0]);
		System.out.println("Máximo valor de la tabla: " + minMax[1]);
	}

	static int[] encontrarMinMax(int[][] tabla) {
		int minimo = Integer.MAX_VALUE;
		int maximo = Integer.MIN_VALUE;

		for (int i = 0; i < tabla.length; i++) {
			for (int j = 0; j < tabla[i].length; j++) {
				if (tabla[i][j] < minimo) {
					minimo = tabla[i][j];
				}
				if (tabla[i][j] > maximo) {
					maximo = tabla[i][j];
				}
			}
		}

		return new int[] { minimo, maximo };
	}
}