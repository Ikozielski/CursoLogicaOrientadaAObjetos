import java.util.Scanner;

public class ImprimaDiaDaSemanaEx03 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Digite o Dia da semana: ");
		Integer diaDaSemana = scanner.nextInt();
//		
//		switch(diaDaSemana) {
//		case 1:
//			System.out.println("Domingo.");
//			break;
//		case 2:
//			System.out.println("Segunda-Feira.");
//			break;
//		case 3:
//			System.out.println("Terça-Feira.");
//			break;
//		case 4:
//			System.out.println("Quarta-Feira.");
//			break;
//		case 5:
//			System.out.println("Quinta-Feira.");
//			break;
//		case 6: 
//			System.out.println("Sexta-Feira.");
//			break;
//		case 7: 	
//			System.out.println("Sábado.");
//			break;
//			
//		default: 
//			System.err.println("Digite um dia válido");
//			System.exit(1);
//		}		

		String dia;

		switch (diaDaSemana) {
		case 1:
			dia = "Domingo";
			break;
		case 2:
			dia = "Segunda-Feira";
			break;
		case 3:
			dia = "Terça-Feira";
			break;
		case 4:
			dia = "Quarta-Feira";
			break;
		case 5:
			dia = "Quinta-Feira";
			break;
		case 6:
			dia = "Sexta-Feira";
			break;
		case 7:
			dia = "Sábado";
			break;
		default:
			dia = "INVÁLIDO";
		}

		System.out.println("O dia escolhido foi: " + dia);

		scanner.close();

	}
}
