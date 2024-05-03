import java.util.Scanner;

public class CalculadoraSimplesEx01 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Primeiro Número: ");
		Double primeiroNumero = scanner.nextDouble();

		System.out.println("Qual operação deseja realizar? [1 = Adição, 2 = Subtração, 3 = Multiplicação, 4 = Divisão]");
		Integer operacao = scanner.nextInt();

		System.out.print("Segundo Número: ");
		Double segundoNumero = scanner.nextDouble();

		Double total = 0.0;

		Boolean soma = operacao.equals(1);
		Boolean sub = operacao.equals(2);
		Boolean multiplicacao = operacao.equals(3);
		Boolean divisao = operacao.equals(4);

		if (soma) {
			total = primeiroNumero + segundoNumero;
		} else {
			if (sub) {
				total = primeiroNumero - segundoNumero;
			} else {
				if (multiplicacao) {
					total = primeiroNumero * segundoNumero;
				} else {
					if (divisao) {
						total = primeiroNumero / segundoNumero;
					}

				}
			}
		}

		System.out.println("O resultado é: " + total);

		scanner.close();
	}
}