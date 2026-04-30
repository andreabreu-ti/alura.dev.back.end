package alura.dev.back.end.nivel1.aula3.screenmatch.principal;

import java.util.ArrayList;

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

		ArrayList<Titulo> lista = new ArrayList<>();
		lista.add(filmeDoPaulo);
		lista.add(meuFilme);
		lista.add(outroFilme);
		lista.add(lost);

		for (Titulo item : lista) {

			System.out.println(item.getNome());
			Filme filme = (Filme) item;
			System.out.println("Classificação " + filme.getClassificacao());
		}

	}

}
