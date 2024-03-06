package heranca;

public class Company extends TaxPayer{
	private Integer numberOfEmployees;
	
	public Company() {}
	
	public Company(String nome, double anualIncome, Integer numberOfEmployees) {
		super(nome, anualIncome);
		this.numberOfEmployees = numberOfEmployees;
	}
	public Integer getNumberOfEmployees() {
		return numberOfEmployees;
	}
	public void setNumberOfEmployees(Integer numberOfEmployees) {
		this.numberOfEmployees = numberOfEmployees;
	}
	@Override
	public double Tax() {
		if(numberOfEmployees > 10) {
			return getAnualIncome() * 0.14;
		}else {
			return getAnualIncome() * 0.16;
		}
	}
}
