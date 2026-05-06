package alura.dev.back.end.nivel1.aula9;

public class Principal {

	public static void main(String[] args) {

		Funcionario funcionario1 = new Funcionario();
		funcionario1.nome = "Fulano";
		funcionario1.cargo = "Gerente de Projetos";
		funcionario1.salario = 9000;

		Funcionario funcionario2 = new Funcionario();
		funcionario2.nome = "Ciclano";
		funcionario2.cargo = "Desenvolvedor";
		funcionario2.salario = 8500;
		
		funcionario2.exibirInformacoes();
		funcionario2.reajustarSalario(5);
		funcionario1.exibirInformacoes();

	}

}
