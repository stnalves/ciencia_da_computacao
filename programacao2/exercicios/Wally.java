/**
 * Laboratório de Programação 2 - Lab 1
 *
 * @author Stefany Nicole Santos Alves - 20250021605
 */
package exercicios;

import java.util.Scanner;

public class Wally {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while(true) {
            String pessoas = sc.nextLine();
            if (pessoas.equals("wally")) {
                break;
            }

            String possivelNome = "";
            for (String nome : pessoas.split(" ")) {
                if (nome.length() == 5) {
                    possivelNome = nome;
                }
            }

            if (possivelNome.isEmpty()) {
                System.out.println("?");
            } else {
                System.out.println(possivelNome);
            }
        }
    }
}
