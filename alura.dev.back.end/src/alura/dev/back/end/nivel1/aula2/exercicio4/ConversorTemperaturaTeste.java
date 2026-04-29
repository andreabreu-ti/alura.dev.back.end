package alura.dev.back.end.nivel1.aula2.exercicio4;

public class ConversorTemperaturaTeste {

	public static void main(String[] args) {

		// Crie uma interface ConversorTemperatura com os métodos
		// celsiusParaFahrenheit() e fahrenheitParaCelsius(). Implemente uma classe
		// ConversorTemperaturaPadrao que implementa essa interface com as fórmulas de
		// conversão e exibe os resultados.

		TemperaturaConversor conversor = new TemperaturaPadraoConversor();

		double temperaturaCelsius = 25;
		double temperaturaFahrenheit = conversor.celsiusParaFahrenheit(temperaturaCelsius);
		System.out.println(temperaturaCelsius + " Celsius é igual a " + temperaturaFahrenheit + " Fahrenheit.");

		temperaturaFahrenheit = 77;
		temperaturaCelsius = conversor.fahrenheitParaCelsius(temperaturaFahrenheit);
		System.out.println(temperaturaFahrenheit + " Fahrenheit é igual a " + temperaturaCelsius + " Celsius.");

	}

}
