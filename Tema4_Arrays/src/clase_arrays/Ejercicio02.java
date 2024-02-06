package clase_arrays;
import java.util.Arrays;

public class Ejercicio02 {

	static final int LONGITUD = 55;
	
	public static void main(String[] args) {
		//var
		//tabla de tamaño 54
		int tabla1[] = new int[LONGITUD];
		
		//indice al que se le tiene que asignar cada número
		int indiceInicial = 0;

		//rellena la tabla
		for(int i = 1; i <=LONGITUD; i++) {
			
			Arrays.fill(tabla1,indiceInicial, indiceInicial+i, i);
			indiceInicial +=i; 
		}
		
		//muestra la tabla
		System.out.println(Arrays.toString(tabla1));

	}

}

