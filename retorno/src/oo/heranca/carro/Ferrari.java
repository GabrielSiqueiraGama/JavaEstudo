package oo.heranca.carro;

public class Ferrari extends Carro{
	
	public Ferrari(){
		this(315);
	}
	
	public Ferrari(int VelocidadeMaxima){
		super(VelocidadeMaxima);
		valor = 10;//usando o super não se faz mais necessaria o uso da função abaixo;
	}
//	@Override
//	void acelerar() {
//		velocidade += 10;
//	}
}
