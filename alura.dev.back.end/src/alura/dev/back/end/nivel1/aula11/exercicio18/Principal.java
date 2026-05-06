package alura.dev.back.end.nivel1.aula11.exercicio18;

public class Principal {

	public static void main(String[] args) {
		
		// 18 - Controle de dispositivos
		
		Luz luz = new Luz();
        ArCondicionado ar = new ArCondicionado();
        
        luz.ligar();
        luz.ligar();
        luz.desligar();
 
        ar.desligar();

	}

}
