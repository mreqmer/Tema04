package arrays_bidimensionales;

import java.util.Scanner;

public class ejercicio02 {
	// cantidad de alumnos
	static final int N_ALUM = 4;
	// cantidad de notas a contar
	static final int N_NOTAS = 5;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// var
		// Tabla que recoge las notas de alumnos
		int notas[][] = new int[N_ALUM][N_NOTAS];
		// Tabla que recoge los alumnos
		String alumnos[] = new String[N_ALUM];
		// guardará la nota mínima del alumno, se inicializa con el valor máximo de int
		int notaMinima = Integer.MAX_VALUE;
		// guardará la nota máxima del alumno, se inicializa con el valor mínimo de int
		int notaMaxima = Integer.MIN_VALUE;
		// guarda la media de las notas de un alumno
		int media = 0;


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
		
		System.out.println("");
		
		// vuelve a recorrer los arrays para calcular la nota mínima y máxima de cada
		// alumno
		for (int i = 0; i < notas.length; i++) {
			for (int j = 0; j < notas[0].length; j++) {
				// asigna las notas mínimas y máximas
				if (notas[i][j] < notaMinima) {
					notaMinima = notas[i][j];
				}
				if (notas[i][j] > notaMaxima) {
					notaMaxima = notas[i][j];
				}
				// va sumando las notas para luego calcular la media
				media += notas[i][j];
			}
			media = (int) media/N_NOTAS;
			System.out.print(
					alumnos[i] + ": nota mínima " + notaMinima + "; nota máxima " + notaMaxima + "; media " + media);
			System.out.println("");
			media = 0;
		}

		// cierre
		sc.close();
	}

}
