import java.util.Scanner;

public class CriandoCalculadoraEx03 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		String[] operacoes = new String[] { "Adicao", "Subtracao", "Multiplicacao", "Divisao" };

		Double primeiroNumero = recebeNumeros(scanner);

		Integer operacaoEscolhidaPeloUsuario = imprimirESolicitarOperacaoAoUsuario(operacoes, scanner);

		verificaNumeroParaOperacaoValida(operacaoEscolhidaPeloUsuario);

		Double segundoNumero = recebeNumeros(scanner);

		Double resultado = fazAConta(primeiroNumero, operacaoEscolhidaPeloUsuario, segundoNumero);

		System.out.println("O resultado é: " + resultado);

		scanner.close();

	}

	static void verificaNumeroParaOperacaoValida(Integer operacaoEscolhidaPeloUsuario) {

		if ((operacaoEscolhidaPeloUsuario < 4) && (operacaoEscolhidaPeloUsuario > 0)) {
			// System.out.println("ok! Pode continuar");
		} else {
			System.out.println("Número de Operação inválido!");
			System.exit(1);
		}

	}

	static Double fazAConta(Double primeiroNumero, Integer operacaoEscolhidaPeloUsuario, Double segundoNumero) {

		Double resultado = 0.0;
		switch (operacaoEscolhidaPeloUsuario) {
		case 0:
			resultado = primeiroNumero + segundoNumero;
			break;

		case 1:
			resultado = primeiroNumero - segundoNumero;
			break;
			
		case 2:
			resultado = primeiroNumero * segundoNumero;
			break;
			
		case 3:
			resultado = primeiroNumero / segundoNumero;
			break;
		}

		return resultado;
	}

	static Double recebeNumeros(Scanner scanner) {

		System.out.println("Digite o número: ");
		Double numeroInformadoPeloUsuario = scanner.nextDouble();

		return numeroInformadoPeloUsuario;

	}

	static Integer imprimirESolicitarOperacaoAoUsuario(String[] operacoes, Scanner scanner) {

		System.out.println("Escolha uma operacao: ");
		for (int x = 0; x < operacoes.length; x++) {
			System.out.println("[" + x + "]" + operacoes[x]);
		}

		Integer recebeOperacao = scanner.nextInt();
		return recebeOperacao;

	}
}
