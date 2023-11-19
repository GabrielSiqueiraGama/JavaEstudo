package outro;

public class SubString {
	public static void main(String[] args) {
		String original = "Exemplo de String";

		// Usando substring(int beginIndex)
		String substring1 = original.substring(9); // Imprime a partir da 9 casa decimal

		// Usando substring(int beginIndex, int endIndex)
		String substring2 = original.substring(8, 10); // imprime apenas as casas decimais entre 8 e 10. 

		System.out.println(substring1);
		System.out.println(substring2);

	}
}
