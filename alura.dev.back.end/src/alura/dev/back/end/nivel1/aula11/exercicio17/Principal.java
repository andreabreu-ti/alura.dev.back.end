package alura.dev.back.end.nivel1.aula11.exercicio17;

public class Principal {

	public static void main(String[] args) {
		
		// 17 - Sistema bancário
		
		OperacaoBancaria deposito = new Deposito(200.0);
        OperacaoBancaria saque = new Saque(50.5);
 
        deposito.executar();
        saque.executar();

	}

}
