package boletin5;

public class Ejercicio1 {

	public static void main(String[] args) {

		int[][] miTabla = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		int valorABuscar = 5;
		boolean encontrado = buscarValor(miTabla, valorABuscar);

		System.out.println(encontrado);
	}

	static boolean buscarValor(int[][] tabla, int valor) {
		boolean encontrado = false;

		for (int i = 0; i < tabla.length; i++) {
			for (int j = 0; j < tabla[i].length; j++) {
				if (tabla[i][j] == valor) {
					encontrado = true;
				}
			}
		}

		return encontrado;
	}
}