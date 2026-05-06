package alura.dev.back.end.nivel1.aula11.exercicio11;

public class Principal {

	public static void main(String[] args) {
		
		// 11 - Sistema de notificação
		
		 Notificacao email = new Email(
	                "cliente@exemplo.com",
	                "Aproveite nossos descontos esta semana.",
	                "Promoção especial!");
	 
	        Notificacao sms = new Sms(
	                "(11) 98765-4321",
	                "Sua fatura foi paga com sucesso.");
	 
	        Notificacao push = new Push(
	                "usuario_app",
	                "Você tem uma nova mensagem não lida.",
	                "Novidade!");
	 
	        email.enviar();
	        sms.enviar();
	        push.enviar();

	}

}
