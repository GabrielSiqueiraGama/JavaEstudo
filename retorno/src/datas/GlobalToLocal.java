package datas;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;

public class GlobalToLocal {

	public static void main(String[] args) {
		
		LocalDate d04 = LocalDate.parse("2022-07-20");
		LocalDateTime d05 = LocalDateTime.parse("2022-07-20T01:30:26");
		Instant d06 = Instant.parse("2022-07-20T01:30:26Z");
		
//		for(String zonas: ZoneId.getAvailableZoneIds()) {
//			System.out.println(zonas);
//		}
		LocalDateTime resultado1 = LocalDateTime.ofInstant(d06, ZoneId.systemDefault());
		LocalDate resultado2 = LocalDate.ofInstant(d06, ZoneId.of("Portugal"));
		
		System.out.println("Aqui são três horas de diferença de Londres(z) para o Brasil: " 
		+ "\n" + resultado1);
		System.out.println("Portugal: \n" + resultado2);
		
		System.out.println("Dia do mês: " + d04.getDayOfMonth());
		System.out.println("Mês: " + d05.getMonthValue());
	}
	
}
