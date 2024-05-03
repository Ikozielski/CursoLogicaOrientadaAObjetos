import java.util.Scanner;

public class RetornandoValores {

	public static void main(String[] args) {
//		Integer numeroQualquer = numeroAleatorio();
//		System.out.println(numeroQualquer);
//		
//	}
//	
//	static Integer numeroAleatorio() {
//		Integer numero = 1;
//		return numero;
//	}

//		Double[] premissaInicial = new Double[] { 725.0, 100.00 };
//		Double proporcao = 20.0;
//
//		Double resultadoFinal = regraDeTres(premissaInicial, proporcao);
//
//		System.out.println("Resultado: " + resultadoFinal);
//	}
//
//	static Double regraDeTres(Double[] premissa, Double proporcao) {
//
//		Double resultado = (premissa[0] * proporcao) / premissa[1];
//		return resultado;
//	}


		Scanner scanner = new Scanner(System.in);

		imprimirTraco();

		String[] cursos = new String[] { "Java EE", "Spring", "Java OO Avançado" };

		imprimir("Escolha dentre os cursos abaixo: ");

		iterarEExibirPosicoesDoVetorString(cursos);

		Integer posicaoCursoEscolhido = receberNumeroInteiroDoUsuario("O curso que você deseja é o: ", scanner);

		Boolean posicaoValida = verificarPosicaoEscolhidaPeloUsuario(posicaoCursoEscolhido, cursos); //posicaoCursoEscolhido >= 0 && posicaoCursoEscolhido < cursos.length;

		encerrarProgramaPorCausaDaPosicaoInvalida(posicaoValida);

		imprimirTraco();

		String[] formasPagamento = new String[] { "Cartão", "Boleto" };

		imprimir("Escolha dentre as formas de pagamento abaixo: ");

		iterarEExibirPosicoesDoVetorString(formasPagamento);

		Integer posicaoFormaPagamentoEscolhida = receberNumeroInteiroDoUsuario("A forma de pagamento que você deseja é o: ", scanner);

		posicaoValida = verificarPosicaoEscolhidaPeloUsuario(posicaoFormaPagamentoEscolhida, formasPagamento); //posicaoFormaPagamentoEscolhida >= 0 && posicaoFormaPagamentoEscolhida < formasPagamento.length;

		encerrarProgramaPorCausaDaPosicaoInvalida(posicaoValida);

		String cursoEscolhido = cursos[posicaoCursoEscolhido];
		String formaPagamentoEscolhida = formasPagamento[posicaoFormaPagamentoEscolhida];

		imprimirTraco();

		imprimir("O curso escolhido foi " + cursoEscolhido + " e a forma de pagamento é " + formaPagamentoEscolhida);

		scanner.close();
	}
	
	static Integer receberNumeroInteiroDoUsuario(String texto, Scanner scanner) {
		imprimirEContinuarNaMesmaLinha(texto);
		Integer numero = scanner.nextInt();
		
		return numero;
	}
	
	static Boolean verificarPosicaoEscolhidaPeloUsuario(Integer posicao, String[] vetor) {
		Boolean valida = posicao >= 0 && posicao < vetor.length;
		return valida;
	}
	
	static void imprimir(String texto) {
		System.out.println(texto);
	}
	
	static void imprimirEContinuarNaMesmaLinha(String texto) {
		System.out.print(texto);
	}

	static void imprimirTraco() {
		imprimir("----------------------------------------------");
	}

	static void encerrarProgramaPorCausaDaPosicaoInvalida(Boolean posicaoValida) {

		if (!posicaoValida) {
			imprimir("Posição inválida!");
			System.exit(1);
		}
	}

	static void iterarEExibirPosicoesDoVetorString(String[] vetor) {
		for (int i = 0; i < vetor.length; i++) {
			imprimir("[" + i + "] " + vetor[i]);
		}
	}

}
