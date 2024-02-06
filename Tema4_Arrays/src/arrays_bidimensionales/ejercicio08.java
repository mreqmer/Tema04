package arrays_bidimensionales;

public class ejercicio08 {

	public static void main(String[] args) {
		// var
		// array para probar la función
		int matriz1[][] = { { 1, 2, 3 }, { 2, 5, 0 }, { 3, 0, 5 } };

		// llama a la función que comprueba si es simetrica o no y lo muestra con un
		// mensaje por pantalla
		System.out.println((esSimetrica(matriz1)) ? "Es simetrica" : "No es simetrica");
	}

	// función que comprueba si la matríz es simétrica
	static boolean esSimetrica(int t1[][]) {
		// true si es simétrica y false si no
		boolean simetria = true;

		// recorre el array
		for (int i = 0; i < t1.length; i++) {
			for (int j = 0; j < t1.length; j++) {
				// si la matríz no es igual a su traspuesto entonces simetría pasa a false y
				// termina el bucle
				if (t1[i][j] != t1[j][i]) {
					simetria = false;
					break;
				}
			} // for
		} // for

		return simetria;
	}

}
