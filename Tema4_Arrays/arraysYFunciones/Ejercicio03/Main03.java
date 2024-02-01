package Ejercicio03;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main03 {
	static Random rand = new Random();
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int tabla [];
		int longitud;
		int numMax;
		System.out.println("Largo de la tabla: ");
		longitud = sc.nextInt();
		System.out.println("Número máximo a rellenar: ");
		numMax = sc.nextInt();
		tabla = new int[longitud];
		
		tabla = rellenaPares(longitud, numMax);
		
		System.out.println(Arrays.toString(tabla));
		
		sc.close();

	}

	static int[] rellenaPares(int longitud, int fin) {
		int aleatorio;
		int i = 0;
		int tablaPares[] = new int[longitud];
		while (i<longitud) {
			aleatorio = rand.nextInt(2, fin+1);
			if(aleatorio%2==0) {
				tablaPares[i] = aleatorio;
				i++;
			}
		}
		Arrays.sort(tablaPares);
		return tablaPares;
	}
}
