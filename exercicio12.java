import java.util.Scanner;

public class exercicio12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int TAMANHO = 12;
        int[] vetor = new int[TAMANHO];

        System.out.println("Digite os elementos do vetor:");
        for (int i = 0; i < TAMANHO; i++) {
            vetor[i] = scanner.nextInt();
        }

        int produto = 1;
        for (int i = 0; i < TAMANHO; i++) {
            if (vetor[i] != 0 && vetor[i] % 2 == 0 && vetor[i] > 0) {
                produto *= vetor[i];
            }
        }

        System.out.println("Produto dos elementos pares positivos: " + produto);

        scanner.close();
    }
}
