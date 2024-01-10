package oo.heranca.teste;

import oo.heranca.carro.Carro;
import oo.heranca.carro.Ferrari;
import oo.heranca.carro.Fusca;

public class Velocidades {
	public static void main(String[] args) {
		Carro ferrari = new Ferrari(320);
		System.out.println(ferrari.VELOCIDADE_MAXIMA);
		ferrari.velocidade = 0;
		ferrari.acelerar();//Como a função herda uma função adaptada, o valor da variavel é diferente no momento em que a chamada é realizada
		ferrari.acelerar();
		System.out.println("Ferrari: " + ferrari.velocidade);
		ferrari.frear();
		System.out.println("Ferrari: " + ferrari.velocidade);
		
		Carro fusca = new Fusca();
		fusca.velocidade = 10;
		fusca.acelerar();
		fusca.acelerar();//Aqui a variavel adiciona apenas +5 em cada vez que é chamada
		fusca.frear();
		
		System.out.println("Fusca: " + fusca.velocidade);
	}
}
