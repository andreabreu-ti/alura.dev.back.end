package alura.dev.back.end.nivel1.aula11.exercicio12;

class CartaoCredito extends Pagamento {

	public CartaoCredito(double valor) {
        super(valor);
    }
 
    @Override
    public void confirmarPagamento() {
        System.out.printf("Pagamento de R$%.2f confirmado no Cartão de Crédito (Taxa: R$%.2f)\n",
                valor, calcularTaxa());
    }
 
    @Override
    public double calcularTaxa() {
        return valor * 0.03;
    }
}
