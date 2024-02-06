package arrays_bidimensionales;

public class ejercicio04 {

	static final int TABLAX = 10;
	static final int TABLAY = 10;

	public static void main(String[] args) {

		// var
		// guarda el primer número a multiplicar de la tabla
		int factor1;
		// guarda el segundo número a multiplicar d ela tabla
		int factor2;
		// guarda el resultado de multiplicar los dos números
		int resultado;
		// tabla donde se guardará la tabla de multiplicar
		String multiplicar[][] = new String[TABLAX][TABLAY];

		// controla las filas de la tabla
		for (int i = 0; i < multiplicar.length; i++) {
			// el primer número que se muestra es el correspondiente a la tabla de
			// multiplicar, que es el mismo en su columna, por lo que se inicia en 0 siempre
			factor1 = 0;
			//el segundo número por el que se multiplicará el primero, que debe cambiar cada vez que aumenta i
			factor2 = i + 1;
			//controla las columnas de la tabla
			for (int j = 0; j < multiplicar[0].length; j++) {
				//va sumando 1 cada vez que avanza las columnas
				factor1++;
				
				resultado = factor1 * factor2;
				//muestra la tabla de multiplicar
				multiplicar[i][j] = factor1 + " * " + factor2 + " = " + resultado;
				System.out.print(multiplicar[i][j] + "\t");

			}
			System.out.println(" ");
		}

	}

}
