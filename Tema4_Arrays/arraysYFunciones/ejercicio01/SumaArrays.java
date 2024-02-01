package ejercicio01;

public class SumaArrays {

	static int sumaTabla (int t[]) {
		int suma = 0;
		for(int indice : t) {
			suma+=indice;
		}
		return suma;
	}
}
