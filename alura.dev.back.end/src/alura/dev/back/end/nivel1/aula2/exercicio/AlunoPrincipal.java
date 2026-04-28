package alura.dev.back.end.nivel1.aula2.exercicio;

public class AlunoPrincipal {

	public static void main(String[] args) {

		// Crie uma classe Aluno com atributos nome, idade, e um método para exibir
		// informações. Crie uma instância da classe Aluno, atribua valores aos seus
		// atributos e utilize o método para exibir as informações.

		Aluno meuAluno = new Aluno();
		meuAluno.nome = "Akemi";
		meuAluno.idade = 18;

		meuAluno.exibeInformacoes();

	}

}
