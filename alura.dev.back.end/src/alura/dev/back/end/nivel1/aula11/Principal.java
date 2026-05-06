package alura.dev.back.end.nivel1.aula11;

public class Principal {

	public static void main(String[] args) {

		Funcionario funcionario = new Funcionario("João", 8500);
		funcionario.setCargo("Gerente de Projetos");

		System.out.println("Funcionário tem o cargo " + funcionario.getCargo());
		System.out.println("Funcionário tem o nome " + funcionario.getNome());
		System.out.println("Funcionário tem o nomesalário" + funcionario.getSalario());

		funcionario.reajustarSalario(5);
		funcionario.reajustarSalario(10);
		funcionario.exibirInformacoes();

	}

}
