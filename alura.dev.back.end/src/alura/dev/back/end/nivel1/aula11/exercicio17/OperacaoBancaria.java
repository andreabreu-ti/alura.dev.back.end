package alura.dev.back.end.nivel1.aula11.exercicio17;

abstract class OperacaoBancaria implements AcaoBancaria{

	protected double valor;
	 
    public OperacaoBancaria( double valor) {
        this.valor = valor;
    }
}
