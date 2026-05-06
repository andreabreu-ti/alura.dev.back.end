package alura.dev.back.end.nivel1.aula11;

public class Funcionario {

	protected String nome;
	private String cargo;
	protected double salario;
	private int controleReajuste = 0;

	public Funcionario(String nome, double salario) {
		this.nome = nome;
		this.salario = salario;
	}

	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

	public String getNome() {
		return nome;
	}

	public double getSalario() {
		return salario;
	}

	public void exibirInformacoes() {

		System.out.printf("\nFuncionário %s - Salário: %.2f", nome, salario);
	}

	public void reajustarSalario(double percentual) {

		if (controleReajuste >= 1) {
		
			System.out.println("\nNão pode mais fazer reajustes!");
		} else {

			controleReajuste++;
			salario += salario * (percentual / 100);
			System.out.printf("\nNovo salário de %s é de %.2f", nome, salario);
		}
	}
	
	public void reajustarSalario() {
		
		salario += 500;
		System.out.printf("\nSalário com dissidio de %s é de %.2f", nome, salario);
	}
}
