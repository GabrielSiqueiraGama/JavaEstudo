package oo.heranca.carro;

public class Carro {
	
	public final int VELOCIDADE_MAXIMA;
	public int velocidade;
	protected int valor = 5;
	
	Carro(int velocidadeMaxima){
		VELOCIDADE_MAXIMA = velocidadeMaxima;
	}
	
	public void acelerar() {
		if(velocidade + valor > VELOCIDADE_MAXIMA) {
			velocidade = VELOCIDADE_MAXIMA;
		}else {
			velocidade += valor;
		}
		
	}
	public boolean frear() {
		if(velocidade > 0) {
			velocidade -= 5;
			return true;
		}else {
			return false;
		}
	}
}
