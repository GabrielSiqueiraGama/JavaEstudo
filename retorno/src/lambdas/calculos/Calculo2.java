package lambdas.calculos;

import java.util.Scanner;
import java.util.function.BinaryOperator;

public class Calculo2 {
	
	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		//Não se tem mais a função executar por não chamar a Classe
		BinaryOperator<Double> calculo = (a, b) ->{return a + b; };
		double x = scn.nextDouble();
		double y = scn.nextDouble();
		System.out.println(calculo.apply(x, y));
		
		calculo = (a,b) -> a * b;
		System.out.println(calculo.apply(1.0, 2.0));
	}
}
