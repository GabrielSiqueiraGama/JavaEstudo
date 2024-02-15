package oo.inicio;

import java.util.Scanner;

public class TesteData {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scn = new Scanner(System.in);
		
		Dataa d1 = new Dataa();
		Dataa d2 = new Dataa();
		System.out.println("Digite a data: ");
		d1.dia = scn.nextInt();
		System.out.println("Digite o mês: ");
		d1.mes = scn.nextInt();
		System.out.println("Digite o ano: ");
		d1.ano = scn.nextInt();
		
		d2.dia = 7;
		d2.mes = 11;
		d2.ano = 2003;
		
		d1.imprimirData();
		
		System.out.printf("%d/%d/%d\n", d2.dia, d2.mes, d2.ano);
	}
}
