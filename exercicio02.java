import java.util.Scanner;

public class exercicio02 {
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);

         System.out.print("Digite o tamanho do vetor: ");
        int tamanho = scanner.nextInt();

            int[] vetor = new int[tamanho];

        for (int i = 0; i < tamanho; i++) {
            System.out.print("Digite o número na posição " + i + ": ");
            vetor[i] = scanner.nextInt();
        }

          for (int i = 0; i < tamanho; i++) {
            if (vetor[i] > 0) {
                System.out.println("O número " + vetor[i] + " na posição " + i + " é positivo.");
            } else if (vetor[i] < 0) {
                System.out.println("O número " + vetor[i] + " na posição " + i + " é negativo.");
            } else {
                System.out.println("O número " + vetor[i] + " na posição " + i + " é zero.");
            }
        }

        scanner.close();
    }
}
