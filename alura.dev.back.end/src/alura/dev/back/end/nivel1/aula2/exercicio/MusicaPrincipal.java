package alura.dev.back.end.nivel1.aula2.exercicio;

public class MusicaPrincipal {

	public static void main(String[] args) {

		// Crie uma classe Musica com atributos titulo, artista, anoLancamento,
		// avaliacao e numAvaliacoes, e métodos para exibir a ficha técnica, avaliar a
		// música e calcular a média de avaliações.

		Musica minhaMusica = new Musica();

		minhaMusica.titulo = "Nome da Música";
		minhaMusica.artista = "Nome do Artista";
		minhaMusica.anoLancamento = 2023;

		minhaMusica.exibeFichaTecnica();

		minhaMusica.avalia(4.5);
		minhaMusica.avalia(3.8);
		minhaMusica.avalia(5.0);

		double mediaAvaliacoes = minhaMusica.pegaMedia();
		System.out.println("Média das avaliações: " + mediaAvaliacoes);

	}

}
