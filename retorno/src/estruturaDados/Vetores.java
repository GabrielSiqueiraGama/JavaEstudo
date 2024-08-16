package estruturaDados;

public class Vetores {
	double [] temperaturas;

	public Vetores(int capacidade) {
		this.temperaturas = new double[capacidade];
	}
	
	public void adicionar(double temperatura) {
		for(int i = 0; i <this.temperaturas.length; i++) {
			if(this.temperaturas[i] == 0) {
				this.temperaturas[i] = temperatura;
			}
		}
	}
}
