package lendoListaDeTarefasEx02;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class LeituraListaDeTarefasEx02 {
	public static void main(String[] args) throws IOException {
		Path arquivoLista = Paths.get("C:\\Users\\Iury Kozielski\\git\\repository\\CursoLogicaOrientadaAObjetos\\CursoLogicaCapitulo10\\tarefas.txt");
		
		List<String> listaDeTarefas = Files.readAllLines(arquivoLista);
		
		for(int i = 0; i < listaDeTarefas.size(); i++) {
			String tarefa = listaDeTarefas.get(i);
			
			System.out.println("Tarefa " + i + ": " + tarefa);
		}
	}
}
