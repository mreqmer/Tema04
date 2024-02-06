package clase_arrays;

import java.util.Arrays;

public class Ejercicio04 {
	
	static final int LONGITUD = 30;

	public static void main(String[] args) {
		//int
		//creacion de una tabla
		int tabla[] = new int[LONGITUD];
		
		//rellena el array de valores aleatorios
		for(int i = 0; i<tabla.length; i++) {
			tabla[i] =(int)( 1+Math.random()*10);
		}
		//ordena la tabla
		Arrays.sort(tabla);
		//muestra la tabla
		System.out.println(Arrays.toString(tabla));
	}

}
