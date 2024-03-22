import java.util.Scanner;

public class exercicio13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o número de termos da sequência de Fibonacci desejados: ");
        int n = scanner.nextInt();

        int[] fibonacci = new int[n];

        if (n >= 1) {
            fibonacci[0] = 1;
        }
        if (n >= 2) {
            fibonacci[1] = 1;
        }
        for (int i = 2; i < n; i++) {
            fibonacci[i] = fibonacci[i - 1] + fibonacci[i - 2];
        }
        System.out.println("Os primeiros " + n + " termos da sequência de Fibonacci:");
        for (int i = 0; i < n; i++) {
            System.out.print(fibonacci[i] + " ");
        }
        System.out.println();

        scanner.close();
    }
}
