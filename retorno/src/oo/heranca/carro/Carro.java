package oo.heranca.carro;

public class Carro {
	
	final int VELOCIDADE_MAXIMA;
	int velocidade;
	int valor = 5;
	
	Carro(int velocidadeMaxima){
		VELOCIDADE_MAXIMA = velocidadeMaxima;
	}
	
	void acelerar() {
		if(velocidade + valor > VELOCIDADE_MAXIMA) {
			velocidade = VELOCIDADE_MAXIMA;
		}else {
			velocidade += valor;
		}
		
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
