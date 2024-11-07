package boletin1;

import java.util.Scanner;

public class Ejercicio7 {

	public static void main(String[] args) {
		// Creo un escaner para que el usuario pueda introducir las temperaturas
		Scanner teclado = new Scanner(System.in);
		// Creo una tabla para introducir las temperaturas de los 12 meses del año
		int temperatura[] = new int[12];
		// Creo otra tabla de variable String para los meses
		String[] mes = { "Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre",
				"Octubre", "Noviembre", "Diciembre" };

		System.out.println("Introduce la temperatura media de los 12 meses del año: ");
		// Creo un for para poder introducir las temperaturas en cada mes
		for (int i = 0; i < mes.length; i++) {
			System.out.println("Introduce la temperatura media que hizo en " + mes[i] + ":");
			temperatura[i] = teclado.nextInt();
		}
		// Creo otro for para los asteriscos
		for (int i = 0; i < mes.length; i++) {
			System.out.println(mes[i] + " ");
			for (int j = 0; j < temperatura[i]; j++) {
				System.out.print("*");
			}
			System.out.println(" " + temperatura[i] + "°C");
		}
	}

}