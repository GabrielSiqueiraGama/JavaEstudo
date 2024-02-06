package tratamentoErros;

import java.util.Scanner;

public class Finalmente {

	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		
		try {
			System.out.println(7 / scn.nextInt());
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}finally {
			System.out.println("Scanner fechado");
			scn.close();
		}
		
	}
	
}
