package ejercicio04;

import java.util.Scanner;

public class Main04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// var
		// número a buscar en la tabla
		int clave;
		// posición de la clave, -1 indica error
		int pos;
		// tabla
		int tabla[] = {1,2,3,4,5,6,7,8,9,10};
		// pide al usuario el número clave
		System.out.println("Introduce el número a buscar: ");
		clave = sc.nextInt();
		// llama a la función de busqueda secuencial
		pos = buscar(tabla, clave);

		// devuelve un mensaje con la posición en caso que se encuentre, si da -1

		System.out.println((pos > -1 ? "El número se encuentra en: " + pos : "-1"));
		sc.close();
	}

	//función ecargada de buscar la palabra clave
	static int buscar(int t[], int clave) {
		// variable que actúa como indice actual de búsqueda
		int i = 0;
		// realiza una busqueda secuencial en la tabla
		while (i < t.length && clave != t[i]) {
			i++;
		}
		return (i < t.length) ? i : -1;
	}

}
