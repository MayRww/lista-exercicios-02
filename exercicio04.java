import java.util.Scanner;

public class exercicio04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int TAMANHO = 5;
        int[] vetor = new int[TAMANHO];

        System.out.println("Digite os 5 números do vetor:");
        for (int i = 0; i < TAMANHO; i++) {
            System.out.print("Digite o número na posição " + i + ": ");
            vetor[i] = scanner.nextInt();
        }

        System.out.print("Digite um número n: ");
        int n = scanner.nextInt();

        System.out.println("Índices dos elementos inferiores a " + n + ":");
        for (int i = 0; i < TAMANHO; i++) {
            if (vetor[i] < n) {
                System.out.println("Índice " + i);
            }
        }

        scanner.close();
    }
}
