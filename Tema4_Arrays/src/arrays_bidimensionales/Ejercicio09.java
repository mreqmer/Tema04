package arrays_bidimensionales;

public class Ejercicio09 {

	public static void main(String[] args) {
		// var
		// matriz mágica
		int[][] magica = { { 8, 1, 6 }, { 3, 5, 7 }, { 4, 9, 2 } };
		// matriz no mágica
		int[][] noMagica = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };

		System.out.println(esMagica(magica) ? "Es mágica" : "No es mágica");
		System.out.println(esMagica(noMagica) ? "Es mágica" : "No es mágica");
	}

	static boolean esMagica(int t[][]) {
		// guarda la suma de la primera fila
		int sumaFilaUno = 0;
		// guarda la suma de las filas
		int sumaFila = 0;
		// guarda la suma de la primera columna
		int sumaColUno = 0;
		// guarda la suma de la columna actual
		int sumaCol = 0;
		// boleano que comprueba si las filas y las col son iguales
		boolean magico = false;

		// suma las filas
		for (int i = 0; i < t.length; i++) {
			for (int j = 0; j < t.length; j++) {
				//si está en la primera fila se asignan las sumas a ambas variables
				if (i == 0) {
					sumaColUno += t[j][i];
					sumaCol=sumaColUno;
					sumaFilaUno += t[i][j];
					sumaFila=sumaFilaUno;
				//sino solo a la suma de la fila en la que está
				} else {
					sumaFila += t[i][j];
					sumaCol += t[i][j];
				}
			}
			//si la suma de la primera fila coincide con la suma de la actual se queda true
			if ((sumaFilaUno == sumaFila) && (sumaColUno == sumaCol)) {
				magico = true;
			} else {
				magico = false;
			}
			//reinicia los sumatorios de fila y columna
			sumaFila=0;
			sumaCol=0;
		}

		return magico;
	}

}
