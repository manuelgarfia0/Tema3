package boletin4_2;

public class Ejercicio4 {

	public static void main(String[] args) {
		int[][] matriz = { { 4, 9, 2 }, { 3, 5, 7 }, { 8, 1, 6 } };

		System.out.println(esMagica(matriz));
	}

	static boolean esMagica(int tabla[][]) {
		boolean magica = true;
		int suma = 0;
		int sumaTotal;
		int j;
		int i = 1;

		for (j = 0; j < tabla[0].length; j++) {
			suma += tabla[0][j];
		}
		while (i < tabla.length && magica) {
			sumaTotal = 0;
			for (j = 0; j < tabla[i].length; j++) {
				sumaTotal += tabla[i][j];
			}
			if (suma != sumaTotal) {
				magica = false;
			}
			i++;
		}
		j = 0;
		while (j < tabla[0].length && magica) {
			sumaTotal = 0;
			for (i = 0; i < tabla.length; i++) {
				sumaTotal += tabla[i][j];
			}
			if (suma != sumaTotal) {
				magica = false;
			}
			j++;
		}
		return magica;
	}
}