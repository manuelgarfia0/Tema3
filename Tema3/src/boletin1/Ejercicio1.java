package boletin1;

public class Ejercicio1 {

	public static void main(String[] args) {
		// Creao una tabla de 10 números enteros
		int numAleatorios[] = new int[10];
		// Creo un for-each para que el bucle se ejecute tantas veces como elementos
		// existen
		for (int valor : numAleatorios) {
			valor = (int) (Math.random() * 100 + 1);
			System.out.print(valor + " ");

		}

	}
}