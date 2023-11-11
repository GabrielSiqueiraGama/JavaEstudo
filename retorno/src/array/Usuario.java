package array;

public class Usuario {
	String nome;
	String email;
	
	public boolean equals(Object objeto) {
		if(objeto instanceof Usuario) {
			Usuario outro = (Usuario) objeto;
			boolean nomeIqual = outro.nome.equals(this.nome) ;
			boolean emailIgual = outro.email.equals(this.email);
		return nomeIqual && emailIgual;
		}else {
			return false;
		}
		
		
	}
}
