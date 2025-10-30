package QuestoesArrays;

import java.util.Scanner;

public class Tabela {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] tamanho = sc.nextLine().split(" ");
        int linhas = Integer.parseInt(tamanho[0]);
        int colunas = Integer.parseInt(tamanho[1]);
        int[][] tabela = new int[linhas][colunas];

        System.out.println();

        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                tabela[i][j] = sc.nextInt();
                sc.nextLine();
            }
        }

        System.out.println();

        while (true) {
            String[] pesquisado = sc.nextLine().split(" ");
            int linhaPesquisada = Integer.parseInt(pesquisado[0]);
            int colunaPesquisada = Integer.parseInt(pesquisado[1]);

            if (linhaPesquisada == -1 && colunaPesquisada == -1) {
                break;
            }

            System.out.println(tabela[linhaPesquisada][colunaPesquisada]);
            System.out.println();

        }
    }
}
