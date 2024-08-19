package BibliotecaPropria;

import console.Interacao;

public class BibliotecaPropria {
	public static void main(String[] args) {
		Interacao interacao = new Interacao();
		
		Integer numero = interacao.lerNumero("Digite um numero: ");
		interacao.imprimir("Número: " + numero);
		
		
		Double decimal = interacao.lerDecimal("Digite um numero deciamal: ");
		interacao.imprimir("Número Decimal: " + decimal);
		
		interacao.eroo("Essa é uma mensagem de erro!");
		
		interacao.fechar();
	}
}
