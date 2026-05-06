package alura.dev.back.end.nivel1.aula11.exercicio11;

public class Notificacao {

	protected String destinatario;
    protected String mensagem;
 
    public Notificacao(String destinatario, String mensagem) {
        this.destinatario = destinatario;
        this.mensagem = mensagem;
    }
 
    void enviar() {};
}
