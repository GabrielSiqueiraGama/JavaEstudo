package array;

import java.util.Arrays;

public class NotasArray {
	public static void main(String[] args) {
		double notasAluno [] = new double[3];
		notasAluno[0] = 6.0;
		notasAluno[1] = 7.0;
		notasAluno[2] = 5.0;
		System.out.println(Arrays.toString(notasAluno));
		double total = 0;
		for(int i =0; i < notasAluno.length; i++ ) {
			total += notasAluno[i];
		}
		System.out.println(total/4);
	}
}
