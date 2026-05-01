package alura.dev.back.end.nivel1.aula3.exercicio1;

public class Compra implements Comparable<Compra>{

	private String descricao;
	private double valor;

	public Compra(String descricao, double valor) {
		super();
		this.descricao = descricao;
		this.valor = valor;
	}

	public String getDescricao() {
		return descricao;
	}

	public double getValor() {
		return valor;
	}

	@Override
	public String toString() {

		return "Compra: Descrição = " + descricao + ", Valor = " + valor;
	}

	@Override
	public int compareTo(Compra outraCompra) {

		return Double.valueOf(this.valor).compareTo(Double.valueOf(outraCompra.valor));
	}

}
