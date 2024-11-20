package boletin4_1;

public class Ejercicio5 {

	public static void main(String[] args) {

		int[] t = { 1, 2, 3, 2, 4, 2, 5 };
		int valor = 2;

		int[] indices = buscarTodos(t, valor);

		System.out.println("Índices donde se encuentra el valor " + valor + ":");
		for (int indice : indices) {
			System.out.print(indice + " ");
		}
	}

	static int[] buscarTodos(int t[], int valor) {
		int tamaño = numVeces(t, valor);
		int[] tabla = new int[tamaño];

		if (tamaño == 0) {
			return tabla;
		}

		int posicion = 0;
		for (int i = 0; i < t.length; i++) {
			if (t[i] == valor) {
				tabla[posicion++] = i;
			}
		}

		return tabla;
	}

	static int numVeces(int t[], int valor) {
		int cont = 0;
		for (int contenido : t) {
			if (contenido == valor) {
				cont++;
			}
		}
		return cont;
	}
}