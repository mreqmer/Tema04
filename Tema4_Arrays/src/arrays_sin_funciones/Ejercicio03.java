package arrays_sin_funciones;

import java.util.Scanner;

public class Ejercicio03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// var
		//tabla de 10 numeros
		int tablaDiez[] = new int [10];
		
		//Asigna los valores a una tabla
		for(int i = 0; i<tablaDiez.length; i++) {
			System.out.println("Introduce un número: ");
			tablaDiez[i] = sc.nextInt();
		}
		//muestra los valores en orden inverso
		for(int i = tablaDiez.length - 1; i>=0; i--) {
			System.out.print(tablaDiez[i] + " ");
		}
		
		sc.close();

	}

}
