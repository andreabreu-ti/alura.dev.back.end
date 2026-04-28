package alura.dev.back.end.nivel1.aula2.screenmatch;

public class Filme {

	String nome;
	int anoDeLancamento;
	boolean incluidoNoPlano;
	double somaDasAvaliacoes;
	int totalDeAvaliacao;
	int duracaoEmMinutos;

	void exibeFichaTecnica() {

		System.out.println("Nome do Filme: " + nome);
		System.out.println("Ano de Lançamento: " + anoDeLancamento);
	}
	
	void avalia(double nota) {
		
		somaDasAvaliacoes += nota;
		totalDeAvaliacao++;
	}
	
	double pegaMedia() {
		
		return somaDasAvaliacoes / totalDeAvaliacao; 
	}

}
