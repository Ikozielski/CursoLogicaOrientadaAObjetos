
public class OperadoresLogicos {
	public static void main(String[] args) {
		Boolean carrinhoMaiorQue100 = false;
		Boolean periodoDePromocao = true;
		Boolean jaFezCompraNaLoja = false; 
		Boolean pagamentoAVista = true;
		
		
//		Boolean aplicarDesconto = carrinhoMaiorQue100 && periodoDePromocao;

//		Boolean aplicarDesconto = carrinhoMaiorQue100 || periodoDePromocao;
		
//		Boolean aplicarDesconto = periodoDePromocao && carrinhoMaiorQue100 && jaFezCompraNaLoja;
		
//		Boolean aplicarDesconto = periodoDePromocao || carrinhoMaiorQue100 || jaFezCompraNaLoja;

		Boolean aplicarDesconto = periodoDePromocao && (carrinhoMaiorQue100 || jaFezCompraNaLoja) && pagamentoAVista;
		

		if (aplicarDesconto) {
			System.out.println("Desconto aplicado");
		} else {
			System.out.println("Não aplicar o desconto");
		}

	}
}
