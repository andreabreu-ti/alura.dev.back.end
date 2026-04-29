package alura.dev.back.end.nivel1.aula2.exercicio4;

public class TemperaturaPadraoConversor implements TemperaturaConversor{

	@Override
    public double celsiusParaFahrenheit(double temperaturaCelsius) {
        return (temperaturaCelsius * 9 / 5) + 32;
    }

    @Override
    public double fahrenheitParaCelsius(double temperaturaFahrenheit) {
        return (temperaturaFahrenheit - 32) * 5 / 9;
    }
}
