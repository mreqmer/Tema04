package ejercicio01;

public class Main01 {

	public static void main(String[] args) {
		//tabla con elementos
		int tabla [] = {1,2,3,4,5,6,7,8,9,10};
		//guarda la suma de los elementos
		int suma;
		//función que suma elementos de una tabla
		suma = SumaArrays.sumaTabla(tabla);
		//mensaje
		System.out.println("La suma de las tabla es " + suma);
	}

}
