package orientacaoObjeto.comida;

import java.util.Scanner;

public class Jantar {
	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner scn = new Scanner(System.in);
		Comida c2 = new Comida("Feijão", 0.140);
		
		System.out.println("Digite seu nome: ");
		String nome = scn.nextLine();
		System.out.println("Digite seu peso: ");
		double peso = scn.nextDouble();
		Pessoa p = new Pessoa(nome, peso);
		System.out.println(p.apresentar());
		p.comer(c2);
		System.out.println(p.apresentar());
	}
}
