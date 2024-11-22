package boletin4_1;

import java.util.Arrays;

public class Ejercicio6 {

	public static void main(String[] args) {
		int[] tabla = { 10, 1, 5, 8, 9, 2 };

		int resultado[] = suma(tabla, 3);

		System.out.println(Arrays.toString(resultado));
	}

	static int[] suma(int t[], int numElementos) {

		int[] result = new int[t.length - numElementos + 1];

		for (int i = 0; i < result.length; i++) {
			for (int j = i; j < i + numElementos; j++) {
				result[i] += t[j];
			}
		}

		return result;
	}
}