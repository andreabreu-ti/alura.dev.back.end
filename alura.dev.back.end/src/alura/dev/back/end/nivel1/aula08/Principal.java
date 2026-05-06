package alura.dev.back.end.nivel1.aula08;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Period;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class Principal {

	public static void main(String[] args) {

		// Manioulando datas

		System.out.println(
				"\nManipulação de datas=============================================================================");
		LocalDate dataCompra = LocalDate.now();
		LocalDate dataPrimeiraParcela = LocalDate.of(2025, 5, 15);
		LocalDate dataSegundaParcela = dataPrimeiraParcela.plusDays(30);

		if (dataPrimeiraParcela.isBefore(LocalDate.now())) {

			System.out.println("Hoje é o dia do vencimento!");

		} else {

			System.out.println("Superior ao dia do vencimento!");
		}

		System.out.println("Data da Compra: " + dataCompra);
		System.out.println("Data Primeira Parcela: " + dataPrimeiraParcela);
		System.out.println("Data Segunda Parcela: " + dataSegundaParcela);

		System.out.println(
				"\nFormatações=======================================================================================");

		DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		System.out.println("Data da Compra formatada: " + dataCompra.format(formato));

		System.out.println(
				"\nFuso horários=====================================================================================");

		ZonedDateTime dataConclusaoCompra = ZonedDateTime.now();
		System.out.println("Data de conclusão da compra formatada: " + dataConclusaoCompra);
		ZonedDateTime dataCompraNy = dataConclusaoCompra.withZoneSameInstant(ZoneId.of("America/New_York"));
		System.out.println("Data de conclusão da compra em Nova York: " + dataCompraNy);

		System.out.println(
				"\nCálculo de diferença entre datas===================================================================");

		LocalTime inicio = LocalTime.of(9, 0);
		LocalTime fim = LocalTime.of(17, 30);

		Duration duracao = Duration.between(inicio, fim);
		System.out.println(
				"A duração do expediente: " + duracao.toHours() + " horas e " + duracao.toMinutesPart() + " minutos.");
		
		LocalDate dataPagamento = LocalDate.parse("2025-10-30");
		Period periodo = Period.between(dataSegundaParcela, dataPagamento);
		System.out.println("Diferença em dias é: "+ periodo.getDays());
		

	}

}
