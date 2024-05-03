package metodoInstancia;

public class MetodoInstancia {

	public static void main(String[] args) {
		Cliente cliente = new Cliente();
		cliente.primeiroNome = "Alexandre";
		cliente.ultimoNome = "Afonso";
		cliente.telefone = "44000000";
		cliente.email = "alexandre.afonso@algawork.com";
		
		Cliente cliente2 = new Cliente();
		cliente2.primeiroNome = "Iury";
		cliente2.ultimoNome = "Kozielski";
		cliente2.telefone = "34000000";
		
		System.out.println("Nome do cliente: " + cliente.obterNomeCompleto() + ",DDD: " + cliente.obterDDD()); 
		System.out.println("Nome do cliente: " + cliente2.obterNomeCompleto() + ",DDD: " + cliente2.obterDDD()); 
	}
	
//	static String obterNomeComprletoCliente (Cliente cliente) {
//		String nomeCompleto = cliente.primeiroNome + " " + cliente.ultimoNome;
//		return nomeCompleto;
//	}
	
	

}
