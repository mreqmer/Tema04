package ejercicio06;

import java.util.Arrays;
import java.util.Scanner;

public class Main06 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//var
		//tabla 
		int tabla[] = {10, 1, 5, 8, 9, 2};
		//valores consecutivos a sumar
		int consecutivos;
		
		System.out.println("Valores consecutivos: ");
		consecutivos = sc.nextInt();
		
		
		
		System.out.println(Arrays.toString(suma(tabla, consecutivos)));
		sc.close();
		

	}
	//suma valores consecutivos de una tabla
	static int[] suma(int t[], int numElementos) {
		//iteraciones que tiene que hacer el bucle de sumas de números y longitud de la tabla donde se guardarán las usmas
		int total = 0;
		
		//tabla que tendrá los elementos sumados
		int tablaSuma[];
		//guarda temporalmente el valor de una suma de elementos de una tabla
		int suma = 0;
		
		//cálculo del total de elementos
		total = 6 - (numElementos -1);
		
		//terminamos de construir la tabla
		tablaSuma = new int[total];
		
		for (int i = 0; i<total ; i++) {
			for (int j = i; j<numElementos+i; j++) {
				suma += t[j];
			}
			tablaSuma[i] = suma;
			suma = 0;
		}
		
		return tablaSuma;
	}

}
