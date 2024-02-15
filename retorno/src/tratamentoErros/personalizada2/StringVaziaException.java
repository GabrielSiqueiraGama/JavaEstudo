package tratamentoErros.personalizada2;

public class StringVaziaException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String nomeDoAtributo;
	
	public StringVaziaException(String nomeDoAtributo) {
		this.nomeDoAtributo = nomeDoAtributo;
	}
	
	public String getMessage() {
		return String.format("O atributo %s está vazio", nomeDoAtributo);
	}
	
}
