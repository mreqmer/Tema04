package arrays_bidimensionales;

public class ejercicio07 {

	public static void main(String[] args) {
		//var
		//tabla que luego se le hará una transposición
		int tablaNormal[][]=new int[4][4];
		//un contador para ir asignando un número a la tabla
		int numero = 0;
		
		//rellena la tabla
		for(int i = 0; i<tablaNormal.length; i++) {
			for(int j = 0; j<tablaNormal[0].length; j++) {
				//suma +1 al número que se muestra en esa casilla de la tabla
				numero++;
				tablaNormal[i][j] = numero;
				//muestra la tabla
				System.out.print(tablaNormal[i][j] + "\t");
			}
			System.out.println();
		}
		
		System.out.println();
		//llama a la función que le hace transposición de una tabla
		transposicion(tablaNormal);
	}
	//función que hace transposición a una tabla
	static void transposicion (int tabla[][]) {
		//recorre la tabla, pero desde sus columnas
		for(int j = 0; j<tabla.length; j++) {
			for(int i = 0; i<tabla[0].length; i++) {
				System.out.print(tabla[i][j] + "\t");
			}
			System.out.println();
		}
	}

}
