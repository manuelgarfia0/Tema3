package stringParte1;

import java.util.Scanner;

public class Ejercicio2 {

	static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		// Creo un string para que el jugador 1 introduzca la contraseña y otro para que
		// el jugador 2 adivine la contraseña
		final String contraseña;
		String adivinarContraseña;
		String pista = "";

		// Imprimo un mensaje inicial
		System.out.println("Bienvenido a adivina la contraseña");
		// Pido al jugador 1 que introduzca la contraseña
		System.out.println("Jugador 1 introduce una contraseña: ");
		contraseña = scanner.nextLine();
		// Pido al jugador 2 que introduzca la contraseña
		System.out.println("Jugador 2 adivina la contraseña de " + contraseña.length() + " caracteres: ");
		adivinarContraseña = scanner.nextLine();
		// Si el jugador 2 falla se meterá en un bucle en el que le pedirá que
		// introduzca la contraseña hasta que gane
		while (!contraseña.equals(adivinarContraseña)) {
			// Le decimos al usuario que ha fallado
			System.out.println("Has fallado");
			// Usamos un for para recorrer la contraseña de letra en letra
			for (int i = 0; i < contraseña.length(); i++) {
				// Usamos un if para saber las letras que coinciden entre la palabra del jugador
				// 1 y del jugador 2
				if (i < adivinarContraseña.length() && contraseña.charAt(i) == adivinarContraseña.charAt(i)) {
					pista += contraseña.charAt(i);
					// Usamos un else para las letras que no coincidan se proyecten como un
					// asterisco
				} else {
					pista += ("*");

				}
			}
			// Imprimimos la pista con las letras que coinciden y no
			System.out.print(pista);
			// Imprimimos un espacio en blanco
			System.out.println();
			// Volvemos a preguntar al usuario para que ingrese otra contraseña
			System.out.println("Vuelve a intentarlo: ");
			adivinarContraseña = scanner.nextLine();
			// Inicializamos la pista a una cadena abierta para que no se repita la anterior
			pista = "";
		}
		System.out.println("Has adivinado la contraseña");

		scanner.close();
	}
}
