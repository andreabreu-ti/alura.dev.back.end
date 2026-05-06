package alura.dev.back.end.nivel1.aula11.exercicio18;

public class ArCondicionado {
	private boolean ligado = false;
	 
    public void ligar() {
        if (!ligado) {
            ligado = true;
            System.out.println("Ar-condicionado ligado.");
        } else {
            System.out.println("Ar-condicionado já está ligado.");
        }
    }
 
    public void desligar() {
        if (ligado) {
            ligado = false;
            System.out.println("Ar-condicionado desligado.");
        } else {
            System.out.println("Ar-condicionado já está desligado.");
        }
    }
}
