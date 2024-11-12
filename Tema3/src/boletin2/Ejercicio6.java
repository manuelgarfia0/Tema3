package boletin2;

import java.util.Arrays;
import java.util.Random;

public class Ejercicio6 {

	public static void main(String[] args) {
		// Creamos un random
		Random random = new Random();
		// Creamos dos tablas, una para declarar la combinación ganadora y otro para los
		// números aleatorios
		int primitiva[] = new int[6];
		int combinacionGanadora[] = { 2, 9, 11, 15, 24, 32, 40 };
		// Creamos las siguientes variables
		int numeroAleatorio;
		int busqueda;
		int contador = 0;
		int numeroAciertos = 0;
		// Creo un bucle while para que el contador esté debajo de 6
		while (contador < 6) {
			// Hago que salgan números aleatorios
			numeroAleatorio = random.nextInt(1, 50);
			// Ordeno la tabla que se va a generar aleatoriamente
			Arrays.sort(primitiva);
			busqueda = Arrays.binarySearch(primitiva, numeroAleatorio);
			if (busqueda < 0) {
				primitiva[0] = numeroAleatorio;
				contador++;
			}

		}
		// Muestro en pantalla los valores aleatorios
		System.out.println(Arrays.toString(primitiva));

		for (int valor : primitiva) {
			busqueda = Arrays.binarySearch(combinacionGanadora, valor);
			// Con un if hago que si algún número coincide con la combinación ganadora se
			// sume al contador
			if (busqueda >= 0) {
				numeroAciertos++;
			}
		}
		// Muestro el número de acierto que son los números que coinciden con la
		// combinación ganadora
		System.out.println("Número de aciertos: " + numeroAciertos);
	}

}