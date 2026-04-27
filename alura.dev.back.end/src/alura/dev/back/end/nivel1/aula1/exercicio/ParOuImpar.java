package alura.dev.back.end.nivel1.aula1.exercicio;

import java.util.Scanner;

public class ParOuImpar {

	public static void main(String[] args) {

		// Crie um programa que solicite ao usuário a entrada de um número inteiro.
		// Verifique se o número é par ou ímpar e exiba uma mensagem correspondente.

		Scanner scanner = new Scanner(System.in);

		System.out.print("Digite um número inteiro: ");
		int numero = scanner.nextInt();

		if (numero % 2 == 0) {
			System.out.println("O número é par.");
		} else {
			System.out.println("O número é ímpar.");
		}
	}

}
