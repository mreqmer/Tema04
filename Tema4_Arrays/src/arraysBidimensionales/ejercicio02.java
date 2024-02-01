package arraysBidimensionales;

import java.util.Scanner;

public class ejercicio02 {
	static final int N_ALUM = 4;
	static final int N_NOTAS = 5;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// var
		// Tabla que recoge los alumnos y sus notas

		int notas[][] = new int[N_ALUM][N_NOTAS];
		String alumnos[] = new String[N_ALUM];

//		debug
//		String alumnos[] = {"A", "B", "C", "D"};
//		int notas[][] = {{1,2,3,4,5},{1,2,3,4,5},{1,2,3,4,5},{1,2,3,4,5}};

		// Almacena los valores de las tablas alumnos 1D y notas 2D
		for (int i = 0; i < notas.length; i++) {
			System.out.println("Alumno:  ");
			alumnos[i] = sc.nextLine();
			for (int j = 0; j < notas[0].length; j++) {
				System.out.println("Introduce la nota de la asignatura " + (j + 1));
				notas[i][j] = sc.nextInt();
			}
			sc.nextLine();
		}

		// Muestra los contenidos del array notas y aprovecha el array de salto de fila
		// para mostra la tabla de alumnos
		for (int i = 0; i < notas.length; i++) {
			System.out.print(alumnos[i] + "\t");
			for (int j = 0; j < notas[0].length; j++) {
				System.out.print(notas[i][j] + "\t");
			}
			System.out.println("");
		}

		
		
		//cierre
		sc.close();
	}

}
