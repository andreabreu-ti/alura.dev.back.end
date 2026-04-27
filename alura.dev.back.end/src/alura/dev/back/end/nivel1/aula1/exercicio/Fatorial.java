package alura.dev.back.end.nivel1.aula1.exercicio;

import java.util.Scanner;

public class Fatorial {

	public static void main(String[] args) {

		// Crie um programa que solicite ao usuário um número e calcule o fatorial desse número.

		Scanner scanner = new Scanner(System.in);

		System.out.print("Digite um número: ");
		int numero = scanner.nextInt();

		int fatorial = 1;

		for (int i = 1; i <= numero; i++) {
			fatorial *= i;
		}

		System.out.println("O fatorial de " + numero + " é: " + fatorial);

	}

}
