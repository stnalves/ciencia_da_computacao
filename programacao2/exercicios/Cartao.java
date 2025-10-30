/**
 * Laboratório de Programação 2 - Lab 1
 *
 * @author Stefany Nicole Santos Alves - 20250021605
 */
package exercicios;

import java.util.Scanner;

public class Cartao {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double valor = sc.nextDouble();
        sc.nextLine();
        String operacao = sc.nextLine();

        if (operacao.equals("debito")) {
            System.out.println(valor + " REAIS NO DEBITO");
        } else if (operacao.equals("credito")){
            String parcelamento = sc.nextLine();
            if (parcelamento.equals("n")) {
                System.out.println(valor + " REAIS NO CREDITO (DIRETO)");
            } else if (parcelamento.equals("s")){
                int parcelas = sc.nextInt();
                System.out.println(parcelas + " PARCELAS DE " + valor/parcelas + " REAIS");
            }
        }
    }
}
