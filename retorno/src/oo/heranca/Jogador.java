package oo.heranca;

public class Jogador {
	int vida = 100;
	int x;
	int y;
	
//	Jogador(){ Fazendo um construtor padrão para herança.
//		this(0,0);
//	}
	Jogador(int x, int y){
		this.x = x;
		this.y = y;
	}
	public boolean atacar(Jogador p2) {
		int deltaX = Math.abs(x - p2.x);//Calcula a distancia entre os jogadores
		int deltaY = Math.abs(y - p2.y);//Caso o numero seja negativo, arredonda p/1
		if(deltaX == 0 && deltaY == 1) {
			p2.vida -= 10;
			return true;
		}else if(deltaX == 1 && deltaY == 0) {
			p2.vida -= 10;
			return true;
		}else {
			return false;
		}
	}
	
	
	public Boolean andar(Direcao direcao) {
		switch(direcao) {
		case NORTE:
			y--;
			break;
		case LESTE:
			x++;
			break;
		case SUL:
			y++;
			break;
		case OESTE:
			x--;
		}
		return true;
	}
	public int getVida() {
		return vida;
	}
	public void setVida(int vida) {
		this.vida = vida;
	}
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	
	
	
}
