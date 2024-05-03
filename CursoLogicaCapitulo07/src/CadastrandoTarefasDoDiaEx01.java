import java.util.Scanner;

public class CadastrandoTarefasDoDiaEx01 {

	public static void main(String[] args) {
		
		String[] listaDeTarefas = new String[5];
		
		Scanner scanner = new Scanner(System.in);
		
		for(int i = 0; i < listaDeTarefas.length; i++) {
			
			System.out.print("Digite uma nova tarefa para a sua lista: ");
			 String tarefa = scanner.nextLine();
			 
			 listaDeTarefas[i] = tarefa;
			  
		}
		
		System.out.println("Suas tarefas são: ");
		for (int x=0; x < listaDeTarefas.length; x++) {
			System.out.println("[" + x + "] " + listaDeTarefas[x]);
		}
		
		scanner.close();
		

	}

}
