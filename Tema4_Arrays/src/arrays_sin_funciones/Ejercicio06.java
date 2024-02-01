package arrays_sin_funciones;

import java.util.Scanner;

public class Ejercicio06 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// var
		//guarda el numero que se le asignará a una posición de la tabla
		int numero;
		//tabla de 8 números
		int tablaOcho[] = new int[8];
		
		//bucle para asignar números a la tabla
		for(int i = 0; i < tablaOcho.length; i++) {
			System.out.println("Introduce un número: ");
			numero = sc.nextInt();
			tablaOcho[i] = numero;
		}
		//bucle para mostrar los números y mostrar si son pares o no
		for(int posicion : tablaOcho) {
			
			System.out.print(posicion);
			System.out.println((posicion%2==0) ? " es par." : " es impar.");
		}
		
		sc.close();
		
	}

}
