package streams.reducee;

public class MediaMain {

	public static void main(String[] args) {
		
		Media m1 = new Media().adicionar(7.5).adicionar(6.5);
		Media m2 = new Media().adicionar(4).adicionar(10.0);
		
		System.out.println(m2.getValor());
		
		System.out.println(Media.combinar(m1, m2).getValor());
		
	}
	
}
