package boletin4_1;

public class Ejercicio1 {

	public static void main(String[] args) {
		// Creo la tabla de números enteros
		int tablaEnteros[] = { 2, 3, 4, 5, 6, 7, 8 };
		// Llamo a la función
		int sumaEnteros = sumaTabla(tablaEnteros);
		// Imprimom el resultado
		System.out.println(sumaEnteros);
	}

	// Creo la función con la variable tabla
	static int sumaTabla(int[] tabla) {
		// Creo la variable suma
		int suma = 0;
		// Con un for-each muestro el resultado
		for (int valor : tabla) {
			suma += valor;
		}
		return suma;
	}

}
