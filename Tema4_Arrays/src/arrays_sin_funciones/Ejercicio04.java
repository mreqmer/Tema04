package arrays_sin_funciones;

public class Ejercicio04 {

	public static void main(String[] args) {
		
		//var
		//tabla de longitud 12
		int tabla[] = new int [12];
		//asignación de elementos a la tabla
		tabla[0] = 39;
		tabla[1] = -2;
		tabla[4] = 0;
		tabla[6] = 14;
		tabla[8] = 5;
		tabla[9] = 120;
		
		//mostrar la tabla
		//los valores que no están rellenos salen con 0
		for(int valor:tabla) {
			System.out.print(valor+" ");
		}
		
	}

}
