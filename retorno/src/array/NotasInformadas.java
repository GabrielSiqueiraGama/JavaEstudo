package array;

import java.util.Scanner;

public class NotasInformadas {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Quantas notas deseja digitar?");
		int x = scn.nextInt();
		double notas [] = new double[x];
		for(int i = 0; i <notas.length; i++) {
			System.out.println("Digite a nota " + (i + 1) + ": ");
			notas[i] = scn.nextDouble();
		}
		double total = 0;
		for(double nota: notas) {
			total = total + nota;
		}
		System.out.println("A soma total das notas foi de: " + total);
		System.out.println("A média final foi: " + total/3);
	}
}
