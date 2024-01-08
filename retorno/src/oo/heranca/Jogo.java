package oo.heranca;

public class Jogo {
	public static void main(String[] args) {
		Heroi heroi = new Heroi(10, 10);
		
		Monstro monstro = new Monstro();
		monstro.x = 10;
		monstro.y = 11;
		
		System.out.println(heroi.vida);
		System.out.println(monstro.vida);
		
		heroi.atacar(monstro);
		heroi.atacar(monstro);
		monstro.atacar(heroi);
		monstro.atacar(heroi);
		
		System.out.println("Vida do heroi: " + heroi.vida);
		System.out.println("Vida do monstro: " + monstro.vida);
	}
}
