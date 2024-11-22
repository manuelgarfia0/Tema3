package boletin4_1;

public class Ejercicio5 {

	public static void main(String[] args) {
		// Creo una tabla
		int[] t = { 1, 2, 3, 2, 4, 2, 5 };
		// Asigno el valor que se busca a una variable
		int valor = 2;
		// Llamo a la funcíon
		int[] indices = buscarTodos(t, valor);

		// Muestro las posiciones donde se encuentra el valor
		System.out.println("Índices donde se encuentra el valor " + valor + ":");
		for (int indice : indices) {
			System.out.print(indice + " ");
		}
	}

	// Creo una función para buscar el valor
	static int[] buscarTodos(int t[], int valor) {
		// Llamo a la función
		int tamaño = numVeces(t, valor);
		// Creo una tabla de la longitud de todas las posiciones en las que está el
		// número que se pide
		int[] tabla = new int[tamaño];
		int posicion = 0;
		// Creo un if para que si el número que se muestre no está en la tabla no se
		// muestre nada
		if (tamaño == 0) {
		}
		// Creo un for para que detecte en que índices se encuentra el valor
		for (int i = 0; i < t.length; i++) {
			if (t[i] == valor) {
				tabla[posicion++] = i;
			}
		}

		return tabla;
	}

	// Creo un función para saber las veces que sale el valor en la tabla
	static int numVeces(int t[], int valor) {
		// Creo una variable que me va a servir de contador
		int cont = 0;
		// Creo un for-each para que el contador sume por posición que pasa
		for (int contenido : t) {
			if (contenido == valor) {
				cont++;
			}
		}
		return cont;
	}
}