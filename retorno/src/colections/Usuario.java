package colections;

import java.util.Objects;

public class Usuario {
	String nome;

	Usuario(String nome){
		this.nome = nome;
	}
	public String toString() {
		return "Meu nome é: " + this.nome;
	}
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return 1;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Usuario other = (Usuario) obj;
		return Objects.equals(nome, other.nome);
	} 
	
}
