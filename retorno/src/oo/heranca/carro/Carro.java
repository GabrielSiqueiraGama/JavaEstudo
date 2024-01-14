package oo.heranca.carro;

public class Carro {
	
	final int VELOCIDADE_MAXIMA;
	int velocidade;
	private int valor = 5;
	
	Carro(int velocidadeMaxima){
		VELOCIDADE_MAXIMA = velocidadeMaxima;
	}
	
	public void acelerar() {
		if(velocidade + getValor() > VELOCIDADE_MAXIMA) {
			velocidade = VELOCIDADE_MAXIMA;
		}else {
			velocidade += getValor();
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

	public int getVelocidade() {
		return velocidade;
	}

	public void setVelocidade(int velocidade) {
		this.velocidade = velocidade;
	}

	public int getVELOCIDADE_MAXIMA() {
		return VELOCIDADE_MAXIMA;
	}

	public int getValor() {
		return valor;
	}

	public void setValor(int valor) {
		this.valor = valor;
	}
	
	
	
}
