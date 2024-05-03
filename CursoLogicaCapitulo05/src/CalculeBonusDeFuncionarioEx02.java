import java.util.Scanner;

public class CalculeBonusDeFuncionarioEx02 {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Meta de faturamento anual da empresa: ");
		Double metaDeFaturamentoAnualDaEmpresa = scanner.nextDouble();
		
		System.out.println("Faturamento real da Empresa no ultimo ano: ");
		Double faturamentoRealDaEmpresaNoUltimoAno = scanner.nextDouble();
		
		System.out.println("Média salarial do Funcionário: ");
		Double mediaSalariaDoFuncionario = scanner.nextDouble();
		
		Boolean faturamentoMenorQueAMetaMas80Porcento = (faturamentoRealDaEmpresaNoUltimoAno) >= (metaDeFaturamentoAnualDaEmpresa *80 /100);
		
		Boolean faturamentoRealMaiorOuIgualAMetaDeFaturamentoAnual = faturamentoRealDaEmpresaNoUltimoAno >= metaDeFaturamentoAnualDaEmpresa;
		
//		if(faturamentoRealMaiorOuIgualAMetaDeFaturamentoAnual) {
//			mediaSalariaDoFuncionario += mediaSalariaDoFuncionario;
//		} else if (faturamentoMenorQueAMetaMas80Porcento){
//			mediaSalariaDoFuncionario = mediaSalariaDoFuncionario + (mediaSalariaDoFuncionario*80 /100);
//		}
		
		Double valorTotalBonus = 0.0;
		if(faturamentoRealMaiorOuIgualAMetaDeFaturamentoAnual) {
			valorTotalBonus = mediaSalariaDoFuncionario;
		} else if (faturamentoMenorQueAMetaMas80Porcento){
			valorTotalBonus = (mediaSalariaDoFuncionario*80 /100);
		}
		
		System.out.println(valorTotalBonus);
		//System.out.println(mediaSalariaDoFuncionario);
		scanner.close();
	}
}
