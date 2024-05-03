import java.util.Scanner;

public class Constantes {
	
	static final Integer IDADE_MINIMA_PARA_TIRAR_CARTEIRA = 18;
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Quantos anos ele tem? ");
		Integer idade = scanner.nextInt();
		
		//final Integer idadeMinimaParaTirarCarteira = 18;
		
		Boolean podeTirarCarteira = idade >= IDADE_MINIMA_PARA_TIRAR_CARTEIRA; //idadeMinimaParaTirarCarteira;
		
		if(podeTirarCarteira) {
			System.out.println("Sim, ele pode tirar carteira");
		}	else {
				System.out.println("Não, ele não pode tirar carteira");
			}
		
		scanner.close();
	}
}
