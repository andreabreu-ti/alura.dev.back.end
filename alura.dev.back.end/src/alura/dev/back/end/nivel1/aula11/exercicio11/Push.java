package alura.dev.back.end.nivel1.aula11.exercicio11;

class Push extends Notificacao {

	private String titulo;
	 
    public Push(String destinatario, String mensagem, String titulo) {
        super(destinatario, mensagem);
        this.titulo = titulo;
    }
 
    @Override
    public void enviar() {
        System.out.printf("\nEnviando Push para: %s\nTítulo: %s\nConteúdo: %s", destinatario, titulo, mensagem);
    }
}
