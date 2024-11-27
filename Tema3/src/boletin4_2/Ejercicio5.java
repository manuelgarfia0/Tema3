package boletin4_2;

public class Ejercicio5 {

	public static void main(String[] args) {

		int[][] matriz = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 }, { 13, 14, 15, 16 } };
		int[][] tabla90 = gira90(matriz);

		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				System.out.print(matriz[i][j] + "\t");
			}
			System.out.println();
		}

		System.out.println();

		for (int i = 0; i < tabla90.length; i++) {
			for (int j = 0; j < tabla90[i].length; j++) {
				System.out.print(tabla90[i][j] + "\t");
			}
			System.out.println();
		}

	}

	static int[][] gira90(int tablaInicio[][]) {
		int[][] tabla90 = new int[tablaInicio.length][tablaInicio[0].length];

		for (int i = 0; i < tablaInicio.length; i++) {
			for (int j = 0; j < tablaInicio[i].length; j++) {
				tabla90[j][tabla90.length - 1 - i] = tablaInicio[i][j];
			}
		}
		return tabla90;
	}

}