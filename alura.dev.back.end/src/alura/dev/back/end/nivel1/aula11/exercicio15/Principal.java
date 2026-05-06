package alura.dev.back.end.nivel1.aula11.exercicio15;

public class Principal {

	public static void main(String[] args) {
		
		//15 - Controle de reservas
		
		Reserva r = new Reserva();
        r.reservar();
        r.reservar("10/04");
        r.reservar("12/04", 4);
 
        Reserva vip = new ReservaVip();
        vip.reservar();
	}
}
