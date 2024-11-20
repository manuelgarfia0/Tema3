package boletin4_1;

public class Ejercicio4 {

	public static void main(String[] args) {
		
		int[] tabla = { 10, 20, 30, 40, 50 };
		int clave = 30;

		int posicion = buscar(tabla, clave);

		if (posicion != -1) {
			System.out.println(clave + " se encuentra en la posición " + posicion);
		} else {
			System.out.println(posicion);
		}
	}

	static int buscar(int tabla[], int clave) {
		int posicion = 0;
		boolean enc = false;

		while (posicion < tabla.length && !enc) {
			if (tabla[posicion] == clave) {
				enc = true;
			} else {
				posicion++;
			}
		}
		if (!enc) {
			posicion = -1;
		}

		return posicion;
	}
}