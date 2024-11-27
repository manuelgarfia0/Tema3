package boletin4_2;

public class Ejercicio3 {

	public static void main(String[] args) {

		int[][] matrizSimetrica = { { 1, 2, 3 }, { 2, 4, 5 }, { 3, 5, 6 } };
		
		System.out.println(esSimetrica(matrizSimetrica));
	}

	static boolean esSimetrica(int[][] matriz) {
		boolean simetrica = true;
		int i = 1;

		while (i < matriz.length && simetrica) {
			for (int j = 0; j < i; j++) {
				if (matriz[i][j] != matriz[j][i]) {
					simetrica = false;
				}
			}
			i++;
		}

		return simetrica;
	}
}