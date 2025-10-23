import java.util.Scanner;

public class IMC {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double altura = pegaDados(sc, "Digite a altura do paciente: ");
        double peso = pegaDados(sc, "Digite o peso do paciente: ");
        String nome = pegaNome(sc, "Digite o nome do paciente: ");
        double imc = calculaIMC(altura, peso);

        System.out.printf("O paciente %s tem imc de %.2f, que é classificada como %s.%n", nome, imc, classificacaoIMC(imc));
    }

    public static String pegaNome(Scanner sc, String prompt) {
        System.out.print(prompt);
        return sc.nextLine();
    }

    public static double pegaDados(Scanner sc, String prompt) {
        System.out.print(prompt);
        return Double.parseDouble(sc.nextLine());
    }

    public static double calculaIMC(double altura, double peso) {
        return peso / (altura * altura);
    }

    public static String classificacaoIMC(double imc) {
        if (imc <= 18.5) return "magreza";
        else if (imc <= 24.9) return "peso normal";
        else if (imc <= 29.9) return "sobrepeso";
        else if (imc <= 34.9) return "obesidade grau I";
        else if (imc <= 39.9) return "obesidade grau II";
        else return "obesidade grau III";
    }
}
