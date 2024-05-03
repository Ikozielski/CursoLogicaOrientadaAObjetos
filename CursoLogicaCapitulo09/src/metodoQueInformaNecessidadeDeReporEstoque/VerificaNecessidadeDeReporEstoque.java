package metodoQueInformaNecessidadeDeReporEstoque;

public class VerificaNecessidadeDeReporEstoque {

	public static void main(String[] args) {
		Produto produto = new Produto();
		produto.nome = "Marmita";
		produto.quantidadeEmEstoque = 19;

		System.out.println("Necessário repor estoque do produto " + produto.nome + "? " + produto.verificaQuantidadeDoProdutoNoEstoque());

	}

	

//	static Boolean verificaQuantidadeDoProdutoNoEstoque(Produto produto) {
//
//		if (produto.quantidadeEmEstoque < QUANTIDADE_MINIMA_DO_PRODUTO) {
//
//			return true;
//		}
//
//		return false;
//
//	}

}
