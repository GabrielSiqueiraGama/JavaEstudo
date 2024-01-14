package oo.heranca.carro;

public class Ferrari extends Carro implements Esportivo, Luxo{
	
	boolean ligarTurbo;
	boolean ligarAr;
	
	public Ferrari(){
		this(315);
	}
	
	public Ferrari(int VelocidadeMaxima){
		super(VelocidadeMaxima);
		setValor(10);//usando o super não se faz mais necessaria o uso da função abaixo;
	}
//	@Override
//	void acelerar() {
//		velocidade += 10;
//	}

	@Override
	public void ligarTurbo() {
		ligarTurbo = true;
	}

	@Override
	public void desligarTurbo() {
		ligarTurbo = false;
	}

	@Override
	public void ligarAr() {
		ligarAr = true;
	}

	@Override
	public void desligarAr() {
		ligarAr = false;
	}
	public int getValor() {
		if(ligarTurbo && ligarAr) {
			return 35;
		}else if (ligarTurbo && ligarAr) {
			return 30;
		}else if(!ligarTurbo && !ligarAr) {
			return 20;
		}else {
			return 15;
		}
	}
}
