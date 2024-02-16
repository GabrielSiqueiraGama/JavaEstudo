package observer.aniversarioSurpresa;

import java.util.Date;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Porteiro extends Thread{

	private List<ChegadaAniversarianteObserver> observers = new ArrayList<ChegadaAniversarianteObserver>();
	
	public void addChegadaAniversarianteObserver(ChegadaAniversarianteObserver observer) {
		this.observers.add(observer);
	}
	
	@Override
	public void run() {
		@SuppressWarnings("resource")
		Scanner scn = new Scanner(System.in);
		
		while(true) {
			int valor = scn.nextInt();
			
			if(valor == 1) {
				ChegadaAniversarianteEvent event
				= new ChegadaAniversarianteEvent(new Date());
				
				for(ChegadaAniversarianteObserver observer: this.observers) {
					observer.chegou(event);
				}
			}else {
				System.out.print("error");
			}
		}
	}
	
}
