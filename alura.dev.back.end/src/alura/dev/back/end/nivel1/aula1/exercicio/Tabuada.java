package alura.dev.back.end.nivel1.aula1.exercicio;

import java.util.Scanner;

public class Tabuada {

	public static void main(String[] args) {

		// Crie um programa que solicite ao usuário um número e exiba a tabuada desse
		// número de 1 a 10.

		Scanner scanner = new Scanner(System.in);

		System.out.print("Digite um número: ");
		int numero = scanner.nextInt();

		System.out.println("Tabuada do " + numero + ":");
		for (int i = 1; i <= 10; i++) {
			System.out.println(numero + " x " + i + " = " + (numero * i));
		}

	}

}
