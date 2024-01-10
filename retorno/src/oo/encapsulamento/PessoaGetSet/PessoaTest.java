package oo.encapsulamento.PessoaGetSet;

public class PessoaTest {

	public static void main(String[] args) {

		Pessoa p1 = new Pessoa(18);
		p1.setIdade(19);
		
		System.out.println(p1.getIdade());

	}

}
