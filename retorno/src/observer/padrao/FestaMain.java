package observer.padrao;

public class FestaMain {

	public static void main(String[] args) {
		
		Namorada namorada = new Namorada();
		PorteiroSubject porteiro = new PorteiroSubject();
		
		porteiro.registrarObservador(namorada);
		porteiro.registrarObservador(e -> {
		System.out.println(e.getMomento());	
		System.out.println("SIM");
		});
		porteiro.registrarObservador(e -> System.out.println("SIM"));
		porteiro.monitorar();
		
	}
	
}
