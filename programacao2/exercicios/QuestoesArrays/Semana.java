package QuestoesArrays;

import java.util.Scanner;

public class Semana {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] dias = {"Domingo", "Segunda-feira", "Terça-feira", "Quarta-feira", "Quinta-feira", "Sexta-feira", "Sábado"};
        int numeroDia = sc.nextInt();

        System.out.print(dias[numeroDia - 1]);
    }
}
