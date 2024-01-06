package oo.heranca.carro;

public class Carro {
	int velocidade;
	void acelerar() {
		velocidade += 5;
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
