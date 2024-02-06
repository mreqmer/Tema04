package arrays_sin_funciones;

import java.util.Scanner;

public class Ejercicio05 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// var
		// se guarda la suma de los números de una tabla
		int numSuma = 0;
		// guarda el menor número de la tabla
		int minimo = Integer.MAX_VALUE;
		// guarda el mayor número de la tabla
		int maximo = Integer.MIN_VALUE;
		// tabla de 10 numeros
		int tablaDiez[] = new int[10];

		// pide los valores para la tabla, además comprueba que número es mayor y menor
		for (int i = 0; i < tablaDiez.length; i++) {
			System.out.println("Introduce un número: ");
			tablaDiez[i] = sc.nextInt();
			
			
		}
		// bucle para sumar los números de la tabla
		// comprobación de número máximo y mínimo
		for (int posicion : tablaDiez) {
			numSuma += posicion;
			if (posicion > maximo) {
				maximo = posicion;
			}
			if (posicion < minimo) {
				minimo = posicion;
			}

		}
		// muestra los resultados
		System.out.println("La suma de los números es: " + numSuma);
		System.out.println("El número menor es " + minimo + " y el máximo es " + maximo);

		sc.close();

	}

}
