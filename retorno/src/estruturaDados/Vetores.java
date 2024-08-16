package estruturaDados;

public class Vetores {

	public static void main(String[] args) {
		double [] temperaturas = new double[365];
		
		temperaturas[0] = 12;
		temperaturas[1] = 18;
		temperaturas[2] = 34;
		temperaturas[3] = 22;
		
		System.out.println("O item na posição inicial tem como valor " + temperaturas[0]);
		System.out.println("O tamanho da lista é de: " + temperaturas.length);
		
		for(int i =0; i<temperaturas.length; i++) {
			System.out.println("O item na posição " + i + " tem como valor: " + temperaturas[i]);
		}
	}
}
