package boletin4;

public class Ejercicio2 {

	public static void main(String[] args) {
		int t[] = { 1, 2, 3, 4, 54, 6, 67, 8 };
		System.out.println(maximo(t));
	}

	static int maximo(int[] t) {
		int max = Integer.MIN_VALUE;

		for (int i = 0; i < t.length; i++) {
			if (max < t[i]) {
				max = t[i];
			}
		}
		return max;
	}

}
