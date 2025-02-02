package collections2;

import java.util.HashMap;
import java.util.Map;

public class Ejercicio3 {

	public static void main(String[] args) {
		// Declaración de variables
		String texto;
		Map<Character, Integer> frecuencia = new HashMap<>();
		char c;
		int i;

		// Inicialización de variables
		texto = "En un agujero en el suelo, vivia un hobbit. No un agujero humedo, sucio, repugnante, con restos de gusanos y olor a fango, ni tampoco un agujero, seco, desnudo y arenoso, sin nada en que sentarse o que comer: era un agujero-hobbit, y eso significa comodidad";

		// Contar la frecuencia de cada letra
		for (i = 0; i < texto.length(); i++) {
			c = Character.toLowerCase(texto.charAt(i));
			if (c >= 'a' && c <= 'z') {
				if (!frecuencia.containsKey(c)) {
					frecuencia.put(c, 1);
				} else {
					frecuencia.put(c, frecuencia.get(c) + 1);
				}
			}
		}

		// Mostrar la frecuencia de cada letra
		for (char key : frecuencia.keySet()) {
			System.out.println(key + ": " + frecuencia.get(key));
		}
	}
}