package alura.dev.back.end.nivel1.aula11.exercicio13;

public class Notificador {

	public void enviarMensagem(String mensagem) {
		System.out.println("Mensagem enviada para todos: " + mensagem);
	}

	public void enviarMensagem(String nome, String mensagem) {
		System.out.println("Mensagem para " + nome + ": " + mensagem);
	}

	public void enviarMensagem(String nome, String mensagem, int vezes) {
		for (int i = 0; i < vezes; i++) {
			System.out.println("Mensagem para " + nome + ": " + mensagem);
		}
	}

}
