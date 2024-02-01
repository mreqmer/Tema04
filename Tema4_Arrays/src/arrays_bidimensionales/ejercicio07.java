package arrays_bidimensionales;

public class ejercicio07 {

	public static void main(String[] args) {

		int tablaNormal[][]=new int[4][4];
		int numero = 0;
		
		for(int i = 0; i<tablaNormal.length; i++) {
			for(int j = 0; j<tablaNormal[0].length; j++) {
				numero++;
				tablaNormal[i][j] = numero;
				System.out.print(tablaNormal[i][j] + "\t");
			}
			System.out.println();
		}
		
		System.out.println();
		
		transposicion(tablaNormal);
	}
	
	static void transposicion (int tabla[][]) {
		for(int i = 0; i<tabla.length; i++) {
			for(int j = 0; j<tabla[0].length; j++) {
				System.out.print(tabla[j][i] + "\t");
			}
			System.out.println();
		}
	}

}
