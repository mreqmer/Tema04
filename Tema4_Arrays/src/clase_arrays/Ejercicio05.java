package clase_arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio05 {
	
	static final int NUM_JUGADORES= 8;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//var
		//tabla de puntuaciones de jugadores
		int puntuaciones[] = new int[NUM_JUGADORES];
		
		//pide introducir los datos de los jugadores
		for(int i = 0; i<puntuaciones.length; i++) {
			System.out.println("Puntuación jugador " + (i+1) + ":");
			puntuaciones[i] = sc.nextInt();
		}
		//ordena la tabla
		Arrays.sort(puntuaciones);
		//muestra la tabla en orden inverso, dando los resultado de mayor a menor
		for(int i = puntuaciones.length-1; i>=0; i--) {
			System.out.print(puntuaciones[i]);
		}
		
		sc.close();

	}

}
