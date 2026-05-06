package alura.dev.back.end.nivel1.aula09;

public class Funcionario {

	String nome;
	String cargo;
	double salario;

	public void exibirInformacoes() {

		System.out.printf("\nFuncionário %s - Cargo: %s - Salário: %.2f", nome, cargo, salario);
	}

	public void reajustarSalario(double percentual) {

		salario += salario * (percentual / 100);
		System.out.printf("\nNovo salário de %s é de %.2f", nome, salario);
	}
}
