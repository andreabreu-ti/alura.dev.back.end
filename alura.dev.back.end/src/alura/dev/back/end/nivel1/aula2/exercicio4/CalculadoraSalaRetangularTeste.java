package alura.dev.back.end.nivel1.aula2.exercicio4;

public class CalculadoraSalaRetangularTeste {

	public static void main(String[] args) {

		// Crie uma classe CalculadoraSalaRetangular que implementa uma interface
		// CalculoGeometrico com os métodos calcularArea() e calcularPerimetro() para
		// calcular a área e o perímetro de uma sala retangular. A classe deve receber
		// altura e largura como parâmetros.

		CalculadoraSalaRetangular calculadora = new CalculadoraSalaRetangular();
		calculadora.calcularArea(5, 8); // Exemplo com altura e largura
		calculadora.calcularPerimetro(5, 8);

	}

}
