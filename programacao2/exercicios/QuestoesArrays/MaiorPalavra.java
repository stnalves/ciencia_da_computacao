package QuestoesArrays;

import java.util.Scanner;

public class MaiorPalavra {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String maior = "";

        while (true) {
            String[] frase = sc.nextLine().split(" ");
            if (frase.length == 1) {
                break;
            }

            for (int i = 0; i < frase.length; i++) {
                String palavra = frase[i];
                if (palavra.length() >= maior.length()) {
                    maior = palavra;
                }
            }
        }
        System.out.println(maior);
    }
}
