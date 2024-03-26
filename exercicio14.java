import java.util.Scanner;

public class exercicio14 {
    public static void executar() {
        Scanner scanner = new Scanner(System.in);

        int TAMANHO = 5;
        int[] vetor = new int[TAMANHO];

        System.out.println("Digite os elementos do vetor:");
        for (int i = 0; i < TAMANHO; i++) {
            vetor[i] = scanner.nextInt();
        }

        int maiorElemento = vetor[0];
        int posicaoMaiorElemento = 0;
        for (int i = 1; i < TAMANHO; i++) {
            if (vetor[i] > maiorElemento) {
                maiorElemento = vetor[i];
                posicaoMaiorElemento = i;
            }
        }

        int ultimoElemento = vetor[TAMANHO - 1];
        vetor[TAMANHO - 1] = maiorElemento;
        vetor[posicaoMaiorElemento] = ultimoElemento;

        System.out.println("Vetor atualizado:");
        for (int i = 0; i < TAMANHO; i++) {
            System.out.print(vetor[i] + " ");
        }
        System.out.println();

        scanner.close();
    }
}
