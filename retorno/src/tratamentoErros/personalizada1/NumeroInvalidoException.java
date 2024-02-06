package tratamentoErros.personalizada1;

public class NumeroInvalidoException extends RuntimeException {

	private String nomeDoAtributo;
	
	public NumeroInvalidoException(String nomeDoAtributo) {
		this.nomeDoAtributo = nomeDoAtributo;
	}
	
	public String getMessage() {
		return String.format("O atributo %s está invalido", nomeDoAtributo);
	}
	
}
