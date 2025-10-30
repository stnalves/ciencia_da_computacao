/**
 * Laboratório de Programação 2 - Lab 1
 *
 * @author Stefany Nicole Santos Alves - 20250021605
 */
package exercicios;

import java.util.Scanner;

public class DistanciaFinal {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int posicao1 = sc.nextInt();
        int velocidade1 = sc.nextInt();
        int posicao2 = sc.nextInt();
        int velocidade2 = sc.nextInt();
        int tempo = sc.nextInt();

        int distancia1 = posicao1 + (velocidade1 * tempo);
        int distancia2 = posicao2 + (velocidade2 * tempo);
        int distanciaFinal = Math.abs(distancia1 - distancia2);

        System.out.println(distanciaFinal);
    }
}