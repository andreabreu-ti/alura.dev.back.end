package alura.dev.back.end.nivel1.aula1;

public class Condicional {

	public static void main(String[] args) {

		int anoDeLancamento = 1986;
		boolean inclidoNoPlano = false;
		double notaDoFilme = 8.1;
		String tipoPlano = "normal";

		if (anoDeLancamento >= 2022) {
			System.out.println("Lançamento que os cliente estão curtindo!");
		} else {
			System.out.println("Filme retror que vale a pena assistir!");
		}

		if (inclidoNoPlano == true || tipoPlano.equals("plus")) {
			System.out.println("Filme liberado");
		} else {
			System.out.println("Deve pagar a locação!");
		}
	}
}
