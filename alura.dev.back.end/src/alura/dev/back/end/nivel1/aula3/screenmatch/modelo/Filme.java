package alura.dev.back.end.nivel1.aula3.screenmatch.modelo;

import alura.dev.back.end.nivel1.aula2.screenmatch.calculos.Classificavel;

public class Filme extends Titulo implements Classificavel {

	private String diretor;

	public String getDiretor() {
		return diretor;
	}

	public void setDiretor(String diretor) {
		this.diretor = diretor;
	}

	@Override
	public int getClassificacao() {
		return (int) (pegaMedia() / 2);
	}

}
