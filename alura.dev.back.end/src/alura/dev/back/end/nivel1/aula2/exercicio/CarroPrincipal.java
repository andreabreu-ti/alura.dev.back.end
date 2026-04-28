package alura.dev.back.end.nivel1.aula2.exercicio;

public class CarroPrincipal {

	public static void main(String[] args) {

		// Crie uma classe Carro com atributos modelo, ano, cor e métodos para exibir a
		// ficha técnica e calcular a idade do carro.

		Carro meuCarro = new Carro();
		meuCarro.modelo = "Gol";
		meuCarro.ano = 2023;
		meuCarro.cor = "Preto";

		// Exibir ficha técnica
		meuCarro.exibeFichaTecnica();

		// Calcular idade do carro
		System.out.println("Idade do carro: " + meuCarro.calculaIdade() + " anos");
	}

}
