package arrays_sin_funciones;

import java.util.Random;

public class Ejercicio01 {

	public static void main(String[] args) {

		Random rand = new Random();

		// var
		// tabla de longitud 10
		int tabla[] = new int[10];

		// recorre la tabla y asigna números aleatorios a cada elemento
		for (int i = 0; i < tabla.length; i++) {
			tabla[i] = rand.nextInt(1, 101);
			System.out.print(tabla[i] + " ");
			
		}
	}

}
