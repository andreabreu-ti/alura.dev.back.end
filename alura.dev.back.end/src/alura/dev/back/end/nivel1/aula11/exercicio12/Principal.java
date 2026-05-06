package alura.dev.back.end.nivel1.aula11.exercicio12;

public class Principal {

	public static void main(String[] args) {
		
		// 12 - Sistema de pagamentos
		
		Pagamento cartao = new CartaoCredito(250.00);
        Pagamento boleto = new BoletoBancario(500.00);
        Pagamento pix = new Pix(300.00);
        
        cartao.confirmarPagamento();
        boleto.confirmarPagamento();
        pix.confirmarPagamento();

	}

}
