
public class TipoLogico {

	public static void main(String[] args) {
		
		Boolean variavelVerdadeira = true;
		System.out.println("Variavel verdadeira: " + variavelVerdadeira);
		
		Boolean variavelFalsa = false;
		System.out.println("Variavel falsa: " + variavelFalsa);
		
		System.out.println("---------------------------");
		
		
		Integer idade = 20;
		
		Boolean podeTirarCarteira = idade >= 18;
		
		
		//System.out.println("Pode tirar carteira? " + podeTirarCarteira);
		
		
		if(podeTirarCarteira) {
			System.out.println("Sim, ele pode tirar carteira");
		}	else {
				System.out.println("Não, ele não pode tirar carteira");
			}
		
		
		
	}
}
