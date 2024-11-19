package boletin4;

public class Ejercicio4 {

	public static void main(String[] args) {
		// Ejemplo de prueba
		int[] t = { 10, 20, 30, 40, 50 };
		int clave = 30;

		int posicion = buscar(t, clave);

		if (posicion != -1) {
			System.out.println("El valor " + clave + " se encuentra en la posición: " + posicion);
		} else {
			System.out.println("El valor " + clave + " no se encuentra en la tabla.");
		}
	}

	static int buscar(int t[], int clave) {
		int posicion = -1; // Inicializamos la posición como no encontrada

		for (int i = 0; i < t.length; i++) {
			if (t[i] == clave) {
				posicion = i; // Actualizamos la posición si encontramos el valor
				break; // Terminamos el bucle al encontrar el valor
			}
		}

		return posicion; // Retornamos la posición, -1 si no se encontró
	}
}