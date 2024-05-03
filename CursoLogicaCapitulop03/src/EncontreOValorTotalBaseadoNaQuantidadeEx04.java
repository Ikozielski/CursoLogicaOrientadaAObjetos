import java.util.Scanner;

public class EncontreOValorTotalBaseadoNaQuantidadeEx04 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Digite o valor do produto: ");
		Double valorProduto = scanner.nextDouble();
		
		System.out.print("Digite a Quantidade de produtos: ");
		Integer quantidadeProduto = scanner.nextInt();
		
		Double subtotal = valorProduto * quantidadeProduto;
		
		Double porcentagemDesconto = 0.0;
		
		// poderia usar Boolean quantidadeMaiorQue10 = quantidadeProduto >=10, e apssar isso de parametro no if
		
		if(quantidadeProduto>=10) {
			porcentagemDesconto=10.0;
		}
		
		Double valorDesconto = valorProduto * porcentagemDesconto/100;
		
		Double valorTotal = subtotal - valorDesconto;
		
		
		
		
		System.out.println("O valor total com desconto é: R$" + valorTotal);
		
		scanner.close();
	}
}
