package lambdas.interfaces.consumidor;

public class Usuario {
	final String nome;

	public Usuario(String nome) {
		this.nome = nome;
	}
	public void printNome(){
		System.out.println(nome);
	}
	public String toString() {
		return "Nome do usuario é: " + nome;
	}
}
