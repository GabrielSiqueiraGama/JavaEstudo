package heranca;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class TaxCalculation {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		System.out.println("Enter the number of taxpayers: ");
		List<TaxPayer> listPayers = new ArrayList<TaxPayer>();
		int N = scn.nextInt();
		
		for(int i = 1; i <= N; i++) {
			System.out.println("Taxpayer: " + i);
			System.out.println("Individual or company? (i/c)");
			char type = scn.next().charAt(0);
			System.out.println("Nome: ");
			String name = scn.next();
			System.out.println("Anual Income> ");
			Double anualIncome = scn.nextDouble();
			if(type == 'i') {
				System.out.println("Health expenditures: ");
				Double healthExpenditures = scn.nextDouble();
				listPayers.add(new Individual(name, anualIncome, healthExpenditures));
			}else {
				System.out.println("Number of employees: ");
				int numberOfEmployees = scn.nextInt();
				listPayers.add(new Company(name, anualIncome, numberOfEmployees));
			}
			
		}
		System.out.println();
		System.out.println("Taxes paid");
		for(TaxPayer tp: listPayers) {
			System.out.println(tp.getNome() + ": $ " + String.format("%.2f", tp.Tax()));
		}


		scn.close();
	}
	
}
