package oo.heranca.teste;

import oo.heranca.carro.Carro;
import oo.heranca.carro.Ferrari;
import oo.heranca.carro.Fusca;

public class Velocidades {
	public static void main(String[] args) {
		
		Ferrari ferrari = new Ferrari(320);
		
		System.out.println(ferrari.getVELOCIDADE_MAXIMA());
		
		ferrari.setVelocidade(0);;
		ferrari.ligarTurbo();
		ferrari.acelerar();//Como a função herda uma função adaptada, o valor da variavel é diferente no momento em que a chamada é realizada
		ferrari.ligarAr();
		ferrari.acelerar();
		
		
		System.out.println("Ferrari: " + ferrari.getVelocidade());
		
		ferrari.frear();
		
		System.out.println("Ferrari: " + ferrari.getVelocidade());
		
		Carro fusca = new Fusca();
		
		fusca.setVelocidade(10);;
		fusca.acelerar();
		fusca.acelerar();//Aqui a variavel adiciona apenas +5 em cada vez que é chamada
		fusca.frear();
		
		System.out.println("Fusca: " + fusca.getVelocidade());
	}
}
