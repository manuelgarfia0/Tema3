package boletin4_1;

import java.util.Arrays;

public class Ejercicio6 {

	public static void main(String[] args) {
		// Creamos una tabla y le asignamos unos valores
		int[] tabla = { 10, 1, 5, 8, 9, 2 };
		// Llamamos a la función
		int resultado[] = suma(tabla, 3);
		// Mostramos la tabla
		System.out.println(Arrays.toString(resultado));
	}

	static int[] suma(int t[], int numElementos) {
		// El tamaño de la tabla resultante es longitud - numElementos +1
		int[] result = new int[t.length - numElementos + 1];

		// Recorremos la tabla resultante y así nos aseguramos que no nos salimos de los
		// límites
		for (int i = 0; i < result.length; i++) {
			// Las posiciones que tengo que sumar del array van desde i (posición de la
			// resultante que tengo que rellenar) hasta i+numElementos-1
			for (int j = i; j < i + numElementos; j++) {
				result[i] += t[j];
			}
		}

		return result;
	}
}