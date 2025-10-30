package QuestoesArrays;

import java.util.Scanner;

public class SenhasFortes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] posicoes = new int[4];
        String[] palavras = new String[4];
        String senha = "";

        for (int i =0; i < 4; i++) {
            posicoes[i] =sc.nextInt();
            sc.nextLine();
        }

        for (int i = 0; i < 4; i++) {
            palavras[i] = sc.nextLine();
        }

        for (int i = 0; i < 4; i++) {
            int pos = posicoes[i];
            String palavra = palavras[i];

            if (pos >= 0 && pos < palavra.length()) {
                senha += palavra.charAt(pos);
            } else {
                senha += "*";
            }
        }

        System.out.println(senha);
    }
}
