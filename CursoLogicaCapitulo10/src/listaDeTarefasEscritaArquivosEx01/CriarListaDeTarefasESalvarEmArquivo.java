package listaDeTarefasEscritaArquivosEx01;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class CriarListaDeTarefasESalvarEmArquivo {

	public static void main(String[] args) throws IOException {
		ArrayList<String> listaDeTarefas = new ArrayList<String>();

		Scanner scanner = new Scanner(System.in);

		int i = 0;
		while (true) { // Deixei o true como condição do laço, pois, o que vai pará-lo é o fato do usuário digitar o "x" no console.
			System.out.print("Tarefa " + i + ": ");
			String tarefa = scanner.nextLine();
			
			if ("x".equals(tarefa)) {
				break; // Essa é a única maneira de parar esse laço.
			}

			listaDeTarefas.add(tarefa);
			i++;
		}

		Path arquivo = Paths.get(
				"C:\\Users\\Iury Kozielski\\git\\repository\\CursoLogicaOrientadaAObjetos\\CursoLogicaCapitulo10\\exercicio01.txt");

		Files.write(arquivo, listaDeTarefas);

		scanner.close();

	}

}
