package arraysBidimensionales;

import java.util.Scanner;

public class ejercicio03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = 4;
		int m = 8;
		
		tabla(n, m);
		sc.close();

	}

	static public void tabla(int n, int m) {
		int tabla[][] = new int[n][m];
		int calculo = 10 * n + m;
		for (int y = 0; y < m; y++) {
			for (int x = 0; x < n; x++) {
				if (x == n - 1 && y == m - 1) {
					tabla[x][y] = calculo;
				}
				System.out.print(tabla[x][y] + "\t");

			}
			System.out.println("");
		}

	}

}
