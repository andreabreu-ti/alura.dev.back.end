package alura.dev.back.end.nivel1.aula2.exercicio3;

public class ContaBancariaTeste {

	public static void main(String[] args) {

		// Crie uma classe ContaBancaria com métodos para realizar operações bancárias
		// como depositar(), sacar() e consultarSaldo(). Em seguida, crie uma subclasse
		// ContaCorrente que herda da classe ContaBancaria. Adicione um método
		// específico para a subclasse, como cobrarTarifaMensal(), que desconta uma
		// tarifa mensal da conta corrente.

		// Criando uma conta bancária com saldo inicial de 1000
		ContaBancaria conta = new ContaBancaria();
		conta.depositar(1000);
		conta.consultarSaldo();

		// Realizando operações na conta corrente
		ContaCorrente contaCorrente = new ContaCorrente();
		contaCorrente.depositar(200);
		contaCorrente.cobrarTarifaMensal();
		contaCorrente.consultarSaldo();
		contaCorrente.sacar(150);
		contaCorrente.consultarSaldo();

	}

}
