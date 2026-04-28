package alura.dev.back.end.nivel1.aula2.screenmatch.modelos;

public class Filme {

	private String nome;
	private int anoDeLancamento;
	private boolean incluidoNoPlano;
	private double somaDasAvaliacoes;
	private int totalDeAvaliacao;
	private int duracaoEmMinutos;

	public int getTotalDeAvaliacoes() {
		return totalDeAvaliacao;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setAnoDeLancamento(int anoDeLancamento) {
		this.anoDeLancamento = anoDeLancamento;
	}

	public void setIncluidoNoPlano(boolean incluidoNoPlano) {
		this.incluidoNoPlano = incluidoNoPlano;
	}

	public void setDuracaoEmMinutos(int duracaoEmMinutos) {
		this.duracaoEmMinutos = duracaoEmMinutos;
	}

	public void exibeFichaTecnica() {

		System.out.println("Nome do Filme: " + nome);
		System.out.println("Ano de Lançamento: " + anoDeLancamento);
	}

	public void avalia(double nota) {

		somaDasAvaliacoes += nota;
		totalDeAvaliacao++;
	}

	public double pegaMedia() {

		return somaDasAvaliacoes / totalDeAvaliacao;
	}

}
