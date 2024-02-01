package claseArrays;

import java.util.Arrays;

public class Ejercicio04 {

	public static void main(String[] args) {

		double tabla[] = new double[30];
		
		for(int i = 0; i<tabla.length; i++) {
			tabla[i] = (int) 1+Math.random()*10;
		}
		Arrays.sort(tabla);
		
		System.out.println(Arrays.toString(tabla));
	}

}
