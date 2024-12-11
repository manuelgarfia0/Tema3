package stringParte1;

import java.util.Scanner;

public class Ejercicio4 {

	static Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) {

		String frase;
		
		System.out.println("Introduce una frase: ");
		frase = scanner.nextLine();
		
		reversa (frase);
	}
	
	static String reversa(String fraseUsuario) {
		
		String fraseRevertida = "";
		
		for(int i = fraseUsuario.length() - 1; i>=0; i--) {
			fraseRevertida = fraseRevertida + fraseUsuario.charAt(i);
		}
		
		System.out.println(fraseRevertida);
		
		return fraseRevertida;
	}

}
