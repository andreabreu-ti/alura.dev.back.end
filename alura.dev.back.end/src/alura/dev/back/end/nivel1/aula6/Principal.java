package alura.dev.back.end.nivel1.aula6;

public class Principal {

	public static void main(String[] args) {

		String nome = "João";
		double salario = 2890.0;
		int numeroDependente = 2;

		boolean isento = true;

		if (salario > 2259.20 && !isento) {

			double irrf = (salario / 100) * 7.5;
			System.out.println("Valor IRRF: " + irrf);
		} else if (isento) {

			System.out.println("Contrinuinte isento IRRF.");
		} else {

			System.out.println("Não há valores de IRRF.");
		}
	}

}
