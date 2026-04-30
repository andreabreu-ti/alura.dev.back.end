package alura.dev.back.end.nivel1.aula3.screenmatch.principal;

import java.util.ArrayList;

import alura.dev.back.end.nivel1.aula3.screenmatch.calculos.CalculadoraDeTempo;
import alura.dev.back.end.nivel1.aula3.screenmatch.calculos.FiltroRecomendacao;
import alura.dev.back.end.nivel1.aula3.screenmatch.modelo.Episodio;
import alura.dev.back.end.nivel1.aula3.screenmatch.modelo.Filme;
import alura.dev.back.end.nivel1.aula3.screenmatch.modelo.Serie;

public class Principal {

	public static void main(String[] args) {

		Filme meuFilme = new Filme("O poderoso chefão", 1970);
		meuFilme.setDuracaoEmMinutos(180);
		System.out.println("Duração do filme: " + meuFilme.getDuracaoEmMinutos());

		meuFilme.exibeFichaTecnica();

		meuFilme.avalia(8);
		meuFilme.avalia(5);
		meuFilme.avalia(10);

		System.out.println("Total de avaliações: " + meuFilme.getTotalDeAvaliacao());
		System.out.println("Média de avaliações do filme: " + meuFilme.pegaMedia());

		
		//-----------------------------------------------------------------------------------
		Serie lost = new Serie("Lost", 2000);
		lost.exibeFichaTecnica();
		lost.setTemporadas(10);
		lost.setEpisodiosPorTemporada(10);
		lost.setMinutosPorEpisodio(50);

		System.out.println("Duração para maratonar Lost: " + lost.getDuracaoEmMinutos());

		//-----------------------------------------------------------------------------------
		Filme outroFilme = new Filme("Avatar", 2023);
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

		//-----------------------------------------------------------------------------------
		var filmeDoPaulo = new Filme("Dogville",2003);
		filmeDoPaulo.setDuracaoEmMinutos(200);
		filmeDoPaulo.avalia(10);

		ArrayList<Filme> listaDeFilmes = new ArrayList<Filme>();
		listaDeFilmes.add(filmeDoPaulo);
		listaDeFilmes.add(meuFilme);
		listaDeFilmes.add(outroFilme);

		System.out.println("Tamanho da lista: " + listaDeFilmes.size());
		System.out.println("Primeiro Filme: " + listaDeFilmes.get(0).getNome());
		System.out.println(listaDeFilmes);
		System.out.println("To String " + listaDeFilmes.get(0).toString());

	}

}
