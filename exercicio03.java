import java.util.Scanner;

public class exercicio03 {
    public static void executar() {
        Scanner scanner = new Scanner(System.in);

           System.out.print("Digite o tamanho do vetor: ");
        int tamanho = scanner.nextInt();

          int[] vetorOriginal = new int[tamanho];
         System.out.println("Digite os números do vetor:");
        for (int i = 0; i < tamanho; i++) {
            System.out.print("Digite o número na posição " + i + ": ");
            vetorOriginal[i] = scanner.nextInt();
        }

         int[] vetorDobro = new int[tamanho];
        for (int i = 0; i < tamanho; i++) {
            vetorDobro[i] = vetorOriginal[i] * 2;
        }

         System.out.println("Valores do segundo vetor (dobro dos valores do primeiro vetor):");
         for (int i = 0; i < tamanho; i++) {
            System.out.println("Posição " + i + ": " + vetorDobro[i]);
        }

        scanner.close();
    }
}
