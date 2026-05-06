package alura.dev.back.end.nivel1.aula04.screenmatch.principal;

import com.google.gson.Gson;

public class TesteGson {

	public static void main(String[] args) {
	
		// TODO Auto-generated method stub
		
		Gson gson = new Gson();
		
		String json = gson.toJson("Teste");
		System.out.println(json);

	}

}
