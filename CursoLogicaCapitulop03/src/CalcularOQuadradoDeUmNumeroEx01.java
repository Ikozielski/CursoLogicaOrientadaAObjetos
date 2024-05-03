import java.util.Scanner;

public class CalcularOQuadradoDeUmNumeroEx01 {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite o valor  para calcular o quadrado: ");
		Double numero = scanner.nextDouble();
		
		Double quadrado = numero*numero;
		
		System.out.println("O Quadrado de " + numero + " é: " + quadrado);
		
		scanner.close();
		
	}
	
}
