package boletin3;

public class Ejercicio4 {

	public static void main(String[] args) {

		int tabla[][] = new int[10][10];

		for (int i = 0; i < tabla.length; i++) {
			for (int j = 0; j < tabla[0].length; j++) {

				tabla[i][j] = (i + 1) * (j + 1);
			}
		}
		for (int i = 0; i < tabla.length; i++) {
			for (int j = 0; j < tabla[0].length; j++) {

				System.out.print(tabla[i][j] + "\t");
			}
			System.out.println(" ");
		}
	}

}
