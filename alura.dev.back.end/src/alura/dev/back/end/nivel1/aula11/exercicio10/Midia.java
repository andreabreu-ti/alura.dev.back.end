package alura.dev.back.end.nivel1.aula11.exercicio10;

public class Midia {

	private String titulo;
	private int anoPublicacao;

	public Midia(String titulo, int anoPublicacao) {
		this.titulo = titulo;
		this.anoPublicacao = anoPublicacao;
	}

	public String getTitulo() {
		return titulo;
	}

	public int getAnoPublicacao() {
		return anoPublicacao;
	}

	public String gerarCodigo() {
		return "LIB-" + titulo.substring(0, 3) + anoPublicacao;
	}
}
