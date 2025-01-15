package englisharray;

import java.util.Arrays;
import java.util.Scanner;

public class Exercise1 {

	public static void main(String[] args) {
		// We create a scanner to let the user introduce the numbers of the array
		Scanner keyboard = new Scanner(System.in);
		// We create the array to store the numbers
		int numbers[] = new int[10];
		// We create a variable named value
		int value;
		// We create a
		int position;
		String mode = "";

		do {
			System.out.println("a. To show values");
			System.out.println("b. To introduce a value");
			System.out.println("c. To exit");
			mode = keyboard.next();
			switch (mode) {
			case "a":
				System.out.println(Arrays.toString(numbers));
				break;
			case "b":
				System.out.println("Tell me the value you want to introduce: ");
				value = keyboard.nextInt();
				System.out.println("Tell me the position of the value: ");
				position = keyboard.nextInt();
				numbers[position] = value;
				break;
			case "c":

			}
		} while (!(mode.equalsIgnoreCase("c")));

	}

}