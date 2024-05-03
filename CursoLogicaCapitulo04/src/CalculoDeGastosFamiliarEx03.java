import java.util.Scanner;

public class CalculoDeGastosFamiliarEx03 {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		Double gastoTotalNoMes = 0.0;
		
		System.out.println("Valor da Conta de Luz: ");
		gastoTotalNoMes += scanner.nextDouble();
		
		
		System.out.println("Valor da Conta de Água: ");
		gastoTotalNoMes += scanner.nextDouble();
		
		System.out.println("Valor da Conta de Telefone: ");
		gastoTotalNoMes += scanner.nextDouble();
		
		System.out.println("Valor da Escola do Filho: ");
		gastoTotalNoMes += scanner.nextDouble();
			
		System.out.println("Valor da Fatura do Cartão: ");
		gastoTotalNoMes += scanner.nextDouble();
			
		System.out.println("Valor dos Gastos com Supermercado: ");
		gastoTotalNoMes += scanner.nextDouble();
		
		
		System.out.println("O valor gasto no mês é de: R$" + gastoTotalNoMes);
		
//		System.out.println("Valor da Conta de Luz: ");
//		Double valorDaContaDeLuz = scanner.nextDouble();
//		
//		System.out.println("Valor da Conta de Água: ");
//		Double valorDaContaDeAgua = scanner.nextDouble();
//		
//		System.out.println("Valor da Conta de Telefone: ");
//		Double valorDaContaDeTelefone = scanner.nextDouble();
//		
//		System.out.println("Valor da Escola do Filho: ");
//		Double valorDaEscolaDoFilho = scanner.nextDouble();
//		
//		System.out.println("Valor da Fatura do Cartão: ");
//		Double valorDaFaturaDoCartão = scanner.nextDouble();
//		
//		System.out.println("Valor dos Gastos com Supermercado: ");
//		Double valorDosGastosComSupermercado = scanner.nextDouble();
//		
//		Double gastoTotalNoMes = 0.0;
//		
//		gastoTotalNoMes = valorDaContaDeLuz;
//		gastoTotalNoMes += valorDaContaDeAgua;
//		gastoTotalNoMes += valorDaContaDeTelefone;
//		gastoTotalNoMes += valorDaEscolaDoFilho;
//		gastoTotalNoMes += valorDaFaturaDoCartão;
//		gastoTotalNoMes += valorDosGastosComSupermercado;
//		
//		System.out.println("O valor gasto no mês é de: R$" + gastoTotalNoMes);
		
		scanner.close();
	}
}
