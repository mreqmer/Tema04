package arraysSinFunciones;

import java.util.Scanner;

public class Ejercicio07 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// var
		// recoge la temperatura que se guarda en la tabla
		int numTemperatura;
		// meses del año de forma numerica
		int mes = 0;
		// meses escritos
		String mesEscrito;
		// tabla que guarda las temperaturas del año
		int regTemperatura[] = new int[12];

		// bucle encargador de guardar la temperatura correspondiente al año actual
		for (int i = 0; i < regTemperatura.length; i++) {
			mes++;
			// muestra el mes según la posición actual del bucle
			mesEscrito = mostrarMes(mes);

			System.out.println("Temperatura de " + mesEscrito + ": ");
			numTemperatura = sc.nextInt();
			regTemperatura[i] = numTemperatura;
		}
		//vuelve a igualar el mes a 0 ya que lo necesitaremos reiniciado en un futuro
		mes = 0;
		// bucle que pinta el diagrama de barras
		
		for(int posicionMes : regTemperatura) {
			mes++;
			mesEscrito = mostrarMes(mes);
			System.out.print(mesEscrito + "\t|");
			//bucle encargado de poner los asteriscos de temperatura tras cada mes
			for (int j = 0; j < posicionMes; j++) {
				System.out.print("*");
			}
			System.out.println("");
		}
		
		sc.close();

	}
	//funcion para guardar pasar el valor numerico del mes a imprimirlo escrito
	static String mostrarMes(int mesNumerico) {

		String mesEscrito = switch (mesNumerico) {
		case 1 -> "en";
		case 2 -> "feb";
		case 3 -> "mar";
		case 4 -> "abr";
		case 5 -> "may";
		case 6 -> "jun";
		case 7 -> "jul";
		case 8 -> "ago";
		case 9 -> "sept";
		case 10 -> "oct";
		case 11 -> "nov";
		default -> "dic";
		};

		return mesEscrito;
	}

}
