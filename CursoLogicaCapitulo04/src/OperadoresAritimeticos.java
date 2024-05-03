
public class OperadoresAritimeticos {
	public static void main(String[] args) {
		
		Integer adicao = 1+1;
		System.out.println("Adicao: " + adicao);
		
		Integer subtracao = 1-1;
		System.out.println("Subtracao: " + subtracao);
		
		Integer multiplicacao = 2*2;
		System.out.println("Multiplicaão: " + multiplicacao);
		
		Integer divisao = 4/2;
		System.out.println("Divisão: " + divisao);
		
		Integer modulo = 7 % 4;
		System.out.println("Modulo: " + modulo);
		
		Integer precedencia01 = 1 + 1 * 5;
		System.out.println("Precedencia01: " + precedencia01);
		
		Integer precedencia02 = (1 + 1) * 5;
		System.out.println("Precedencia02: " + precedencia02);
		
		Integer precedencia03 =  5 * (1 + 1);
		System.out.println("Precedencia03: " + precedencia03);
		
		Integer precedencia04 =  5 * (1 + 1) + 2;
		System.out.println("Precedencia04: " + precedencia04);
		
		Integer precedencia05 =  5 * ((1 + 1) + 2);
		System.out.println("Precedencia05: " + precedencia05);
		
		
		Integer cinco = 5;
		Integer um = 1;
		
		Integer precedenciaComVariaveis = cinco * (um + um);
		
		System.out.println("Precedencia com variáveis: " + precedenciaComVariaveis);
	}
}
