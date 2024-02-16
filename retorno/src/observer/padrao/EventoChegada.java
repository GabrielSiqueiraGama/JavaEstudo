package observer.padrao;

import java.util.Date;

public class EventoChegada {

	private final Date momento;

	public EventoChegada(Date momento) {
		super();
		this.momento = momento;
	}

	public Date getMomento() {
		return momento;
	}
	
	
	
}
