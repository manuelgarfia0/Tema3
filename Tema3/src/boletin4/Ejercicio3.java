package boletin4;

import java.util.Random;

public class Ejercicio3 {

	public static void main(String[] args) {
		// Ejemplo de prueba
		int longitud = 5;
		int fin = 20;

		int[] pares = rellenaPares(longitud, fin);

		System.out.println("Arreglo de pares aleatorios:");
		for (int num : pares) {
			System.out.println(num);
		}
	}

	static int[] rellenaPares(int longitud, int fin) {
		int[] tabla; // Declaramos el arreglo fuera del flujo condicional

		if (longitud <= 0 || fin < 2) {
			tabla = new int[0]; // Si los parámetros son inválidos, asignamos un arreglo vacío
		} else {
			tabla = new int[longitud];
			Random random = new Random();

			for (int i = 0; i < longitud; i++) {
				int par;
				do {
					par = random.nextInt(fin - 1) + 2; // Genera un número entre 2 y fin inclusive
				} while (par % 2 != 0); // Asegura que sea par
				tabla[i] = par;
			}
		}

		return tabla;
	}
}