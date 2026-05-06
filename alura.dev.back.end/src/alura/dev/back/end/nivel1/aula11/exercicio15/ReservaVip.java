package alura.dev.back.end.nivel1.aula11.exercicio15;

class ReservaVip extends Reserva{

	@Override
    public void reservar() {
        System.out.println("Reserva VIP confirmada com atendimento exclusivo");
    }
}
