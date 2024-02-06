package clase_arrays;

import java.util.Scanner;

public class Ejercicio06 {

	static final int LONGITUD = 1000;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// var
		// tabla
		int[] tabla = new int[LONGITUD];
		// número a buscar en el array
		int buscaNum;
		// número d eveces que aparece un número
		int contNum = 0;
		// ayudará a mostrar mensajes si existe el número a mostar
		boolean existe = false;

		// bucle para asignar valores aleatorios a la tabla
		for (int i = 0; i < tabla.length; i++) {
			tabla[i] = (int) (Math.random() * 100);

		}

		// pregunta por el número a buscar
		System.out.println("¿Qué número quieres encontrar en la tabla?");
		buscaNum = sc.nextInt();

		// recorre el array para mostrar donde aparecen los números
		for (int i = 0; i < tabla.length; i++) {
			if (tabla[i] == buscaNum) {
				if (existe == false) {
					System.out.print(buscaNum + " aparece en: ");
				}
				System.out.print(i + " ");
				contNum++;
				existe = true;
			}
		}
		System.out.println("");
		System.out.println((contNum > 0) ? "El número aparece " + contNum + " veces." : "El número no aparece.");

		sc.close();
	}

}
