package escritaArquivos;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class EscritaArquivos {

	public static void main(String[] args) throws IOException {
		ArrayList<String> linhas = new ArrayList<String>();

		Scanner scanner = new Scanner(System.in);

		for (int i = 0; i < 5; i++) {
			System.out.print("Jogador " + i + ": ");
			
			String nome = scanner.nextLine();
			
			linhas.add(nome);
		}
		// linhas.add("Linha um");

		Path arquivo = Paths.get(
				"C:\\Users\\Iury Kozielski\\git\\repository\\CursoLogicaOrientadaAObjetos\\CursoLogicaCapitulo10\\arquivo.txt");

		Files.write(arquivo, linhas);

		scanner.close();

		System.out.println("Fim");
	}

}
