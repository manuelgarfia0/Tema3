package boletin1;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		// Creo una tabla para los 10 números a introducir
		int numeros[] = new int[10];
		// Creao un escaner para que el usuario pueda introducir los números
		Scanner teclado = new Scanner(System.in);
		// Creo un for para que el usuario pueda modificar la tabla
		// Lo creo empezando en el ultimo recuadro y que vaya hacia el primer recuadro
		// para que se proyecten los números introducidos en sentido contrario
		for (int i = 9; i >= 0; i--) {
			System.out.println("Introduce un número: ");
			numeros[i] = teclado.nextInt();
		}
		// Creo un for-each para proyectar la tabla
		for (int valor : numeros) {
			System.out.print(valor + " ");
		}

	}

}