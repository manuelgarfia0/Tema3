package boletin3;

public class Ejercicio1 {

	public static void main(String[] args) {
		// Creo una tabla con 3 filas y 6 columnas
		int num[][] = new int[3][6];
		// Introduzco cada número en su posición correspondiente
		num[1][0] = 75;
		num[0][0] = 0;
		num[0][1] = 30;
		num[0][2] = 2;
		num[2][2] = -2;
		num[2][3] = 9;
		num[1][4] = 0;
		num[2][5] = 11;
		num[0][5] = 5;
		// Gracias a dos bucles, pongo la tabla en forma de matriz
		for(int fila = 0; fila<num.length; fila++) {
			for(int col = 0; col<num[fila].length; col++) {
				System.out.print(num[fila][col] + " ");
			}
			System.out.println();
		}
	}

}
