package arrays_sin_funciones;

import java.util.Scanner;

public class Ejercicio08 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// var
		double tablaCien[] = new double[100];
		// numero aleatorio que se le asignará a la posición de la tabla
		double numAleatorio;
		// numero que el usuario introducirá y se buscará en la tabla
		double buscaNum;
		// cantidad de numeros encontrados en la tabla
		int contNum = 0;

		// bucle para asignar valores aleatorios a la tabla
		for (int i = 0; i < tablaCien.length; i++) {
			numAleatorio = (1 + Math.random() * 10);
			tablaCien[i] = numAleatorio;
		}

		System.out.println("¿Qué número quieres encontrar en la tabla?");
		buscaNum = sc.nextDouble();

		// bucle para recorrer la tabla y contar cuentos números N(que introduce el
		// usuario) hay en la tabla
		for (double posTabla : tablaCien) {
			if (posTabla == buscaNum) {
				contNum++;
			}
		}

//		comprueba los números dentro de la tabla
//		for(double posTabla : tablaCien) {
//			System.out.println(posTabla);
//		}

		System.out.println("Hay " + contNum + " números.");

		sc.close();
	}

}
