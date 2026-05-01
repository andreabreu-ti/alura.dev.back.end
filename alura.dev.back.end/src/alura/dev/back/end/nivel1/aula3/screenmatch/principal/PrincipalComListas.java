package alura.dev.back.end.nivel1.aula3.screenmatch.principal;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

import alura.dev.back.end.nivel1.aula3.screenmatch.modelo.Filme;
import alura.dev.back.end.nivel1.aula3.screenmatch.modelo.Serie;
import alura.dev.back.end.nivel1.aula3.screenmatch.modelo.Titulo;

public class PrincipalComListas {

	public static void main(String[] args) {

		Filme meuFilme = new Filme("O poderoso chefão", 1970);
		meuFilme.avalia(9);
		Filme outroFilme = new Filme("Avatar", 2023);
		outroFilme.avalia(6);
		var filmeDoPaulo = new Filme("Dogville", 2003);
		filmeDoPaulo.avalia(10);
		Serie lost = new Serie("Lost", 2000);

		List<Titulo> lista = new LinkedList();
		lista.add(filmeDoPaulo);
		lista.add(meuFilme);
		lista.add(outroFilme);
		lista.add(lost);

		for (Titulo item : lista) {

			System.out.println(item.getNome());

			if (item instanceof Filme filme && filme.getClassificacao() > 2) {

				System.out.println("Classificação " + filme.getClassificacao());
			}

		}

		ArrayList<String> buscaPorArtista = new ArrayList<String>();
		buscaPorArtista.add("Adam Sandler");
		buscaPorArtista.add("Mia Kalifa");
		buscaPorArtista.add("Elisa Ibarra");

		System.out.println(buscaPorArtista);

		Collections.sort(buscaPorArtista);
		System.out.println("Depois da ordenação");
		System.out.println(buscaPorArtista);

		System.out.println("Lista de títulos ordenação");
		Collections.sort(lista);
		System.out.println(lista);
		
		lista.sort(Comparator.comparing(Titulo::getAnoDeLancamento));
		System.out.println("Ordenação por ano");
		System.out.println(lista);
		

	}

}
