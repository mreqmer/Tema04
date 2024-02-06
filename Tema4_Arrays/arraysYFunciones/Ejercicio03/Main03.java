package Ejercicio03;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main03 {
	// genera números random
	static Random rand = new Random();
	// escaner
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		// array
		int tabla[];
		// longitud que tendrá el array
		int longitud;
		// número más grande que tomarán los números a rellenar
		int numMax;
		// pregunta por los datos al usuario
		System.out.println("Largo de la tabla: ");
		longitud = sc.nextInt();
		System.out.println("Número máximo a rellenar: ");
		numMax = sc.nextInt();
		// inicializa la tabla con longitud
		tabla = new int[longitud];
		// llama a la función que rellena la tabla
		tabla = rellenaPares(longitud, numMax);
		// muestra el aray generado
		System.out.println(Arrays.toString(tabla));
		// cierre de escaner
		sc.close();

	}

	// Se encarga de rellenar un array con números pares, además se le introduce el
	// número máximo a generar
	static int[] rellenaPares(int longitud, int fin) {
		//guarda el valor aleatorio recien generado
		int aleatorio;
		//contador
		int i = 0;
		//array
		int tablaPares[] = new int[longitud];
		// bucle que controla si el número generado es par o impar, si es par se asigna
		// el número a la tabla y se suma uno a i, hasta llegar a la longitud del array
		while (i < tablaPares.length) {
			aleatorio = rand.nextInt(2, fin + 1);
			if (aleatorio % 2 == 0) {
				tablaPares[i] = aleatorio;
				i++;
			}
		}
		//ordena la tabla
		Arrays.sort(tablaPares);
		//devuelve la tabla rellena
		return tablaPares;
	}
}
