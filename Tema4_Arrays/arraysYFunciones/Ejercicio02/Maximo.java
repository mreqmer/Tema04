package Ejercicio02;

public class Maximo {
	// busca en un array el número máximo de este
	static public int maximo(int t[]) {
		// guarda el número máx alto, se inicializa en el valor mínimo de un integer
		int maximo = Integer.MIN_VALUE;
			
		//recorre el array buscando el valor máximo
		for (int indice : t) {
			if (indice > maximo) {
				maximo = indice;
			}
		}
		return maximo;
	}
}
