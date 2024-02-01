package claseArrays;
import java.util.Arrays;

public class Ejercicio02 {

	public static void main(String[] args) {
		//var
		//tabla de tamaño 54
		int tabla1[] = new int[55];
		//indice al que se le tiene que asignar cada número
		int indiceInicial = 0;

		
		for(int i = 1; i <=10; i++) {
			
			Arrays.fill(tabla1,indiceInicial, indiceInicial+i, i);
			indiceInicial +=i; 
		}
		
		
		System.out.println(Arrays.toString(tabla1));

	}

}

