package arraysBidimensionales;

import java.util.Arrays;
import java.util.Random;

public class Ejercicio05 {

	static final int ANCHO = 4;
	static final int ALTO = 5;

	public static void main(String[] args) {

		// var
		// array 6x5
		int[][] tabla;
		int sumaFila = 0;
		int sumaCol = 0;
		int sumaTotal = 0;

		tabla = generaBi();
		
		//recorre el array para mostrarlo y sumar las filas
		for (int[] fila : tabla) {
			sumaFila = 0;
			for (int valor : fila) {
				sumaFila += valor;
				System.out.print(valor + "\t");
			}
			System.out.println(sumaFila);
		}
		//recorre el array transpuesto para sumar las filas, que resulta en el sumatorio de las columnas
		//además aprovehca para sumar las columnas para calcular el sumatorio total y mostrarlo
		for (int j = 0; j < tabla[0].length; j++) {
			sumaCol = 0;
			for (int i = 0; i < tabla.length; i++) {
				sumaCol += tabla[i][j]; 
				
			}
			System.out.print(sumaCol + "\t"); 
			sumaTotal += sumaCol;
		}
		System.out.println(sumaTotal);
	}

	
	// llena la tabla con valores aleatorios
	static int[][] generaBi() {
		Random rand = new Random();
		int[][] tabla = new int[ANCHO][ALTO];
		int aleatorio;

		for (int i = 0; i < tabla.length; i++) {
			for (int j = 0; j < tabla[0].length; j++) {
				aleatorio = rand.nextInt(100, 1000);
				tabla[i][j] = aleatorio;
			}
			System.out.println("");
		}
		return tabla;
	}

}
