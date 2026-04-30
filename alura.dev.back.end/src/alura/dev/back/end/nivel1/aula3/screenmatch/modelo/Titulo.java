package alura.dev.back.end.nivel1.aula3.screenmatch.modelo;

public class Titulo {

	private String nome;
	private int anoDeLancamento;
	private boolean incluidoNoPlano;
	private double somaDasAvaliacoes;
	private int totalDeAvaliacao;
	private int duracaoEmMinutos;

	public Titulo(String nome, int anoDeLancamento) {
		this.nome = nome;
		this.anoDeLancamento = anoDeLancamento;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getAnoDeLancamento() {
		return anoDeLancamento;
	}

	public void setAnoDeLancamento(int anoDeLancamento) {
		this.anoDeLancamento = anoDeLancamento;
	}

	public boolean isIncluidoNoPlano() {
		return incluidoNoPlano;
	}

	public void setIncluidoNoPlano(boolean incluidoNoPlano) {
		this.incluidoNoPlano = incluidoNoPlano;
	}

	public int getDuracaoEmMinutos() {
		return duracaoEmMinutos;
	}

	public void setDuracaoEmMinutos(int duracaoEmMinutos) {
		this.duracaoEmMinutos = duracaoEmMinutos;
	}

	public int getTotalDeAvaliacao() {
		return totalDeAvaliacao;
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
