package colections;

import java.util.LinkedList;
import java.util.Queue;

public class Fila {
	public static void main(String[] args) {
		Queue<String> fila = new LinkedList<>();
		fila.add("Zhant");
		fila.offer("Bluiz");
		fila.offer("Red light");
		fila.offer("Guilherme");
		fila.offer("Dany");
		
		System.out.println(fila.peek());//retorna o primeiro);
		System.out.println(fila.element());//caso a fila esteja vazia vai jogar
		//exception;
		System.out.println(fila.poll());//retorna o primeiro já removendo;
		
		
	}
}
