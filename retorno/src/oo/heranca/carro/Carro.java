package oo.heranca.carro;

public class Carro {
	int velocidade;
	boolean acelerar() {
		velocidade += 5;
		return true;
	}
	boolean frear() {
		if(velocidade > 0) {
			velocidade -= 5;
			return true;
		}else {
			return false;
		}
	}
}
