package englishString;

import java.util.Scanner;

public class Exercise1 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		String message = "";
		String cipheredMessage = "";
		char letter;
		// Ask the user a message
		System.out.println("Introduce a message to cipher");
		message = scanner.nextLine().toUpperCase();
		// Loop to read a message
		for (int i = 0; i < message.length(); i++) {
			letter = message.charAt(i);
			if ((letter >= 'A' && letter < 'Z') || (letter >= '0' && letter < '9')) {
				// Add the next letter in the alphabet
				cipheredMessage += (char) (((letter + 1) % 'A') + 'A');
			} else if (letter == 'Z') {
				cipheredMessage += 'A';
			} else if (letter == '9') {
				cipheredMessage += '0';
			} else {
				cipheredMessage += letter;
			}
		}

		System.out.println(cipheredMessage);
		// Print the message ciphered
		scanner.close();

	}

}
