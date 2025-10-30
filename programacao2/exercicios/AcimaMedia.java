/**
 * Laboratório de Programação 2 - Lab 1
 *
 * @author Stefany Nicole Santos Alves - 20250021605
 */
package exercicios;

import java.util.Scanner;

public class AcimaMedia {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String entrada = sc.nextLine();
        String[] numerosStr = entrada.split(" ");
        double media = Media(numerosStr);

        for (String valor : numerosStr) {
            int numero = Integer.parseInt(valor);
            if (numero > media) {
                System.out.print(numero + " ");
            }
        }

        System.out.println();

    }

    public static double Media(String[] valores) {
        double soma = 0;
        for (String valor : valores) {
            soma += Integer.parseInt(valor);
        }
        return soma / valores.length;
    }
}
