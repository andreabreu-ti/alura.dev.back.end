package alura.dev.back.end.nivel1.aula2.screenmatch;

import alura.dev.back.end.nivel1.aula2.screenmatch.calculos.CalculadoraDeTempo;
import alura.dev.back.end.nivel1.aula2.screenmatch.calculos.FiltroRecomendacao;
import alura.dev.back.end.nivel1.aula2.screenmatch.modelos.Episodio;
import alura.dev.back.end.nivel1.aula2.screenmatch.modelos.Filme;
import alura.dev.back.end.nivel1.aula2.screenmatch.modelos.Serie;

public class Principal {

	public static void main(String[] args) {

		Filme meuFilme = new Filme();

		meuFilme.setNome("O poderoso chefão");
		meuFilme.setAnoDeLancamento(1970);
		meuFilme.setDuracaoEmMinutos(180);
		System.out.println("Duração do filme: " + meuFilme.getDuracaoEmMinutos());

		meuFilme.exibeFichaTecnica();

		meuFilme.avalia(8);
		meuFilme.avalia(5);
		meuFilme.avalia(10);

		System.out.println("Total de avaliações: " + meuFilme.getTotalDeAvaliacao());
		// System.out.println(meuFilme.totalDeAvaliacao);
		System.out.println("Média de avaliações do filme: " + meuFilme.pegaMedia());

		Serie lost = new Serie();

		lost.setNome("Lost");
		lost.setAnoDeLancamento(2000);
		lost.exibeFichaTecnica();
		lost.setTemporadas(10);
		lost.setEpisodiosPorTemporada(10);
		lost.setMinutosPorEpisodio(50);

		System.out.println("Duração para maratonar Lost: " + lost.getDuracaoEmMinutos());

		Filme outroFilme = new Filme();
		outroFilme.setNome("Avatar");
		outroFilme.setAnoDeLancamento(2023);
		outroFilme.setDuracaoEmMinutos(200);

		CalculadoraDeTempo calculadora = new CalculadoraDeTempo();
		calculadora.inclui(meuFilme);
		calculadora.inclui(outroFilme);
		calculadora.inclui(lost);
		System.out.println(calculadora.getTempoTotal());
		
		FiltroRecomendacao filtro = new FiltroRecomendacao();
		filtro.filtra(meuFilme);
		
		Episodio episodio = new Episodio();
		episodio.setNumero(1);
		episodio.setSerie(lost);
		episodio.setTotalVisualizacao(300);
		filtro.filtra(episodio);

	}

}
