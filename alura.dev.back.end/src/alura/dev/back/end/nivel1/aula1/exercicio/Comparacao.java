package alura.dev.back.end.nivel1.aula1.exercicio;

import java.util.Scanner;

public class Comparacao {

	public static void main(String[] args) {

		// Peça ao usuário para inserir dois números inteiros. Compare os números e
		// imprima uma mensagem indicando se são iguais, diferentes, o primeiro é maior
		// ou o segundo é maior.

		Scanner scanner = new Scanner(System.in);

		System.out.print("Digite o primeiro número: ");
		int numero1 = scanner.nextInt();

		System.out.print("Digite o segundo número: ");
		int numero2 = scanner.nextInt();

		if (numero1 == numero2) {
			System.out.println("Os números são iguais");
		} else if (numero1 > numero2) {
			System.out.println("O primeiro número é maior");
		} else {
			System.out.println("O segundo número é maior");
		}

	}

}
