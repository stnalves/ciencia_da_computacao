package QuestoesArrays;

import java.util.Scanner;
import java.util.Random;
import java.util.Arrays;

public class JogoDoBicho {

    public static String[] bichos = {"Avestruz", "Águia", "Burro", "Borboleta", "Cachorro", "Cabra", "Carneiro", "Camelo",
            "Cobra", "Coelho", "Cavalo", "Elefante", "Galo", "Gato", "Jacaré", "Leão", "Macaco", "Porco", "Pavão",
            "Peru", "Touro", "Tigre", "Urso", "Veado", "Vaca"};
    public static int tamanho = 5;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String continua;

        do {
            int[] bilhete = fazAposta();
            imprimeAposta(bilhete);

            System.out.println("Deseja continuar? (n para parar)");
            continua = sc.nextLine();

        } while (!continua.equals("n"));

        //int numero = sc.nextInt();
        //System.out.println(pegaBicho(numero));
    }

    public static String pegaBicho(int numero) {
        if (numero >= 0 && numero <= 25) {
            return bichos[numero-1];
        }
        return "Inválido";
    }

    public static int[] fazAposta() {
        Random rd = new Random();
        int[] bilhete= new int[tamanho];

		/*
		for (int i = 0; i < 5; i++) {
			bilhete[i] = rd.nextInt(bichos.length) + 1;
		}
		*/

        for (int i = 0; i < tamanho; i++) {
            int numero;
            boolean repetido;

            do {
                numero = rd.nextInt(bichos.length) + 1;
                repetido = false;
                for (int j = 0; j < i; j++) {
                    if (numero == bilhete[j]) {
                        repetido = true;
                        break;
                    }
                }
            } while (repetido);
            bilhete[i] = numero;
        }

        Arrays.sort(bilhete);
        return bilhete;
    }

    public static void imprimeAposta(int[] bilhete) {
        System.out.print("Seu bilhete: ");
        for (int numero : bilhete) {
            System.out.print(numero + " - " + pegaBicho(numero) + "; ");
        }
        System.out.println();
    }
}
