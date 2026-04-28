package alura.dev.back.end.nivel1.aula2.exercicio3;

public class NumerosPrimosTeste {

	public static void main(String[] args) {

		// Crie uma classe NumerosPrimos com métodos como verificarPrimalidade() e
		// listarPrimos(). Em seguida, crie duas subclasses, VerificadorPrimo e
		// GeradorPrimo, que herdam da classe NumerosPrimos. Adicione um método
		// específico para cada uma das subclasses, como verificarSeEhPrimo() para o
		// VerificadorPrimo e gerarProximoPrimo() para o GeradorPrimo.

		NumerosPrimosVerificador verificador = new NumerosPrimosVerificador();
		verificador.verificarSeEhPrimo(17);

		NumerosPrimosGerador gerador = new NumerosPrimosGerador();
		int proximoPrimo = gerador.gerarProximoPrimo(17);
		System.out.println("O próximo primo após 17 é: " + proximoPrimo);

		NumerosPrimos numerosPrimos = new NumerosPrimos();
		numerosPrimos.listarPrimos(30);

	}

}
