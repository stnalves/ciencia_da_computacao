package QuestoesArrays;

import java.util.Random;

public class CartaMagica {
    public static void main(String[] args) {
        Random rd = new Random();
        String[] naipes = {"Paus", "Ouros", "Copas", "Espadas"};
        String[] valores = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "Valete", "Dama", "Rei"};

        String naipeSorteado = naipes[rd.nextInt(naipes.length)];
        String valorSorteado = valores[rd.nextInt(valores.length)];

        System.out.println(naipeSorteado);
        System.out.println(valorSorteado);
    }
}
