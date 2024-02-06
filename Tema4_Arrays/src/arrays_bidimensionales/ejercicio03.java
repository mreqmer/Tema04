package arrays_bidimensionales;

import java.util.Scanner;

public class ejercicio03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = 4;
		int m = 5;
		
		//muestra la tabla
		tabla(n, m);
		//cierre escaner
		sc.close();

	}

	//se encarga de pintar una tabla en la que los valores sean 10 * n + m, que corresponden con i y j
	static public void tabla(int n, int m) {
		int tabla[][] = new int[n][m];
		
		for (int i = 0; i < tabla.length; i++) {
			for (int j = 0; j < tabla[0].length; j++) {
				tabla[i][j] = 10*i+j;
				System.out.print(tabla[i][j] + "\t");

			}
			System.out.println("");
		}

	}

}
