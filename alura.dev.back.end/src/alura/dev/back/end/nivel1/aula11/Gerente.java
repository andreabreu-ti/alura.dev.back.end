package alura.dev.back.end.nivel1.aula11;

public class Gerente extends Funcionario {

	private double bonus;

	public Gerente(String nome, double salario) {

		super(nome, salario);
	}

	public double getBonus() {
		return bonus;
	}

	public void setBonus(double bonus) {
		this.bonus = bonus;
	}

}
