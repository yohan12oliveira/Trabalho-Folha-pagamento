
public class TesteFolhaPagamento {
	public static void main(String[] args) {
		
		CalculaFolhaPagamento calcula = new CalculaFolhaPagamento(40,150.0,3);
		System.out.println("Salario Bruto :" + calcula.salarioBruto());
		System.out.println();
		
		System.out.println("Desconto INSS  :" + calcula.descontoInss());
		System.out.println();
		
		System.out.println("Desconto IR" + calcula.descontoIr());
		System.out.println();
		
		System.out.println("Salario Líquido " + calcula.salarioLiquido());
		
	}
}
