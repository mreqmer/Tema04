package arrays_sin_funciones;

import java.util.Scanner;

public class Ejercicio08 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// var
		int tablaCien[] = new int[100];
		// numero que el usuario introducirá y se buscará en la tabla
		int buscaNum;

		// bucle para asignar valores aleatorios a la tabla
		for (int i = 0; i < tablaCien.length; i++) {
			tablaCien[i] = (int) (1 + Math.random() * 10);
			
		}
		//pregunta por el número a buscar
		System.out.println("¿Qué número quieres encontrar en la tabla?");
		buscaNum = sc.nextInt();

		System.out.print(buscaNum + " aparece en: ");
		// bucle para recorrer la tabla y mostrar la posición de los números
		for (int i = 0; i < tablaCien.length; i++) {
			if (tablaCien[i] == buscaNum) {
				System.out.print(i + " ");
			}
		}

		sc.close();
	}

}
