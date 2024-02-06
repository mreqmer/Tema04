package arrays_bidimensionales;

import java.util.Arrays;
import java.util.Random;

public class ejercicio06 {

	static Random rand = new Random();
	static final int FILAS = 6;
	static final int COL = 10;

	public static void main(String[] args) {
		// var
		int[][] tabla = new int[FILAS][COL];
		int[] dosPosiciones = new int[2];

		rellenaAleatorio(tabla);
		
		muestraTabla(tabla);
		
		rellenaMinMax(tabla);
		
		
		dosPosiciones=rellenaMinMax(tabla);
		System.out.println(Arrays.toString(dosPosiciones));
		
	}

	//rellena un array de dos posiciones con el min y el max de otro array
	static int[] rellenaMinMax(int[][] t) {
		// tabla que guardará los valores mínimo y máximos del array introducido por
		// parámetro
		int tablaMinMax[]= {0,0};
		// valor mínimo
		int min = Integer.MAX_VALUE;
		// valor máximo
		int max = Integer.MIN_VALUE;

		// recorre el array 2d buscando los valores mínimos y máximos, si los encuentra
		for (int i = 0; i < t.length; i++) {
			for (int j = 0; j < t[0].length; j++) {
				if (t[i][j] < min) {
					min = t[i][j];
				}
				if (t[i][j] > max) {
					max = t[i][j];
				}
			}
		}
		
		// asigna a la posición 0 del array el mínimo y la 1 el máximo
		tablaMinMax[0]=min;
		tablaMinMax[1]=max;

		return tablaMinMax;
	}

	//llena un array de valores aleatorios
	static void rellenaAleatorio(int[][] t) {
		for (int i = 0; i < t.length; i++) {
			for (int j = 0; j < t[0].length; j++) {
				t[i][j] = rand.nextInt(0, 1001);

			}
		}

	}

	//muestra el array
	static void muestraTabla(int[][]t) {
		for(int[] fila:t) {
			for(int valor:fila) {
				System.out.print(valor +"\t");
			}
			System.out.println();
		}
	}
}
