package array;

public class Foreach {
	public static void main(String[] args) {
		double notas [] = {7.0, 6.0, 6.0};
		for(int i = 0; i < notas.length; i++) {
			System.out.println(notas[i]);
		}
		System.out.println();
		for(double nota: notas) {
			System.out.println(nota);
		}
	}
}
