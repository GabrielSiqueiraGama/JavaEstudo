package fundamentos;

import javax.swing.JOptionPane;

/**
 * @author Gabriel Siqueira Gama <siqueiragamagabriel@gmail.com>
 */
public class Volta {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String valor1 = JOptionPane.showInputDialog("Digite um valor no formato double: ");
		String valor2 = JOptionPane.showInputDialog("Digite um valor no formato double: ");
		System.out.println(valor1 + valor2);
		
		double numero1 = Double.parseDouble(valor1);
		double numero2 = Double.parseDouble(valor2);
		
		double soma = numero1 + numero2;
		System.out.println("Resultado da soma é: " + soma);
		System.out.println("Média é: " + soma/2);
	}

}
