package tratamentoErros.personalizada2;

public class NumeroInvalidoException extends Exception {

	private String nomeDoAtributo;
	
	public NumeroInvalidoException(String nomeDoAtributo) {
		this.nomeDoAtributo = nomeDoAtributo;
	}
	
	public String getMessage() {
		return String.format("O atributo %s está invalido", nomeDoAtributo);
	}
	
}
