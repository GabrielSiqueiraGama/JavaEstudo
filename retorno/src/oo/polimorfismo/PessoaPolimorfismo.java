package oo.polimorfismo;

public class PessoaPolimorfismo {//Não há herança aqui por questão de contexto.
	
	private double peso;
	
	public PessoaPolimorfismo(double peso) {
		setPeso(peso);
	}
	
	public void comer(Comida comida) {
		this.peso += comida.getPeso();
	}
	
	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		if(peso > 0) {
			this.peso = peso;
		}else {
			System.out.println("Peso invalido.");
		}
	}
	
}
