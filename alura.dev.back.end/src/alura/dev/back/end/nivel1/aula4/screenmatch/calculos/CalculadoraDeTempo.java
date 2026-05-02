package alura.dev.back.end.nivel1.aula4.screenmatch.calculos;

import alura.dev.back.end.nivel1.aula4.screenmatch.modelo.Titulo;

public class CalculadoraDeTempo {

	private int tempoTotal;

	public int getTempoTotal() {
		return tempoTotal;
	}

//	public void inclui(Filme f) {
//		
//		tempoTotal += f.getDuracaoEmMinutos();
//	}
//	
//	public void inclui(Serie f) {
//		
//		tempoTotal += f.getDuracaoEmMinutos();
//	}

	public void inclui(Titulo titulo) {

		System.out.println("Adicionando duração em minutos de " + titulo);
		this.tempoTotal += titulo.getDuracaoEmMinutos();
	}
}
