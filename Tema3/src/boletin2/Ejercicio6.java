package boletin2;

import java.util.Arrays;
import java.util.Random;

public class Ejercicio6 {

	public static void main(String[] args) {
		//
		int primitiva[] = new int[6];
		int combinacionGanadora[] = { 2, 9, 11, 15, 24, 32, 40 };

		Random random = new Random();

		int numeroAleatorio;
		int busqueda;
		int contador = 0;
		int numeroAciertos = 0;

		while (contador < 6) {
			numeroAleatorio = random.nextInt(1, 50);
			Arrays.sort(primitiva);
			busqueda = Arrays.binarySearch(primitiva, numeroAleatorio);
			if (busqueda < 0) {
				primitiva[0] = numeroAleatorio;
				contador++;
			}

		}
		System.out.println(Arrays.toString(primitiva));

		for (int valor : primitiva) {
			busqueda = Arrays.binarySearch(combinacionGanadora, valor);
			if (busqueda >= 0) {
				numeroAciertos++;
			}
		}
		System.out.println("Número de aciertos: " + numeroAciertos);
	}

}
