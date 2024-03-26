import java.util.Scanner;

public class exercicio07 {
    public static void executar()  {
        Scanner scanner = new Scanner(System.in);

        final int TAMANHO = 5;
        int[] vetor1 = new int[TAMANHO];
        int[] vetor2 = new int[TAMANHO];

        System.out.println("Digite os elementos do primeiro vetor:");
        for (int i = 0; i < TAMANHO; i++) {
            vetor1[i] = scanner.nextInt();
        }

        System.out.println("Digite os elementos do segundo vetor:");
        for (int i = 0; i < TAMANHO; i++) {
            vetor2[i] = scanner.nextInt();
        }

        int i;
        for (i = 0; i < TAMANHO; i++) {
            if (vetor1[i] != vetor2[i]) {
                System.out.println("Os vetores são diferentes.");
                break;
            }
        }

        if (i == TAMANHO) {
            System.out.println("Os vetores são iguais.");
        }

        scanner.close();
    }
}
