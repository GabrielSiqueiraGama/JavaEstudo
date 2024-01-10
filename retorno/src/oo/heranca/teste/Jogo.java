package oo.heranca.teste;

import oo.heranca.Heroi;
import oo.heranca.Monstro;

public class Jogo {
	public static void main(String[] args) {
		Heroi heroi = new Heroi(10, 10);
		
		Monstro monstro = new Monstro();
		monstro.setX(10);
		monstro.setY(11);
		
		System.out.println(heroi.getVida());
		System.out.println(monstro.getVida());
		
		heroi.atacar(monstro);
		heroi.atacar(monstro);
		monstro.atacar(heroi);
		monstro.atacar(heroi);
		
		System.out.println("Vida do heroi: " + heroi.getVida());
		System.out.println("Vida do monstro: " + monstro.getVida());
	}
}
