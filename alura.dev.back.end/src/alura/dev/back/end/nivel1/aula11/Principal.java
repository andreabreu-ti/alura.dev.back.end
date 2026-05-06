package alura.dev.back.end.nivel1.aula11;

public class Principal {

	public static void main(String[] args) {

		Funcionario gerente = new Gerente("Mario", 15000);
		((Gerente) gerente).setBonus(1000);
		gerente.exibirInformacoes();
		gerente.reajustarSalario(2);

		Funcionario desenvolvedor = new Desenvolvedor("Carla", 12000, "Backend Java");
		desenvolvedor.reajustarSalario();
		desenvolvedor.exibirInformacoes();
	}
}
