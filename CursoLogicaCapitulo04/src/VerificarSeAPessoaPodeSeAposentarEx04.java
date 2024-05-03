import java.util.Scanner;

public class VerificarSeAPessoaPodeSeAposentarEx04 {
	
	static final Integer IDADE_PARA_APOSENTAR = 55;
	static final Integer TEMPO_MINIMO_DE_CONTRIBUICAO = 25;
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Qual a idade da pessoa? ");
		Integer idadePessoa = scanner.nextInt();
		
		System.out.println("Tempo contribuido? ");
		Integer tempoContribuido = scanner.nextInt();
		
		
		Boolean validaIdadePessoa = idadePessoa >= IDADE_PARA_APOSENTAR;
		Boolean validaTempoContribuido = tempoContribuido >= TEMPO_MINIMO_DE_CONTRIBUICAO;
		
		Boolean podeSeApostentar = validaIdadePessoa && validaTempoContribuido;
		
		if(podeSeApostentar) {
			System.out.println("A pessoa pode se aposentar!" );
		} else {
			System.out.println("A pessoa não pode se aposentar");
		}
		
		scanner.close();
	}
}
