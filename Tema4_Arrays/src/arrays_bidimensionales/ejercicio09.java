package arrays_bidimensionales;

public class ejercicio09 {
	
	static final int X = 4;
	static final int Y = 4;

	public static void main(String[] args) {
		int tablaNormal[][] = new int[X][Y];
		int tablaTrans[][];
		int tablaReves[][];
		int numero = 0;

		for (int i = 0; i < tablaNormal.length; i++) {
			for (int j = 0; j < tablaNormal[0].length; j++) {
				numero++;
				tablaNormal[i][j] = numero;
				System.out.print(tablaNormal[i][j] + "\t");
			}
			System.out.println();
		}

		System.out.println();

		tablaTrans=transposicion(tablaNormal);
		System.out.println();
		tablaReves=vuelta(tablaNormal);
	}

	static int[][] transposicion(int tabla[][]) {
		
		int[][]tablaTranspuesta = new int[X][Y];
		
		for (int i = 0; i < tabla.length; i++) {
			for (int j = 0; j < tabla[0].length; j++) {
				tablaTranspuesta[i][j]=tabla[j][i];
				System.out.print(tabla[j][i] + "\t");
			}
			System.out.println();
		}
		return tablaTranspuesta;
	}
	
	static int[][] vuelta (int tabla[][]) {
		
		int[][]tablaReves = new int[X][Y];
		
		for (int i = tabla.length-1; i >= 0 ; i--) {
			for (int j = tabla[0].length-1; j >= 0 ; j--) {
				tablaReves[i][j]=tabla[j][i];
				System.out.print(tabla[j][i] + "\t");
			}
			System.out.println();
		}
		return tablaReves;
	}

}
