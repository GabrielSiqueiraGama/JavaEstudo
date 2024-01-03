package oo.heranca;

public class Jogo {
	public static void main(String[] args) {
		Jogador p1 = new Heroi();
		p1.x = 10;
		p1.y = 10;
		
		Jogador p2 = new Monstro();
		p2.x = 10;
		p2.y = 11;
		
		System.out.println(p1.vida);
		System.out.println(p2.vida);
		
		p1.atacar(p2);
		p2.atacar(p1);
		p2.atacar(p1);
		
		System.out.println(p1.vida);
		System.out.println(p2.vida);
	}
}
