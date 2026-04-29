package alura.dev.back.end.nivel1.aula2.minhasmusicas.modelos;

public class Audio {

	private String titulo;
	private int totalReproducoes;
	private int totalCustidas;
	private int classificacao;

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public int getTotalReproducoes() {
		return totalReproducoes;
	}

	public int getTotalCustidas() {
		return totalCustidas;
	}

	public double getClassificacao() {
		return classificacao;
	}
	
	public void curte() {
		
		this.totalCustidas ++; 
	}
	
	public void reproduz() {
		
		this.totalReproducoes++;
	}

}
