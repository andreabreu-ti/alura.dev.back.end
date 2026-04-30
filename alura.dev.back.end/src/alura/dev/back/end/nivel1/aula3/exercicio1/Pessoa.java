package alura.dev.back.end.nivel1.aula3.exercicio1;

public class Pessoa {

	// Crie uma classe Pessoa com atributos como nome, idade, e um método toString
	// que represente esses atributos.
	
	private String nome;
    private int idade;
    
    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    @Override
    public String toString() {
        return "Pessoa: " + nome + " (Idade: " + idade + ")";
    }
}
