package alura.dev.back.end.nivel1.aula11.exercicio11;

class Sms extends Notificacao {

	public Sms(String destinatario, String mensagem) {
        super(destinatario, mensagem);
    }
 
    @Override
    public void enviar() {
        System.out.printf("\nEnviando SMS para: %s\nMensagem: %s", destinatario, mensagem);
    }
}
