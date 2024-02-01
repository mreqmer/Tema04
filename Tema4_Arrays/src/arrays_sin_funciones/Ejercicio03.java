package arrays_sin_funciones;

import java.util.Scanner;

public class Ejercicio03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// var
		//guarda el numero introducido por el usuario
		int numero;
		//tabla de 10 numeros
		int tablaDiez[] = new int [10];
		
		//bucle para asignar valores desde el final de lña tabla hasta el principio
		for(int i = tablaDiez.length - 1; i>=0; i--) {
			System.out.println("Introduce un número: ");
			numero = sc.nextInt();
			tablaDiez[i] = numero;
		}
		//bucle para mostar en orden los números de la tabla
		for(int posicion : tablaDiez) {
			System.out.println(posicion);
		}
		
		sc.close();

	}

}
