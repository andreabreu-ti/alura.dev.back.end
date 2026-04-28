package alura.dev.back.end.nivel1.aula2.exercicio;

public class ProdutoPrincipal {

	public static void main(String[] args) {

		// Desenvolva uma classe Produto com os atributos privados nome e preco. Utilize
		// métodos getters e setters para acessar e modificar esses atributos. Adicione
		// um método aplicarDesconto que recebe um valor percentual e reduz o preço do
		// produto.

		Produto produto = new Produto("Celular", 2000.0);

		System.out.println("Nome do Produto: " + produto.getNome());
		System.out.println("Preço: " + produto.getPreco());

		produto.aplicarDesconto(10);
		System.out.println("Novo Preço após Desconto: " + produto.getPreco());

	}

}
