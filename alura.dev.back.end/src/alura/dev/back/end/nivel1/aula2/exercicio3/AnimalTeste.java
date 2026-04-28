package alura.dev.back.end.nivel1.aula2.exercicio3;

public class AnimalTeste {

	public static void main(String[] args) {

		// Crie uma classe Animal com um método emitirSom(). Em seguida, crie duas
		// subclasses: Cachorro e Gato, que herdam da classe Animal. Adicione o método
		// emitirSom() nas subclasses, utilizando a anotação @Override para indicar que
		// estão sobrescrevendo o método. Além disso, adicione métodos específicos para
		// cada subclasse, como abanarRabo() para o Cachorro e arranharMoveis() para o
		// Gato.

		AnimalCachorro cachorro = new AnimalCachorro();
		cachorro.emitirSom();
		cachorro.abanarRabo();

		AnimalGato gato = new AnimalGato();
		gato.emitirSom();
		gato.arranharMoveis();
	}

}
