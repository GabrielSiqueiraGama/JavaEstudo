package outro;

import java.util.*;
import java.util.PriorityQueue;
import java.util.Scanner;

public class CharadaLexiconia {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Entrada da string
        String s = scanner.nextLine();

        // Entrada do inteiro K
        int k = scanner.nextInt();

        // Chamando a função para resolver a charada
        String resultado = resolverCharada(s, k);

        // Imprimindo o resultado
        System.out.println(resultado);
    }

    private static String resolverCharada(String s, int k) {
        // Convertendo a string para um array de caracteres para facilitar a manipulação
        char[] charArray = s.toCharArray();

        // Criando uma PriorityQueue para manter os caracteres em ordem lexicográfica
        PriorityQueue<Character> pq = new PriorityQueue<>();

        // Adicionando os caracteres à PriorityQueue
        for (char c : charArray) {
            pq.add(c);
        }

        // Construindo a string resultante
        StringBuilder resultado = new StringBuilder();

        // Iterando sobre a string original
        for (int i = 0; i < charArray.length; i++) {
            // Obtendo o próximo caractere lexicograficamente mínimo
            char minChar = pq.poll();

            // Atualizando a string resultante
            resultado.append(minChar);

            // Adicionando o próximo caractere ao final da PriorityQueue
            if (i + k < charArray.length) {
                pq.add(charArray[i + k]);
            }
        }

        // Convertendo o StringBuilder resultante de volta para uma string
        return resultado.toString();
    }
}
