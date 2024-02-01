package arraysSinFunciones;

import java.util.Scanner;

public class Ejercicio02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// Var
		//guarda el numero asignado por el usuario
		double numero;
		//tabla de 5 elementos
		double tablaCinco[] = new double[5];
		//recorre la tabla asignandole los números que introduce el usuario
		for(int i=0; i<tablaCinco.length; i++) {
			System.out.println("Introduce un numero:");
			numero = sc.nextInt();
			tablaCinco[i] = numero;
		}
		//recorre la tabla para mostrar sus elementos
		
		for (double posicion : tablaCinco) {
			System.out.println(posicion);
		}
		
	
		
		sc.close();
		
	}

}
