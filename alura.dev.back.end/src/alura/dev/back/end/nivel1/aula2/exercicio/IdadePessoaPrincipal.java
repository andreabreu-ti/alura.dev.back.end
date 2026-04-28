package alura.dev.back.end.nivel1.aula2.exercicio;

public class IdadePessoaPrincipal {

	public static void main(String[] args) {

		// Crie uma classe IdadePessoa com os atributos privados nome e idade. Utilize
		// métodos getters e setters para acessar e modificar esses atributos. Adicione
		// um método verificarIdade que imprime se a pessoa é maior de idade ou não.

		IdadePessoa pessoa1 = new IdadePessoa();
        pessoa1.setNome("Carowl");
        pessoa1.setIdade(22);

        IdadePessoa pessoa2 = new IdadePessoa();
        pessoa2.setNome("Camila");
        pessoa2.setIdade(20);

        System.out.println(pessoa1.getNome() + " tem " + pessoa1.getIdade() + " anos.");
        pessoa1.verificarIdade();

        System.out.println(pessoa2.getNome() + " tem " + pessoa2.getIdade() + " anos.");
        pessoa2.verificarIdade();
	}
}
