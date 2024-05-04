package Encapsulamento;

public class Cliente {

	//String nome;
	String primeiroNome;
	String ultimoNome;
	String telefone;
	
	String getNome() {
		return primeiroNome + " " + ultimoNome;
	}
	
	void setNome(String nome) {
		String[] nomeCompleto = nome.split(" ");
		primeiroNome = nomeCompleto[0];
		ultimoNome = nomeCompleto[1];
	}
	
	String getTelefone() {
		return telefone;
	}
	
	void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	
	String getPrimeiroNome() {
		return primeiroNome;
	}
	
	void setPrimeiroNome(String primeiroNome) {
		this.primeiroNome = primeiroNome;
	}
	
	String getUltimoNome() {
		return ultimoNome;
	}
	
	void getUltimoNome(String ultimoNome) {
		this.ultimoNome = ultimoNome;
	}
	
	
	
	
}
