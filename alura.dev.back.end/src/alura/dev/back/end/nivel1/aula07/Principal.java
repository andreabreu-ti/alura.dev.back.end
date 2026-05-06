package alura.dev.back.end.nivel1.aula07;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {

		String[] vendedores = { "Carlos", "Mariana", "João", "Fernanda" };
		double[] vendas = { 4000.00, 8000.00, 12000.00, 5000.00 };

		System.out.println("\nUTILIZANDO for______________________________");
		for (int i = 0; i < vendedores.length; i++) {

			if (vendedores[i].equalsIgnoreCase("mariana")) {
				
				//break;
				continue;
			}
			System.out.printf("%s - comissão %.2f \n", vendedores[i], calcularComissao(vendas[i]));

		}

		System.out.println("\nUTILIZANDO while____________________________");

		int j = 0;
		boolean imprimeOutro = true;
		Scanner leitura = new Scanner(System.in);

		while (imprimeOutro) {

			System.out.printf("%s - comissão %.2f \n", vendedores[j], calcularComissao(vendas[j]));

			j++;
			System.out.println("Deseja imprimir outro?");
			imprimeOutro = leitura.nextBoolean();
		}

		System.out.println("\nUTILIZANDO do...while____________________________");

		do {

			System.out.printf("%s - comissão %.2f \n", vendedores[j], calcularComissao(vendas[j]));

			j++;
			System.out.println("Deseja imprimir outro?");
			imprimeOutro = leitura.nextBoolean();
		} while (imprimeOutro);

		
		System.out.println("\nUTILIZANDO foreach____________________________");
		
		for (String nomeVendedor: vendedores) {
			
			System.out.println("Nome: "+ nomeVendedor);
		}
	}

	public static double calcularComissao(double totalVendas) {

		if (totalVendas <= 5000) {
			return totalVendas * 0.03;
		} else if (totalVendas <= 10000) {
			return totalVendas * 0.05;
		} else {
			return totalVendas * 0.07;
		}
	}

}
