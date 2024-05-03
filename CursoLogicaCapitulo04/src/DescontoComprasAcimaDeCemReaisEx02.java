import java.util.Scanner;

public class DescontoComprasAcimaDeCemReaisEx02 {

	static final Integer VALOR_FRETE = 15;

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Qual o valor do Produto? ");
		Double valorDoProduto = scanner.nextDouble();

		Double valorFinalDaCompra = 0.0;

		if (valorDoProduto >= 100) {
			valorFinalDaCompra = valorDoProduto;
		} else {
			valorFinalDaCompra = valorDoProduto + VALOR_FRETE;
		}

		System.out.println("O valor final da compra é de R$" + valorFinalDaCompra);

		scanner.close();

	}
}
