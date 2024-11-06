package boletin1;

public class Ejercicio4 {

	public static void main(String[] args) {
		// Creo una tabla de int llamada num de 12 de longitud
		int num[] = new int[12];
		// Asigno los valores que me dan a las casillas que me dice
		num[0] = 39;
		num[1] = -2;
		num[4] = 0;
		num[6] = 14;
		num[8] = 5;
		num[9] = 120;
		// Creo un for-each para proyectar la tabla
		for (int valor : num) {
			System.out.print(valor + " ");
		}
	}
}
//Los valores que no han sido inicializados al ser un int se quedan en 0