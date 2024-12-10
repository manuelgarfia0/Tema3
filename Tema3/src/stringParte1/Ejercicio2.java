package stringParte1;

import java.util.Scanner;

public class Ejercicio2 {

	static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		// Creo un string para que el jugador 1 introduzca la contraseña y otro para que
		// el jugador 2 adivine la contraseña
		final String contraseña;
		String adivinarContraseña;
		
		// Imprimo un mensaje inicial
		System.out.println("Bienvenido a adivina la contraseña");
		// Pido al jugador 1 que introduzca la contraseña
		System.out.println("Jugador 1 introduce una contraseña: ");
		contraseña = scanner.nextLine();
		// Pido al jugador 2 que introduzca la contraseña
		System.out.println("Jugador 2 adivina la contraseña de " + contraseña.length() +" caracteres: ");
		adivinarContraseña = scanner.nextLine();
		// Si el jugador 2 adivina la contraseña a la primera se le enviará un mensaje
		// de que ha ganado
		if (contraseña.equals(adivinarContraseña)) {
			System.out.println("Has adivinado la contraseña");
		}
		// Si el jugador 2 falla se meterá en un bucle en el que le pedirá que
		// introduzca la contraseña hasta que gane
		while (!contraseña.equals(adivinarContraseña)) {
			System.out.println("Has fallado");
			for(int i = 0; i<contraseña.length(); i++) {
				for(int j = 0; j<adivinarContraseña.length(); j++) {
					if(contraseña.charAt(i)==adivinarContraseña.charAt(j)) {
						System.out.print(contraseña.charAt(i));
					}
				}
			}break;
		}

		System.out.println();
		
		System.out.println("Vuelve a intentarlo: ");
		adivinarContraseña = scanner.nextLine();
			
		if (contraseña.equals(adivinarContraseña)) {
			System.out.println("Has adivinado la contraseña");
		}
	}

}
