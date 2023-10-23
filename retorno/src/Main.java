import java.util.Locale;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String product1 = "Computer";
		String product2 = "Office desk";
		
		int age = 30;
		int code = 5290;
		char gender = 'F';
		
		double price1 = 2100.00;
		double price2 = 650.50;
		double measure = 53.234567;
		
		System.out.println("Products: ");
		System.out.println(product1 + ", wich price is $" + price1);
		System.out.printf("%s, wich price is $ %2f%n", product2, price2);
		
		System.out.printf("Record: %d years old, cod %d and gender: %s%n", age, code, gender);
		System.out.printf("Measue with eight decimal places: %.8f %n", measure);
		System.out.printf("Rouded (decimal places): %.3f %n", measure);
		Locale.setDefault(Locale.US);
		System.out.printf("Rouded (decimal places): %.3f %n", measure);
	}

}
