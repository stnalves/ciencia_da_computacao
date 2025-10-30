package QuestoesArrays;

import java.util.Scanner;

public class SubstituiPalavra {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         String palavraChave = sc.nextLine();
         String[] frase = sc.nextLine().split(" ");

         for (int i = 0; i < frase.length; i++) {
             if (frase[i].equals(palavraChave)) {
                 frase[i] = "***";
             }
         }

         String resultado = String.join(" ", frase);
         System.out.println(resultado);
    }
}
