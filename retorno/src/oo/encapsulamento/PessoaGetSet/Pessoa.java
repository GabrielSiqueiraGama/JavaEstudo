package oo.encapsulamento.PessoaGetSet;

public class Pessoa {
	
	private String nome;
	private int idade;
	
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Pessoa(String nome, int idade) {
		setIdade(idade);
		setNome(nome);
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
	
	@Override
	public String toString() {
		return "Olá, eu sou o " + getNome()
		+ "e tenho " + getIdade() + "anos.";
	}
	
}
