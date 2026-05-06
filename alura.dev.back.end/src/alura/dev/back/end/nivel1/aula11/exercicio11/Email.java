package alura.dev.back.end.nivel1.aula11.exercicio11;

class Email extends Notificacao {

	private String assunto;
	 
    public Email(String destinatario, String mensagem, String assunto) {
        super(destinatario, mensagem);
        this.assunto = assunto;
    }
 
    @Override
    public void enviar() {
        System.out.printf("\nEnviando Email para: %s\nAssunto: %s\nCorpo: %s", destinatario, assunto, mensagem);
    }
}
