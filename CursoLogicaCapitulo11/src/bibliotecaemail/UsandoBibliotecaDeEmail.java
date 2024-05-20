package bibliotecaemail;

import org.apache.commons.mail.EmailException;

public class UsandoBibliotecaDeEmail {
	public static void main(String[] args) throws EmailException {
		
		Carteiro.enviar("iurykozielski9@gmail.com", "Deu bom", "Aula sobre biblioteca de terceiros");
		
		
		System.out.println("Fim");
	}
}
