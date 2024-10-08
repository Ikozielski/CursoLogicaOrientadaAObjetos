public class ListaAlunos {
	static final int QUANTIDADE_LISTA = 5;
	
	Aluno[] lista = new Aluno[QUANTIDADE_LISTA];
	
	int tamanhoLista = 0;
	
	Aluno obter(int indice) {
		return lista[indice];
	}
	
	int tamanho(){
		return tamanhoLista;
	}
	
	void adicionar(Aluno aluno) {
		if(tamanhoLista == lista.length) {
			Aluno[] novaLista = new Aluno[QUANTIDADE_LISTA + lista.length];
			
			for(int i = 0; i < lista.length; i++) {
				novaLista[i] = lista[i];
			}
			lista = novaLista;
		}

		lista[tamanhoLista] = aluno;
		tamanhoLista++;
	}
	
	void remover(Aluno aluno) {
		for(int i = 0; i < tamanhoLista; i++) {
			Aluno a = lista[i];
			
			if(a !=null && a.equals(aluno)) {
				remover(i);
				break;
			}else if(a == null && aluno == null) {
				remover(i);
				break;
			}
		}
	}
	
	void remover(int indice) {
		int indiceInicial = indice + 1;
		
		for(int i = indiceInicial; i < tamanhoLista; i++) {
			lista[i -1] = lista[i];
		}
		
		tamanhoLista--;
		lista[tamanhoLista] = null;
	}
	
	void ordenar(){
		for(int i = 1; i < tamanhoLista; i++) {
			Aluno alunoPosicaoBase = lista[i];
			int indicePosicaoBase = i;
			
			while(indicePosicaoBase > 0) {
				int indicePosicaoAnterior = indicePosicaoBase -1;
				Aluno alunoPosicaoAnterio = lista[indicePosicaoAnterior];
				
				Boolean alunoPosicaoAnteriorVemDepoisDe = alunoPosicaoAnterio == null || alunoPosicaoAnterio.vemDepoisDe(alunoPosicaoBase);
				if(alunoPosicaoAnteriorVemDepoisDe) {
					lista[indicePosicaoBase] = lista[indicePosicaoAnterior];
					
					indicePosicaoBase--;
				}else {
					break;
				}
			}
			
			lista[indicePosicaoBase] = alunoPosicaoBase;
		}
	}
	
	public static void main(String[] args) {
		String nome1 = "Douglas";
		String nome2 = "Carlos";
		System.out.println(nome1.compareTo(nome2));
	}
}
