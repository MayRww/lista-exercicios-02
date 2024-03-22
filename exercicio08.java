import java.util.Scanner;

public class exercicio08{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        final int TAMANHO = 5;
        int[] vetorA = new int[TAMANHO];
        int[] vetorB = new int[TAMANHO];
        int[] vetorC = new int[TAMANHO * 2]; 
        System.out.println("Digite os elementos do vetor A:");
        for (int i = 0; i < TAMANHO; i++) {
            vetorA[i] = scanner.nextInt();
        }

        System.out.println("Digite os elementos do vetor B:");
        for (int i = 0; i < TAMANHO; i++) {
            vetorB[i] = scanner.nextInt();
        }

        for (int i = 0; i < TAMANHO; i++) {
            vetorC[i] = vetorA[i];
        }

        for (int i = 0; i < TAMANHO; i++) {
            vetorC[i + TAMANHO] = vetorB[i];
        }
        System.out.println("Vetor C (concatenação de A e B):");
        for (int i = 0; i < vetorC.length; i++) {
            System.out.print(vetorC[i] + " ");
        }
        System.out.println();

        scanner.close();
    }
}
