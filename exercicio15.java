import java.util.Scanner;

public class exercicio15 {
    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

          int TAMANHO = 5;
        int[] vetor = new int[TAMANHO];

          System.out.println("Digite 5 números:");

          vetor[0] = scanner.nextInt();
         for (int i = 1; i < TAMANHO; i++) {
            int numero = scanner.nextInt();
            if (numero > vetor[i - 1]) {
                vetor[i] = numero;
             } else {
                System.out.println("Número inválido. Digite um número maior que o anterior:");
                i--;
            }
        }

           System.out.println("Vetor preenchido:");
        for (int i = 0; i < TAMANHO; i++) {
            System.out.print(vetor[i] + " ");
        }
         System.out.println();

        scanner.close();
    }
}
