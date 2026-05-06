package alura.dev.back.end.nivel1.aula11.exercicio10;

public class Principal {

	public static void main(String[] args) {
		
		// 10 - Gerenciamento de biblioteca
		
		Livro livro = new Livro("O Guia do Mochileiro das Galáxias", 1979, "Douglas Adams");
        Revista revista = new Revista("National Geographic", 2023, 245);
        Ebook ebook = new Ebook("Clean Code", 2008, "PDF");
 
        livro.exibirInfo();
        revista.exibirInfo();
        ebook.exibirInfo();

	}

}
