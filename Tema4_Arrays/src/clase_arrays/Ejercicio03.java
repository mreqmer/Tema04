package clase_arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio03 {

	static final int LONGITUD = 10;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// var
		// tabla1

		 int[] tabla1 = new int[LONGITUD];
		 int[] tabla2 = new int[LONGITUD];

		//pide al usuario números para rellenar la tabla1
		for(int i= 0; i<tabla1.length; i++) {
			System.out.println("Introduce un número para la tabla 1: ");
			tabla1[i] = sc.nextInt();
		}
		//pide al usuario números para rellenar la tabla1
		for(int i= 0; i<tabla1.length; i++) {
			System.out.println("Introduce un número para la tabla 2: ");
			tabla2[i] = sc.nextInt();
		}

		System.out.println(Arrays.compare(tabla1, tabla2) == 0 ? "Son iguales." : "No son iguales.");

		sc.close();
	}

}
