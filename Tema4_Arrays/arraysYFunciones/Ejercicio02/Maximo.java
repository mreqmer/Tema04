package Ejercicio02;

public class Maximo {

	static public int maximo (int t[]) {
		int maximo = Integer.MIN_VALUE;
		
		for(int indice : t) {
			if(indice>maximo) {
				maximo = indice;
			}
		}
		return maximo;
	}
}
