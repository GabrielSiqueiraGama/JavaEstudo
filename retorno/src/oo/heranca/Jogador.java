package oo.heranca;

public class Jogador {
	int x;
	int y;
	
	Boolean andar(Direcao direcao) {
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
}
