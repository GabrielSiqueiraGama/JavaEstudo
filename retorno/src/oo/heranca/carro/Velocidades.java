package oo.heranca.carro;

public class Velocidades {
	public static void main(String[] args) {
		Carro ferrari = new Ferrari();
		ferrari.velocidade = 0;
		ferrari.acelerar();
		ferrari.acelerar();
		System.out.println(ferrari.velocidade);
		ferrari.frear();
		System.out.println(ferrari.velocidade);
		
		Carro fusca = new Fusca();
		fusca.velocidade = 10;
		fusca.acelerar();
		fusca.acelerar();
		fusca.frear();
		fusca.frear();
		fusca.frear();
		fusca.frear();
		
		System.out.println(fusca.velocidade);
	}
}
