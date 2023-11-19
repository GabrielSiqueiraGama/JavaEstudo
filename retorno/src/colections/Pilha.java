package colections;

import java.util.ArrayDeque;
import java.util.Deque;

public class Pilha {
	public static void main(String[] args) {
		Deque<String> livros = new ArrayDeque<>();
		livros.add("O pequeno principe");
		livros.push("Rapaz, ele tá sem sap");
		
		System.out.println(livros.peek());
		
		
	}
	
}
