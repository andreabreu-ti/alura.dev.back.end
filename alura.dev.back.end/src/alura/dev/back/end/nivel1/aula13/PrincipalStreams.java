package alura.dev.back.end.nivel1.aula13;

import java.util.List;
import java.util.stream.Collectors;

import org.w3c.dom.ls.LSInput;

public class PrincipalStreams {

	public static void main(String[] args) {

		// Streams - Operações comuns

		System.out.println("USO do filter---------------------------------------|");

		List<String> funcionarios = List.of("Ana", "Bruno", "Carlos", "Amanda");
		List<String> funcionariosLetraA = funcionarios.stream().filter(f -> f.startsWith("A")).collect(Collectors.toList());

		System.out.println(funcionarios);
		System.out.println(funcionariosLetraA);

		System.out.println("\nUSO do map-----------------------------------------|");
		List<Double> valorVendas = List.of(500.0, 1800.0, 6200.0);
		List<Double> comissao = valorVendas.stream().map(v -> v * 0.05).collect(Collectors.toList());
		
		System.out.println(valorVendas);
		System.out.println(comissao);
		
		System.out.println("\nUSO do reduce-----------------------------------------|");
		double totalVendas = valorVendas.stream().reduce(0.0, Double::sum);
		System.out.println("Total vendas: "+totalVendas);
	}

}
