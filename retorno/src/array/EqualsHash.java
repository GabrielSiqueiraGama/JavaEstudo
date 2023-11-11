package array;

import java.util.Scanner;

public class EqualsHash {
	public static void main(String[] args) {
		Usuario u1 = new Usuario();
			u1.nome = "zhant";
			u1.email= "zhant@gmail.com";
		Usuario u2 = new Usuario();
			u2.nome = "zhant";
			u2.email= "zhant@gmail.com";
		System.out.println(u1 == u2);
		System.out.println(u1.equals(u2));
		System.out.println(u1.nome.equals(u2.nome));
		
	}
}
