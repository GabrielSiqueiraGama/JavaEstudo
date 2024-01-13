package oo.encapsulamento.PessoaGetSet;

public class PessoaTest {

	public static void main(String[] args) {

		Pessoa p1 = new Pessoa("Gabriel", 18);
		p1.setIdade(-1);
		
		System.out.println(p1.getIdade());
		System.out.println(p1);

	}

}
