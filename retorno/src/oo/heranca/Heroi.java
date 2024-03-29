package oo.heranca;

public class Heroi extends Jogador{
	
	public Heroi(int x, int y){
		super(x,y);
	}
	
	@Override
	public boolean atacar(Jogador oponente) {//Utilizando herança substituindo os valores dentro da função.
		int deltaX = Math.abs(x - oponente.x);
		int deltaY = Math.abs(y - oponente.y);
		if(deltaX == 0 && deltaY == 1) {
			oponente.vida -= 20;
			return true;
		}else if(deltaX == 1 && deltaY == 0) {
			oponente.vida -= 20;
			return true;
		}else {
			return false;
		}
	}
}
