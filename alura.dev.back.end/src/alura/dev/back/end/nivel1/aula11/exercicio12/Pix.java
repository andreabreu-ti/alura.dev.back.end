package alura.dev.back.end.nivel1.aula11.exercicio12;

class Pix extends Pagamento {

	public Pix(double valor) {
        super(valor);
    }
 
    @Override
    public void confirmarPagamento() {
        System.out.printf("Pagamento via Pix de R$%.2f confirmado\n",
                valor);
    }
}
