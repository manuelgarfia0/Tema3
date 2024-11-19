package boletin4;

import java.util.InputMismatchException;
import java.util.Scanner;

public class pruebaEjercicio3 {

	public static void main(String[] args) {

		int longitud = leeEnteroPositivo;

		int fin = leeEnteroPositivo;

		Scanner teclado = new Scanner(System.in);
	}

	static int leeEnteroPostivo(String valor) {
		
		int longitud;
		int numero;
		
		do {
			try {
				System.out.println("Introduce la longitud");
				longitud = teclado.nextInt();
			} catch (InputMismatchException e) {
				System.err.println("Debe introducir un entero");
			} finally {
				teclado.nextLine();
			}
		} while (numero < 0);

	}

}