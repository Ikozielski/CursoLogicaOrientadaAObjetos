import java.util.Scanner;

public class UtilizandoIfEncadeado {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Digite o peso: ");
		Double peso = scanner.nextDouble();

//			Boolean pesoLeve = peso <= 60;
////		Boolean pesoMedio = (peso > 60) && (peso <= 90);
////		Boolean pesoPesado = peso > 90;
//
//		if (pesoLeve) {
//			System.out.println("O lutador é peso leve");
//		} else {
//			Boolean pesoMedio = (peso > 60) && (peso <= 90);
//			if (pesoMedio) {
//				System.out.println("O lutador é peso Médio");
//			} else {
//				Boolean pesoPesado = peso > 90;
//				if (pesoPesado) {
//					System.out.println("O lutador é peso Pesado");
//				}
//			}
//
//		}

		Boolean pesoLeve = (peso <= 60) && (peso > 0);
		Boolean pesoMedio = (peso > 60) && (peso <= 90);
		Boolean pesoPesado = peso > 90;
		
		if(pesoLeve) {
			System.out.println("O lutador é peso leve");
		} else if(pesoMedio) {
			System.out.println("O lutador é peso Médio");
		} else if(pesoPesado) {
			System.out.println("O lutador é peso Pesado");
		} else {
			System.out.println("O lutador não se encaixa em categoria alguma.");
		}
		

		scanner.close();
	}
}
