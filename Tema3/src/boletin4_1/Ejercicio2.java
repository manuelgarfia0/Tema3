package boletin4_1;

public class Ejercicio2 {

	public static void main(String[] args) {
		// Creo una tabla de números enteros
		int t[] = { 1, 2, 3, 4, 54, 6, 67, 8 };
		// Imprimo el resultado
		System.out.println(maximo(t));
	}

	// Creo una función
	static int maximo(int[] t) {
		// Creo un valor máximo
		int max = Integer.MIN_VALUE;
		// Creo un for para detectar el valor máximo de la tabla
		for (int i = 0; i < t.length; i++) {
			if (max < t[i]) {
				max = t[i];
			}
		}
		return max;
	}

}
