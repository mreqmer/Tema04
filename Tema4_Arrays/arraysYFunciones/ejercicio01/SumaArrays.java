package ejercicio01;

public class SumaArrays {
	
	//suma elementos de una tabla
	static int sumaTabla (int t[]) {
		int suma = 0;
		//recorre un array sumando sus elementos
		for(int indice : t) {
			suma+=indice;
		}
		return suma;
	}
}
