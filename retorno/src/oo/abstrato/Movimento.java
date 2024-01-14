package oo.abstrato;

public class Movimento {
	
	
	public static void main(String[] args) {
		Animal a = new Cachorro();
		
		System.out.println("A forma pela qual o cachorro anda é: " + a.mover());
	}
	
}
