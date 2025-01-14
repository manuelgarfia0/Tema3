package stringParte1;

public class Ejercicio17 {

	public static void main(String[] args) {
		String codigo = "if (a==3) /* igual a tres */ a++; /* incrementamos a */" + "else { a--; }";

		String res = quitaComentarios(codigo);

		System.out.println(res);

	}

	static String quitaComentarios(String sentenciaC) {

		// Constantes para el inicio y el fin de los comentarios
		final String INICIO = "/*";
		final String FIN = "*/";

		// Inicializamos la cadena resulta a cadena vacía para luego ir concatenando el
		// código
		String cadRes = "";

		// Posición inicio almacena la posición en la que se encuentra el comentario de
		// apertura
		int posInicio = sentenciaC.indexOf(INICIO);
		// Inicializamos posFin a 0
		int posFin = 0;

		// Mientras haya comentarios en el código
		while (posInicio >= 0) {
			// Realizamos un substring para quedarnos con la cadena que es código
			cadRes += sentenciaC.substring(posFin, posInicio).trim() + " ";
			// Calculamos la posición en la que termina el comentario
			posFin = sentenciaC.indexOf(FIN, posInicio) + 2;
			// Volvemos a buscar otro comentario en el código
			posInicio = sentenciaC.indexOf(INICIO, posFin);
		}

		// Cuando ya no hay comentarios concatenamos lo que queda de código
		cadRes += sentenciaC.substring(posFin);

		return cadRes;
	}
}
