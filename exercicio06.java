import java.util.Scanner;

public class exercicio06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        final int NUMERO_NOTAS = 5;

        double[] notas = new double[NUMERO_NOTAS];
        double[] pesos = new double[NUMERO_NOTAS];

        System.out.println("Digite as 5 notas do aluno:");
        for (int i = 0; i < NUMERO_NOTAS; i++) {
            System.out.print("Nota " + (i + 1) + ": ");
            notas[i] = scanner.nextDouble();
        }

        System.out.println("Digite os 5 pesos correspondentes às notas:");
        for (int i = 0; i < NUMERO_NOTAS; i++) {
            System.out.print("Peso " + (i + 1) + ": ");
            pesos[i] = scanner.nextDouble();
        }
        double somaProdutos = 0;
        double somaPesos = 0;
        for (int i = 0; i < NUMERO_NOTAS; i++) {
            somaProdutos += notas[i] * pesos[i];
            somaPesos += pesos[i];
        }
        double mediaPonderada = somaProdutos / somaPesos;

        System.out.println("A média ponderada do aluno é: " + mediaPonderada);

        scanner.close();
    }
}
