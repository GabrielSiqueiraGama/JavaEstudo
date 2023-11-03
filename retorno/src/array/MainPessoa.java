package array;

import java.util.ArrayList;

public class MainPessoa {
	public static void main(String[] args) {
		ArrayList<Pessoa> listaDePessoas = new ArrayList<>();
		Pessoa zhant = new Pessoa();
		zhant.setNome("Zhant Siqueira Gama");
		zhant.setIdade(19);
		
		Pessoa gabriel = new Pessoa();
		gabriel.setIdade(19);
		gabriel.setNome("Gabriel Siqueira Gama");
		
		listaDePessoas.add(gabriel);
		listaDePessoas.add(zhant);
		
		for(int i = 0; i <listaDePessoas.size(); i++) {
			System.out.println("Nome: " + listaDePessoas.get(i).getNome() +
					" e idade: " + listaDePessoas.get(i).getIdade());
		}
	}
}
