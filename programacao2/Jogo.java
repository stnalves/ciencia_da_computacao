package JogoDoBicho;

import java.util.Scanner;
import java.util.Random;
import java.util.Arrays;

public class Jogo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String continua;
		
		do {
			int[] bilhete = fazAposta();
			
			for (int n : bilhete) {
				System.out.print(n + " ");
			}
			System.out.println();
			
			System.out.println("Deseja continuar? (n para parar)");
			continua = sc.nextLine();
			
		} while (!continua.equals("n"));
		
		//int numero = sc.nextInt();
		//System.out.println(pegaBicho(numero));
	}
	
	public static String pegaBicho(int numero) {
		String[] bichos = {"Avestruz", "Águia","Burro","Borboleta","Cachorro","Cabra", "Carneiro", 
				"Camelo", "Cobra", "Coelho","Cavalo", "Elefante", "Galo", "Gato","Jacaré", "Leão", 
				"Macaco","Porco", "Pavão","Peru","Touro","Tigre","Urso","Veado","Vaca"};
		String bicho = "Inválido";
		
		if (numero >= 0 && numero <= 25) {
			bicho = bichos[numero-1]; 
		}
		return bicho;
	}
	
	public static int[] fazAposta() {
		Random rd = new Random();
		int[] bilhete= new int[5];
		
		/*
		for (int i = 0; i < 5; i++) {
			bilhete[i] = rd.nextInt(25) + 1;
		}
		*/
		
		for (int i = 0; i < 5; i++) {
			int numero;
			boolean repetido;
			
			do {
				numero = rd.nextInt(25) + 1;
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
	
	//public static String[] imprimeAposta(int[] numeros) {
		
	//}
}

