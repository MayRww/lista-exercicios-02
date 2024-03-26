import java.util.Scanner;

public class exercicio05{
    public static void executar()  {
        Scanner scanner = new Scanner(System.in);

        int[] vetor = new int[5];
        System.out.println("Digite 5 números:");
        for (int i = 0; i < 5; i++) {
            vetor[i] = scanner.nextInt();
        }

        System.out.print("Digite um número n: ");
        int n = scanner.nextInt();
        int vezes = 0;
        for (int i = 0; i < 5; i++) {
            if (vetor[i] == n) {
                vezes++;
            }
        }
        System.out.println("O número " + n + " aparece " + vezes + " vezes no vetor.");

        scanner.close();
    }
}
