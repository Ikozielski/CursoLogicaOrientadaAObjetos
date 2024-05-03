import java.util.Scanner;
public class CalcularIMC {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Digite o Peso: ");
		Double peso = scanner.nextDouble();
		
		System.out.print("Digite a Altura: ");
		Double altura = scanner.nextDouble();
		
		Double imc;
		
		imc = peso / (altura*altura);
		
		System.out.println("Seu imc é: " + imc);
		
		scanner.close();
		
	}
}
