package alura.dev.back.end.nivel1.aula2.exercicio2;

public class LivroPrincipal {

	public static void main(String[] args) {

		// Desenvolva uma classe Livro com os atributos privados titulo e autor. Utilize
		// métodos getters e setters para acessar e modificar esses atributos. Adicione
		// um método exibirDetalhes que imprime o título e o autor do livro.

		Livro livro1 = new Livro();
		livro1.setTitulo("Lógica de Programação");
		livro1.setAutor("Paulo Silveira");

		Livro livro2 = new Livro();
		livro2.setTitulo("A lógica do jogo");
		livro2.setAutor("Marcus Becker");

		livro1.exibirDetalhes();
		livro2.exibirDetalhes();

	}

}
