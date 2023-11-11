package array;

import java.util.Arrays;
import java.util.Scanner;

public class MatrizEh {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Digite a quantidade de alunos: ");
		int qtdAlunos = scn.nextInt();
		System.out.println("Digite a quantidade de notas por aluno: ");
		int qtdNotas = scn.nextInt();
		
		double notas[][] = new double[qtdAlunos][qtdNotas];
		double total = 0;
		for(int a =0; a<notas.length;a++) {
			for(int n =0; n<notas[a].length;n++) {//a = aluno n = nota
				System.out.printf("Informe a nota %d do aluno %d: ", n + 1, a + 1);
				notas[a][n] = scn.nextDouble();
				total += notas[a][n];
			}
		}
		//foreach
		for(double [] notasDosAlunos: notas) {
			System.out.println(Arrays.toString(notasDosAlunos));
		}
		double media = total / (qtdAlunos * qtdNotas);
		System.out.println("Média da turma é: " + media);
	}
}
