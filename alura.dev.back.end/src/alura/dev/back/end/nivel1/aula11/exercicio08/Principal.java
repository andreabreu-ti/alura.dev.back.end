package alura.dev.back.end.nivel1.aula11.exercicio08;

public class Principal {

	public static void main(String[] args) {

		//08 - Identificando o estudante
		
		Aluno aluno1 = new Aluno("Fernanda", "regular");
		Bolsista aluno2 = new Bolsista("Lucas");

		aluno1.identificar();
		aluno2.identificar();

	}

}
