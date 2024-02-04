package streams.filtrar;

public class Aluno {
	
	final String nome;
	final double nota;
	
	public Aluno(String nome, double nota) {
		this.nome = nome;
		this.nota = nota;
	}

	public String getNome() {
		return nome;
	}

	public double getNota() {
		return nota;
	}
	
	public String toString() {
		return nome + " tem nota: " + nota;
	}
}
