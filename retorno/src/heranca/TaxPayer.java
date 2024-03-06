package heranca;

public abstract class TaxPayer {
	private String nome;
	private double anualIncome;
	
	public TaxPayer() {}
	public TaxPayer(String nome, double anualIncome) {
		this.nome = nome;
		this.anualIncome = anualIncome;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getAnualIncome() {
		return anualIncome;
	}
	public void setAnualIncome(double anualIncome) {
		this.anualIncome = anualIncome;
	}
	
	public abstract double Tax();
	
}
