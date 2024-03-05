package datas;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class CalculoDataHora {

	public static void main(String[] args) {

		LocalDate d04 = LocalDate.parse("2022-07-20");
		LocalDateTime d05 = LocalDateTime.parse("2022-07-20T01:30:26");
		Instant d06 = Instant.parse("2022-07-20T01:30:26Z");
		
		LocalDate pastWeek = d04.minusDays(7);
		LocalDate nextWeek = d04.plusDays(7);
		
		LocalDateTime pastWeekTime = d05.minusDays(7);
		Instant pastWeekInstant = d06.minus(7, ChronoUnit.DAYS);
		
		System.out.println("Semana passada: " + pastWeek +
				"\nSemana passada com hora: " + pastWeekTime +
				"\nSemana que vem: " + nextWeek +
				"\nSemana que vem no instante: " + pastWeekInstant);
		
		Duration t1 = Duration.between(pastWeekTime, d05);
		System.out.println(t1.toDays());
	
	}
}	
