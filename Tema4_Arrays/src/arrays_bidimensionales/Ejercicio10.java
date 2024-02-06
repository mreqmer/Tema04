package arrays_bidimensionales;

public class Ejercicio10 {
	
	static final int X = 4;
	static final int Y = 4;

	public static void main(String[] args) {
		int tablaNormal[][] = new int[X][Y];
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
		
		gira90(tablaNormal);
		
		
	}

	static void gira90(int tabla[][]) {
		int n = tabla.length;
		int[][]tablaGirada = new int[X][Y];
		
		//función encargada de hacer la transpocisión de la tabla
		for (int i = 0; i < tabla.length; i++) {
			for (int j = 0; j < tabla[0].length; j++) {
				 tablaGirada[j][n - 1 - i] = tabla[i][j];
			}
		}
		
		//dibuja la tabla
		for (int i = 0; i < tabla.length; i++) {
			for (int j = 0; j < tabla[0].length; j++) {
				System.out.print(tablaGirada[i][j] +"\t");
			}
			System.out.println();
		}
		
	}
	

}
