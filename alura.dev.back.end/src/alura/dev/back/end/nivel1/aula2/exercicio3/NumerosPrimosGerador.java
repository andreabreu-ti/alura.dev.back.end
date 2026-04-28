package alura.dev.back.end.nivel1.aula2.exercicio3;

public class NumerosPrimosGerador extends NumerosPrimos{

	 public int gerarProximoPrimo(int ultimoPrimoConhecido) {
	        int proximoNumero = ultimoPrimoConhecido + 1;
	        while (!verificarPrimalidade(proximoNumero)) {
	            proximoNumero++;
	        }
	        return proximoNumero;
	    }
}
