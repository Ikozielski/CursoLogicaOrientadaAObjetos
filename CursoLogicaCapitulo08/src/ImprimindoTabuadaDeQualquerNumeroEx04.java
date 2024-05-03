import java.util.Scanner;

public class ImprimindoTabuadaDeQualquerNumeroEx04 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		imprimirTabuada(scanner);
		
		scanner.close();

	}
		
	static void imprimirTabuada(Scanner scanner) {
		
		Integer[] multiplicador = new Integer [] {0,1,2,3,4,5,6,7,8,9,10};
		System.out.print("Digite o número que você deseje ver a tabuada: ");
		
		
		Integer multiplicando = scanner.nextInt();
		
		imprimirTabuada(multiplicando, multiplicador, 0);
		
		
	}
	
	static void imprimirTabuada(Integer multiplicando, Integer[] multiplicadores, Integer x) {
		
		
		if( x < multiplicadores.length) {
			
			Integer multiplicador = multiplicadores[x];
			
			Integer resultado =  multiplicando * multiplicador;
			
			System.out.println(multiplicando + "x" + multiplicador + "=" + resultado);
			
			imprimirTabuada(multiplicando, multiplicadores, ++x);
		  
			
			
		//	System.out.println("Teste");
		}
		
		
		
		
		
		
	}

}
