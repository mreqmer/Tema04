package arraysBidimensionales;

public class ejercicio04 {

	public static void main(String[] args) {
		
		//var 
		final int TABLAX = 10;
		final int TABLAY = 11;
		int factor1;
		int factor2;
		int resultado;
		String multiplicar[][] = new String [TABLAX][TABLAY];
		
		for(int y = 0;y<TABLAY; y++) {
			factor1=0;
			factor2=y+1;
			for(int x = 0;x<TABLAX; x++) {
				factor1++;
				resultado = factor1 * factor2;
				multiplicar[x][y] = factor1 + " * " + factor2 + " = " + resultado;
				System.out.print(multiplicar[x][y] + "\t");
				
			}
			System.out.println(" ");
		}

	}

}
