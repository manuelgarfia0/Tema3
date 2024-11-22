package boletin4_1;

public class Ejercicio4 {

	public static void main(String[] args) {
		// Creo una tabla con números enteros
		int[] tabla = { 10, 20, 30, 40, 50 };
		// Asigno el valor clave a una variable
		int clave = 30;
		// Llamo la función
		int posicion = buscar(tabla, clave);
		// Creo un if para que en caso de que no encuentre el valor devuelva -1
		if (posicion != -1) {
			System.out.println(clave + " se encuentra en la posición " + posicion);
		} else {
			System.out.println(posicion);
		}
	}

	// Creo una función
	static int buscar(int tabla[], int clave) {
		// Creo la variable posición
		int posicion = 0;
		// Creo un boolean para cuando encuentre el número
		boolean enc = false;
		// Creo un while para busque en cada una de las posiciones y me indique la
		// posición
		while (posicion < tabla.length && !enc) {
			if (tabla[posicion] == clave) {
				enc = true;
			} else {
				posicion++;
			}
		}
		// Creo un if para que en caso de que no lo encuentre me devuelva -1
		if (!enc) {
			posicion = -1;
		}

		return posicion;
	}
}