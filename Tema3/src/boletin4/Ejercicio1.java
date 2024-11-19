package boletin4;

public class Ejercicio1 {

	public static void main(String[] args) {
		int tablaEnteros[] = {2, 3, 4, 5, 6, 7, 8};
		
		int sumaEnteros = sumaTabla(tablaEnteros);
		System.out.println(sumaEnteros);
	}
	
	static int sumaTabla(int[] tabla) {
		int suma = 0;

		for (int valor : tabla) {
			suma += valor;
		}

		return suma;
	}

}
