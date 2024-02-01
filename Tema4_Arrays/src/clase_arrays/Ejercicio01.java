package clase_arrays;
import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// tabla
		int tabla1[];
		// longitude de la tabla
		int n;
		// número a rellenar en la tabla
		int m;

		System.out.println("Introduce la longitud de la tabla: ");
		n = sc.nextInt();
		System.out.println("Introduce el número para rellenar la tabla: ");
		m = sc.nextInt();
		
		//definimos la longitud de la tabla
		tabla1 = new int[n];
		//rellenamos la tabla
		Arrays.fill(tabla1, m);
		
		//mostramos la tabla
		System.out.println(Arrays.toString(tabla1));
		
		sc.close();
		

	}

}
