package arrays_bidimensionales;

import java.util.Scanner;

public class Ejercicio01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// var
		// tabla 2D de 6x3
		int[][] tablabi = new int[3][6];

//		Así es como se debería mostrar, de 3 filas x 6 columnas
//		0	30	2	0	0	5	
//		75	0	0	0	0	0	
//		0	0	-2	9	0	11

		// asignación de valores al array 2D
		tablabi[0][0] = 0;
		tablabi[0][1] = 30;
		tablabi[0][2] = 2;
		tablabi[0][5] = 5;
		tablabi[1][0] = 75;
		tablabi[1][4] = 0;
		tablabi[2][2] = -2;
		tablabi[2][3] = 9;
		tablabi[2][5] = 11;

		// muestra el contenido del array 2D con un for each
		for (int[] fila : tablabi) {
			for (int valor : fila) {
				System.out.print(valor + "\t");
			}
			System.out.println("");
		}

//		//muestra el contenido del array 2D con un for
//		for (int i = 0; i < 3; i++) {
//			for (int j = 0; j < 6; j++) {
//				System.out.print(tablabi[i][j] + "\t");
//			}
//			System.out.println("");
//		}

		// cierre
		sc.close();

	}

}
