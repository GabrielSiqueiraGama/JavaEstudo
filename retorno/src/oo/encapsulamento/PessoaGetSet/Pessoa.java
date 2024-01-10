package oo.encapsulamento.PessoaGetSet;

public class Pessoa {
	
	private int idade;
	
	public Pessoa(int idade) {
		this.idade = idade;
	}
	
	public int getIdade() {
		return idade;
	}
	public void setIdade(int novaIdade) {
		if(novaIdade >= 0) {
			this.idade = novaIdade;
		}else {
			System.out.println("Não é possivel colocar uma idade negativa");
		}
		
	}
}
