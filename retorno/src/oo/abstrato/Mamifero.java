package oo.abstrato;

public abstract class Mamifero extends Animal{

	@Override
	public String mover() {
		return "Andando";
	}
	public abstract String mamar();
}
