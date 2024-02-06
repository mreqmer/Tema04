package Ejercicio02;

public class Main02 {

	public static void main(String[] args) {
		// tabla con elementos
		int tabla[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		// guarda un número de una función
		int maximo;
		// llama a la función que busca el número máximo de un array
		maximo = Maximo.maximo(tabla);
		//muestra el resultado por pantalla
		System.out.println("El máximo es: " + maximo);

	}

}
