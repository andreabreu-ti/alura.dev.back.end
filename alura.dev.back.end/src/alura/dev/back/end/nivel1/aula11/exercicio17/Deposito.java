package alura.dev.back.end.nivel1.aula11.exercicio17;

class Deposito extends OperacaoBancaria {

	public Deposito(double valor) {
        super(valor);
    }
	
	@Override
    public void executar() {
        System.out.printf("Depósito de R$%.2f realizado%n", valor);
    }
}
