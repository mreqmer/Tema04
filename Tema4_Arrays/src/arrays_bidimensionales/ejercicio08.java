package arrays_bidimensionales;

public class ejercicio08 {

	public static void main(String[] args) {
		int array1[][] = { { 1, 2, 3 }, { 2, 5, 0 }, { 3, 0, 5 } };

		System.out.println((esSimetrica(array1)) ? "Es simetrica" : "No es simetrica");
	}

	static boolean esSimetrica(int t1[][]) {
		boolean simetria = true;

			for (int i = 0; i < t1.length; i++) {
				for (int j = 0; j < t1.length; j++) {
					if (t1[i][j] != t1[j][i]) {
						simetria = false;
						break;
					}
				} // for
			} // for
			
		return simetria;
	}

}
