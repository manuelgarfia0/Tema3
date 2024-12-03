package boletin5;

import java.util.Arrays;
import java.util.Random;

public class Ejercicio3 {

	public static void main(String[] args) {

		int tabla[][] = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 } };

		desordenarTabla(tabla);

		for (int i = 0; i < tabla.length; i++) {
			System.out.println(Arrays.toString(tabla[i]));
		}

	}

	static void desordenarTabla(int[][] tabla) {
		Random random = new Random();
		int posAleatoria;
		int aux;
		
		for(int i = 0; i<tabla.length; i++) {
			for(int j = 0; j<tabla.length; j++) {
				posAleatoria = random.nextInt(0, tabla.length);
				aux = tabla[i][j];
				tabla[i][j] = tabla[posAleatoria][posAleatoria];
				tabla[posAleatoria][posAleatoria] = aux;
			}
		}
		
	}
}