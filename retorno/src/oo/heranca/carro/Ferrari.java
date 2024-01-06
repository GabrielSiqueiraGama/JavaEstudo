package oo.heranca.carro;

public class Ferrari extends Carro{
	boolean acelerar() {
		boolean acelerar1 = super.acelerar();
		boolean acelerar2 = super.acelerar();
		return acelerar1 || acelerar2;
	}
}
