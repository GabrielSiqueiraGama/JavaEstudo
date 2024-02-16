package observer.aniversarioSurpresa;

public class Namorada implements ChegadaAniversarianteObserver{

	public void chegou(ChegadaAniversarianteEvent event) {
		System.out.println("Silencio");
		System.out.println("Apagar as luzes");
		System.out.println("Surpresa ");
	}
	
}
