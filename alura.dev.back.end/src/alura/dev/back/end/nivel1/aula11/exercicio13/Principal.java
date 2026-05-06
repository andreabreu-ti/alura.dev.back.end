package alura.dev.back.end.nivel1.aula11.exercicio13;

public class Principal {

	public static void main(String[] args) {

		// 13 - Enviando mensagens
		
		Notificador notificacao = new Notificador();

		notificacao.enviarMensagem("Olá!");
		notificacao.enviarMensagem("João", "Bom dia!");
		notificacao.enviarMensagem("Maria", "Atenção!", 2);

	}

}
