package observer.padrao;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class PorteiroSubject {

	private List<ObservadorChegadaAniversariante> observadores 
		= new ArrayList<>();
	
	public void registrarObservador(ObservadorChegadaAniversariante observador) {
		observadores.add(observador);
	}
	
	public void monitorar() {
		
		Scanner scn = new Scanner(System.in);
		
		String valor = "";
		
		System.out.println("Aniversariante chegou? [S/n]");
		valor = scn.nextLine();
		if("S".equalsIgnoreCase(valor)) {
			EventoChegada evento = new EventoChegada(new Date());
			
			observadores.stream().forEach(o -> o.chegou(evento));
		}else {
			System.out.println("Alarme falso");
		}
		
	scn.close();
	}
	
}
