package arraysSinFunciones;

import java.util.Scanner;

public class Ejercicio05 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// var
		// se guarda un numero que se asignará a una posición de un array
		int numero;
		// se guarda la suma de los números de una tabla
		int numSuma=0;
		//guarda el menor número de la tabla
		int minimo =  Integer.MAX_VALUE;
		//guarda el mayor número de la tabla
		int maximo = Integer.MIN_VALUE;
		// tabla de 10 numeros
		int tablaDiez[] = new int[10];

		// bucle para pedir valores para la tabla, además comprueba que número es mayor y menor
		for (int i = 0; i < tablaDiez.length; i++) {
			System.out.println("Introduce un número: ");
			numero = sc.nextInt();
			tablaDiez[i] = numero;
			//comprobación de número máximo y mínimo
			if(numero > maximo){
				maximo = numero;
			}
			if(numero < minimo) {
				minimo = numero;
			}
		}
		//bucle para sumar los números de la tabla
		for(int posicion : tablaDiez) {
			numSuma = numSuma + posicion;
			
		}
		//muestra los resultados
		System.out.println("La suma de los números es: " + numSuma);
		System.out.println("El número menor es " + minimo + " y el máximo es " + maximo);
		
		sc.close();

	}

}
