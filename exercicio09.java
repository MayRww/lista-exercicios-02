import java.util.InputMismatchException;
import java.util.Scanner;

public class exercicio09 {
    public static void executar()  {
        Scanner scanner = new Scanner(System.in);

        final int TAMANHO = 5;
        int[] vetorA = new int[TAMANHO];
        int[] vetorB = new int[TAMANHO];
        int[] vetorC = new int[TAMANHO * 2]; 

        System.out.println("Digite os elementos do vetor A:");
        for (int i = 0; i < TAMANHO; i++) {
            try {
                vetorA[i] = scanner.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Entrada inválida. Por favor, digite um número inteiro.");
                scanner.next(); 
                i--; 
            }
        }
        System.out.println("Digite os elementos do vetor B:");
        for (int i = 0; i < TAMANHO; i++) {
            try {
                vetorB[i] = scanner.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Entrada inválida. Por favor, digite um número inteiro.");
                scanner.next(); 
                i--; 
            }
        }
        for (int i = 0; i < TAMANHO; i++) {
            vetorC[i] = vetorA[i];
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

