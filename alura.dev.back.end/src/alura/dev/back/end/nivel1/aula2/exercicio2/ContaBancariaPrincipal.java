package alura.dev.back.end.nivel1.aula2.exercicio2;

public class ContaBancariaPrincipal {

	public static void main(String[] args) {

		// Crie uma classe ContaBancaria com os seguintes atributos: numeroConta
		// (privado), saldo (privado) e titular (publico). Implemente métodos getters e
		// setters para os atributos privados.

		ContaBancaria conta = new ContaBancaria();

		conta.setNumeroConta(123);
		conta.setSaldo(1000);
		conta.titular = "João";

		System.out.println("Número da Conta: " + conta.getNumeroConta());
		System.out.println("Saldo: " + conta.getSaldo());
		System.out.println("Titular: " + conta.titular);

		conta.setSaldo(1500);
		System.out.println("Novo Saldo: " + conta.getSaldo());

	}

}
