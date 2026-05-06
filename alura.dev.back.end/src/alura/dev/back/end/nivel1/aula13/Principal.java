package alura.dev.back.end.nivel1.aula13;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Principal {

	public static void main(String[] args) {
		
		System.out.println("USO do List---------------------------------------|");

		List<String> funcionarios = new ArrayList<>();
		funcionarios.add("João");
		funcionarios.add("Maria");
		funcionarios.add("João");
		System.out.println(funcionarios);
		System.out.println(funcionarios.get(1));
		
		System.out.println("\nUSO do Set----------------------------------------|");
		Set<String> produtos = new HashSet<>();
		produtos.add("Agua");
		produtos.add("Coca Cola");
		produtos.add("Agua");
		System.out.println(produtos);
		
		System.out.println("\nUSO do Map----------------------------------------|");
		Map<Integer, String> clientes = new HashMap<>();
		clientes.put(1, "Maria");
		clientes.put(2, "Marcos");
		clientes.put(3, "Ana");
		System.out.println(clientes);
		System.out.println(clientes.get(2));
	}

}
