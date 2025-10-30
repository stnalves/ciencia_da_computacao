/**
 * Laboratório de Programação 2 - Lab 1
 *
 * @author Stefany Nicole Santos Alves - 20250021605
 */
package exercicios;

import java.util.Scanner;
import java.util.ArrayList;

public class NotasAlunos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> notas = new ArrayList<>();

        double soma = 0;
        int acima = 0;
        int abaixo = 0;

        while(true) {
            String entrada = sc.nextLine();

            if (entrada.equals("-")) {
                break;
            }

            String[] dados = entrada.split(" ");
            notas.add(Integer.parseInt(dados[1]));
        }

        int maior = notas.get(0);
        int menor = notas.get(0);

        for (int nota : notas) {
            soma += nota;

            if (nota > maior) {
                maior = nota;
            }
            if (nota < menor) {
                menor = nota;
            }
        }

        int media = (int) soma / notas.size();

        for (int nota : notas) {
            if (nota >= 700) {
                acima++;
            } else {
                abaixo++;
            }
        }

        System.out.println("maior: " + maior);
        System.out.println("menor: " + menor);
        System.out.println("media: " + media);
        System.out.println("acima: " + acima);
        System.out.println("abaixo: " + abaixo);
    }
}
