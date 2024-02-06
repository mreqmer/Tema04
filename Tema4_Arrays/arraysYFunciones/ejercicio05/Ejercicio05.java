package ejercicio05;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio05 {
	static final int LONGITUD = 20;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// var
		// numero que se buscará en el array
		int clave;
		// tabla
		int tabla[] = { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2 };

		// preguntamos por el valor a buscar
		System.out.println("Indica el valor a buscar:");
		clave = sc.nextInt();

		System.out.println(Arrays.toString(buscarTodos(tabla, clave)));
		
		sc.close();
	}

	// busca en una tabla unos valores y añade el índice de estos en otra tabla
	static int[] buscarTodos(int t[], int valor) {
		// nueva tabla donde se guarda los indices de los números
		int tablaIndice[];
		// indica el indice de la nueva tabla
		int indiceNuevaT = 0;
		// cuenta lo que será la longitud de la tabla
		int contador = 0;

		// cuenta cuántas veces aparece el valor en la tabla
		for (int i = 0; i < t.length; i++) {
			if (t[i] == valor) {
				contador++;
			}
		}
		//inicializa la tabla
		tablaIndice = new int[contador];
		// si ha encontrado algún valor asigna valores a esta
		if (contador > 0) {
			// recore la tabla introducida por parámetro y si encuentra el introduce el
			// indice donde se encuentra en la tbala
			for (int i = 0; i < t.length; i++) {
				if (t[i] == valor) {
					tablaIndice[indiceNuevaT] = i;
					indiceNuevaT++;
				}
			}
		}
		return tablaIndice;
	}

}
