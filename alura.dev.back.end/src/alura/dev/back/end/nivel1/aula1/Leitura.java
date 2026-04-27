package alura.dev.back.end.nivel1.aula1;

import java.util.Scanner;

public class Leitura {

	public static void main(String[] args) {

		
		Scanner leitura = new Scanner(System.in);
		
		System.out.println("Digite seu filme favorito: ");
		String filme = leitura.nextLine();
		
		
		System.out.println("Qual o ano de lançamnto?");
		int anoDelancamento = leitura.nextInt();
		
		System.out.println("Diga a sua avaliação para o Filme?");
		double avaliacao = leitura.nextDouble();
		
		System.out.println(filme);
		System.out.println(anoDelancamento);
		System.out.println(avaliacao);
		
	}

}
