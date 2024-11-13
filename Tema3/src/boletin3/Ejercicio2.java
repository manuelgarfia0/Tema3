package boletin3;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);

		double notas[][] = new double[4][5];
		double min = Double.MAX_VALUE;
		double max = Double.MIN_VALUE;
		double media1;
		double media2;
		double media3;
		double media4;

		// Gracias a dos bucles, el usuario puede introducir las notas de los alumnos
		for (int fila = 0; fila < notas.length; fila++) {
			System.out.println("Alumno " + (fila + 1) + ":");
			for (int col = 0; col < notas[fila].length; col++) {
				System.out.println("¿Qué notas has sacado en la asignatura " + (col + 1) + "? ");
				notas[fila][col] = teclado.nextDouble();
			}
		}

		// Ahora usamos los mismo bucles pero para mostrar la tabla en vez de
		// modificarla
		System.out.println();
		for (int fila = 0; fila < notas.length; fila++) {
			System.out.print("Alumno " + (fila + 1) + ":" + "\t");
			for (int col = 0; col < notas[fila].length; col++) {
				System.out.print(notas[fila][col] + "\t");
			}
			System.out.println();
		}
		min = notas[4][5];
		System.out.println("La nota mínima es: " + min);

	}

}
