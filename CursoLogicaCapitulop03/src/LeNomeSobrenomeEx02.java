import java.util.Scanner;

public class LeNomeSobrenomeEx02 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite o seu nome: ");
		
		String nome = scanner.nextLine();
		
		System.out.println("Digite seu sobrenome: ");
		
		String sobreNome = scanner.nextLine();
		
		System.out.println("Seu nome completo é: " + nome + " " + sobreNome);
		
		scanner.close();
		
	}
	
}
