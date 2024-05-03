import java.util.Scanner;

public class VerificarSeAPessoaPassouNoConcursoPublicoEx01 {

	static final Double NOTA_MINIMA_TOTAL_PARA_PASSAR = 150.0;
	static final Double NOTA_MINIMA_DE_CADA_MATERIA_PARA_PASSAR = 60.0;

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Nota de Portugues: ");
		Double notaDePortugues = scanner.nextDouble();

		System.out.println("Nota de Matemática: ");
		Double notaDeMatematica = scanner.nextDouble();

		Double notaSoma = notaDePortugues + notaDeMatematica;
		Boolean passouPortugues = notaDePortugues > NOTA_MINIMA_DE_CADA_MATERIA_PARA_PASSAR;
		Boolean passouMatematica = notaDeMatematica > NOTA_MINIMA_DE_CADA_MATERIA_PARA_PASSAR;
		Boolean passouNoConcurso = notaSoma >= NOTA_MINIMA_TOTAL_PARA_PASSAR;

		if (passouPortugues && passouMatematica && passouNoConcurso) {
			System.out.println("Passou no concurso!");
		} else {
			System.out.println("Não passou no concurso! :( ");
		}

		scanner.close();
	}
}
