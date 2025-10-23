/**
 * Laboratório de Programação 2 - Lab 1
 *
 * @author Stefany Nicole Santos Alves - 20250021605
 */

import java.util.Scanner;

public class Bafometro {
    public static void main (String[] args) {

        Scanner sc = new Scanner(System.in);
        int diasLicenciamento = sc.nextInt();
        int diasCarteira = sc.nextInt();
        double valorBafometro = sc.nextDouble();

        if (diasLicenciamento < 30 && diasCarteira < 30 && valorBafometro <= 0.05) {
            System.out.println("False");
        } else {
            System.out.println("True");
        }
    }
}