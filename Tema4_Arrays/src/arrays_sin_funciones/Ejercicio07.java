package arrays_sin_funciones;

import java.util.Scanner;

public class Ejercicio07 {

	static final int MESES = 12;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// var
		// meses
		String meses[] = { "Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre",
				"Octubre", "Noviembre", "Diciembre" };
		// tabla que guarda las temperaturas del año
		int regTemperatura[] = new int[MESES];
		
		// encargado de guardar la temperatura correspondiente al año actual
		for (int i = 0; i < regTemperatura.length; i++) {
			System.out.println("Temperatura de " + meses[i] + ": ");
			regTemperatura[i] = sc.nextInt();
		}

		// pinta el gráfico de temperaturas
		for (int i = 0; i < regTemperatura.length; i++) {
			// da formato añadiendo más o menos tabs
			if (i == 8 || i == 10 || i == 11) {
				System.out.print(meses[i] + "\t|");
			} else {
				System.out.print(meses[i] + "\t\t|");
			}
			// encargado de poner los asteriscos de temperatura tras cada mes
			for (int j = 0; j < regTemperatura[i]; j++) {
				System.out.print("*");
			}
			System.out.println("");
		}
		
		sc.close();

	}

}
