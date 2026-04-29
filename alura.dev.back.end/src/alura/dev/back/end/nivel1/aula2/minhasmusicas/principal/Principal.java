package alura.dev.back.end.nivel1.aula2.minhasmusicas.principal;

import alura.dev.back.end.nivel1.aula2.minhasmusicas.modelos.MinhaPreferidas;
import alura.dev.back.end.nivel1.aula2.minhasmusicas.modelos.Musica;
import alura.dev.back.end.nivel1.aula2.minhasmusicas.modelos.Podcast;

public class Principal {

	public static void main(String[] args) {

		// TODO Auto-generated method stub
		Musica minhaMusica = new Musica();

		minhaMusica.setTitulo("Forever");
		minhaMusica.setCantor("Kiss");

		for (int i = 0; i < 50; i++) {

			minhaMusica.reproduz();
		}

		for (int i = 0; i < 500; i++) {

			minhaMusica.curte();
		}

		Podcast meuPodcast = new Podcast();
		meuPodcast.setTitulo("Bolhadev");
		meuPodcast.setApresentador("Marcus Mendes");

		for (int i = 0; i < 5000; i++) {

			minhaMusica.reproduz();
		}

		for (int i = 0; i < 1000; i++) {

			minhaMusica.curte();
		}
		
		MinhaPreferidas preferidas = new MinhaPreferidas();
		preferidas.inclui(meuPodcast);
		preferidas.inclui(meuPodcast);
	}

}
