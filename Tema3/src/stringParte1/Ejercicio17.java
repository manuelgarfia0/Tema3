package stringParte1;

public class Ejercicio17 {

	public static void main(String[] args) {

		String codigo = "if (a==3) /* igual a tres */ a++; /* incrementamos a */";
		String res = quitaComentarios(codigo);
		System.out.println(res);

	}

	static String quitaComentarios(String sentenciaC) {
		final String INICIO = "/*";
		final String FIN = "*/";

		String cadRes = "";

		int posInicio = sentenciaC.indexOf(INICIO);
		int posFin = 0;

		while (posInicio >= 0) {
			cadRes += sentenciaC.substring(posFin, posInicio).trim() + " ";
			posFin = sentenciaC.indexOf(FIN, posInicio) + 2;
			posInicio = sentenciaC.indexOf(INICIO, posFin);
		}

		return cadRes;
	}
}
