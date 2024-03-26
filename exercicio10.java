import java.util.Scanner;

public class exercicio10 {
    public static void executar() {
        Scanner scanner = new Scanner(System.in);

        final int TAMANHO = 5;
        int[] vetorA = new int[TAMANHO];
        int[] vetorB = new int[TAMANHO];
        System.out.println("Digite os elementos do vetor A:");
        for (int i = 0; i < TAMANHO; i++) {
            vetorA[i] = scanner.nextInt();
        }
        for (int i = 0; i < TAMANHO; i++) {
            vetorB[i] = vetorA[TAMANHO - 1 - i];
        }

        System.out.println("Vetor B (cópia invertida de A):");
        for (int i = 0; i < TAMANHO; i++) {
            System.out.print(vetorB[i] + " ");
        }
        System.out.println();

        scanner.close();
    }
}
