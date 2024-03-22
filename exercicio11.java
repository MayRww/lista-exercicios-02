import java.util.Scanner;

public class exercicio11 {
    public static void main(String[] args) {
     Scanner scanner = new Scanner(System.in);

    int TAMANHO = 5;
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

    int produtoEscalar = 0;
        for (int i = 0; i < TAMANHO; i++) {
            produtoEscalar += vetor1[i] * vetor2[i];
        }

    System.out.println("Produto escalar: " + produtoEscalar);

        scanner.close();
    }
}
