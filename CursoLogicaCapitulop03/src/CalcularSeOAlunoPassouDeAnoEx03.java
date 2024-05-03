import java.util.Scanner;

public class CalcularSeOAlunoPassouDeAnoEx03 {
	
	static final Integer NOTA_MEDIA_PARA_PASSAR =70;
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Qual é seu nome: ");
		String aluno = scanner.nextLine();
		
		System.out.println("Qual é sua nota: ");
		Double nota = scanner.nextDouble();
		
		
		Boolean passouDeAno = nota>=NOTA_MEDIA_PARA_PASSAR;
		
		if(passouDeAno) {
			System.out.println("Parabens " + aluno + ". Você passou de ano!");
		}
		else {
			System.out.println("Não foi dessa vez " + aluno + ". Infelizmente você não passou de ano.");
		}
		
		
		/*
		Boolean resultado;
		
		if(nota >=70) { ------------------------- Eu fiz desse jeito na primeira vez e assim ^^ na segunda 
		
		resultado = true;
		
		} 	
		else {
			resultado = false;
			
			}
		
		System.out.println("O Aluno: " + aluno + " com a nota " + nota + " Passou de ano? " + resultado);*/
		
		scanner.close();
	}
	
	
}