
public class EncontrarNumerosDivisiveisPor3UsandoWhileEx02 {
	
	static final Integer DIVISOR = 3;

	public static void main(String[] args) {
		
		Integer[] numeros = new Integer[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20 };
		
//		Integer numero = numeros.length;
		
		Integer i =0;
		
		while(i < numeros.length) {
			
			
			if(numeros[i] % DIVISOR == 0) {
				System.out.println("Esse numero: " + numeros[i] + " é divisivel por 3.");
			}
			
			i++;
			
		}

	}

}



