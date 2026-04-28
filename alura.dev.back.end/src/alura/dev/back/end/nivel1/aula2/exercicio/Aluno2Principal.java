package alura.dev.back.end.nivel1.aula2.exercicio;

public class Aluno2Principal {

	public static void main(String[] args) {

		// Desenvolva uma classe Aluno com os atributos privados nome e notas. Utilize
		// métodos getters e setters para acessar e modificar esses atributos. Adicione
		// um método calcularMedia que retorna a média das notas do aluno.
		
		Aluno2 aluno1 = new Aluno2("Lulu", 7.5, 8.0, 9.2);
        Aluno2 aluno2 = new Aluno2("Karina", 6.8, 7.3, 8.5);

        System.out.println("Aluno 1:");
        System.out.println("Nome: " + aluno1.getNome());
        System.out.println("Nota 1: " + aluno1.getNota1());
        System.out.println("Nota 2: " + aluno1.getNota2());
        System.out.println("Nota 3: " + aluno1.getNota3());
        System.out.println("Média: " + aluno1.calcularMedia());
        System.out.println();

        System.out.println("Aluno 2:");
        System.out.println("Nome: " + aluno2.getNome());
        System.out.println("Nota 1: " + aluno2.getNota1());
        System.out.println("Nota 2: " + aluno2.getNota2());
        System.out.println("Nota 3: " + aluno2.getNota3());
        System.out.println("Média: " + aluno2.calcularMedia());

	}

}
