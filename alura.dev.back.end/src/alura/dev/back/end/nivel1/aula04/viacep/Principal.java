package alura.dev.back.end.nivel1.aula04.viacep;

import java.io.IOException;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {

		Scanner leitura = new Scanner(System.in);
		
		System.out.println("Digite umnúmero de CEP para consulta:");
		var cep = leitura.nextLine();
		
		ConsultaCep consultaCep = new ConsultaCep();

		try {

			Endereco novoEndereco = consultaCep.buscaEndereco(cep);
			System.out.println(novoEndereco);
			
			GeradoDeArquivo gerador = new GeradoDeArquivo();
			gerador.salvaJson(novoEndereco);
			
		} catch (RuntimeException | IOException e) {

			System.out.println("Erro na aplicação: " + e.getMessage());
			System.out.println("Finalizando a aplicação!!!");
		}

	}

}
