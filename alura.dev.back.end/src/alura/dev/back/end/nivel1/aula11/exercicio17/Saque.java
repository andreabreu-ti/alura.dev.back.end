package alura.dev.back.end.nivel1.aula11.exercicio17;

class Saque extends OperacaoBancaria{

	public Saque(double valor) {
        super(valor);
    }
 
    @Override
    public void executar() {
        System.out.printf("Saque de R$%.2f realizado%n", valor);
    }
}
