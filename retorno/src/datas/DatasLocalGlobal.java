package datas;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class DatasLocalGlobal {
	
	public static void main(String[] args) {
		
		//Datas do instante.
		LocalDate hoje = LocalDate.now();
		LocalDateTime hojeComHoras = LocalDateTime.now();
		Instant hojeGlobal = Instant.now();
		
		System.out.println(hoje);//Utilizado para pegar a data atual do sistema
		System.out.println(hojeComHoras);//Utilizado para pegar a data do sistema atual com as horas
		System.out.println(hojeGlobal);//Utilizado para pegar a hora global a partir do ponto zero(Londres)
		
		//Datas formato ISO8601
		LocalDate hojePrint = LocalDate.parse("2022-07-20");
		LocalDateTime hojePrintHora = LocalDateTime.parse("2022-07-20T22:28:36");
		Instant horaLugarDiferente = Instant.parse("2022-07-20T22:28:36Z");
		Instant horaLugarDiferente2 = Instant.parse("2022-07-20T22:28:36Z");
		Instant horaCalculoZone = Instant.parse("2022-07-20T22:28:36-03:00");
		
		System.out.println(hojePrint);//Utilizado para quando deseja digitar a data seguindo este formato
		System.out.println(hojePrintHora);//Utilizado para quando deseja digitar a data com hora
		System.out.println( horaLugarDiferente);//Utilizado para quando deseja digitar a data com hora e o programa calcula o horario no local
		System.out.println(horaCalculoZone);//Utilizando para quando deseja digitar a data com hora e o programa calcula o timezone com a diferença do tempo especificado
		
		//Datas de acordo com a forma inserida
		
		DateTimeFormatter formato1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		DateTimeFormatter formato2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
		LocalDate dataFormato1 = LocalDate.parse("07/11/2023", formato1);
		LocalDateTime dataFormato2 = LocalDateTime.parse("07/11/2023 22:30", formato2);
		LocalDate dataInsert = LocalDate.of(2024, 11, 7);
		System.out.println(dataFormato1);//imprime a data no formato USA		
		System.out.println(dataFormato2.toString());
		System.out.println(dataInsert);
		
		//Datas personalizadas
		DateTimeFormatter formatoBr = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		DateTimeFormatter formatoBrHora = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
		DateTimeFormatter formatoBrHoraG = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm").withZone(ZoneId.systemDefault());
		System.out.println(hojePrint.format(formatoBr));//Imprimindo de acordo com a data no formato brasileiro
		System.out.println(formatoBrHora.format(hojePrintHora));
		System.out.println(formatoBrHoraG.format(horaLugarDiferente2));
	}
	
}
