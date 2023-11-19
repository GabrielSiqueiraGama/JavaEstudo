package outro;
import java.util.Scanner;
//Após um periodo realizando trabalho em um orgão beneficente identifiquei um problema.
//manualmente eles precisam dar entrada em centenas de notas fiscais no site do governo.
//Onde existe um padrão, em que uma parte do começo do link é removida e o final também.
//mantendo apenas o numero principal para cadastro. 
public class ReplaceDuplo {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);


        System.out.print("Digite a URL: ");
        String inputURL = scn.nextLine();

        scn.close();

        // Encontra a primeira parte do codigo que precisa ser excluida. 
        int startIndex = inputURL.indexOf("https://nfce.sefaz.gov.br/portal/consultarNFCE.jsp?p=");

        if (startIndex != -1) {
            // Avança para o próximo caractere após "p="
            startIndex += "https://nfce.sefaz.gov.br/portal/consultarNFCE.jsp?p=".length();

            // Encontra o índice do caractere "|" a partir do índice inicial
            int endIndex = inputURL.indexOf("|", startIndex);

            if (endIndex != -1) {
                // Extrai e imprime o número
                String extractedNumber = inputURL.substring(startIndex, endIndex);
                System.out.println("Número extraído: " + extractedNumber);
                return;
            }
        }

        System.out.println("Número não encontrado na URL.");
    }
}
