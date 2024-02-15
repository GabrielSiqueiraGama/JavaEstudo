package oo.polimorfismo;

public class Jantar {

	@SuppressWarnings("unused")
	public static void main(String[] args) {

		PessoaPolimorfismo convidado = new PessoaPolimorfismo(99.60);
		
		Ovo ingrediente1 = new Ovo(0.2);
		Frango ingrdiente2 = new Frango(0.2);
		Macarrao igrediente3 = new Macarrao(0.2);
		//Comida igrediente4 = new Comida(0.2); Utilizando o Abstract essa função generica é impedida de ser realizada
		
		
	}

}
