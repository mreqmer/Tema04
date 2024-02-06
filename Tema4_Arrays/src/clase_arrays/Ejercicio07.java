package clase_arrays;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Ejercicio07 {

	static final int LONG_LOTERIA = 6;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random rand = new Random();
		// var
		int aleatorio;
		int ganador[] = { 1, 2, 3, 4, 5, 6 };
		int loteria[] = new int[6];
		int i = 0;
		int j = 0;
		int contador = 0;

		while (i < loteria.length) {
			aleatorio = rand.nextInt(1, 50);
			while (j < loteria.length && aleatorio != loteria[i]) {
				j++;
			}
			if (j > loteria.length - 1) {
				loteria[i] = aleatorio;
			}

			j = 0;
			i++;
		}
		
		for(int valor : loteria) {
			if(Arrays.binarySearch(ganador, valor)>=0) {
				contador++;
			}
		}
		
		System.out.println(Arrays.toString(loteria));
		System.out.println(Arrays.toString(ganador));
		System.out.println("Usted tiene " + contador + " aciertos.");

		sc.close();
		
	}

}
