package metodoQueInformaNecessidadeDeReporEstoque;

public class Produto {
	
	static final Integer QUANTIDADE_MINIMA_DO_PRODUTO = 10;
	
	String nome;
	Integer quantidadeEmEstoque;
	
	
	 Boolean verificaQuantidadeDoProdutoNoEstoque() {

		if (quantidadeEmEstoque < Produto.QUANTIDADE_MINIMA_DO_PRODUTO) {

			return true;
		}

		return false;

	}
}


