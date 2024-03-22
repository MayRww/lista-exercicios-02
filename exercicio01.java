import java.util.Scanner;
public class exercicio01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double soma = 0;
        double[] numeros = new double[5];
        for (int i = 0; i < 5; i++) {
            System.out.print("Digite o " + (i + 1) + "º número: ");
            numeros[i] = scanner.nextDouble();
            soma += numeros[i];
        }
        double media = soma / 5;

        System.out.println("A média dos números é: " + media);
        System.out.println("Números menores que a média:");
        for (double num : numeros) {
            if (num < media) {
                System.out.println(num);
            }
        }
        System.out.println("Números iguais à média:");
        for (double num : numeros) {
            if (num == media) {
                System.out.println(num);
            }
        }

        System.out.println("Números maiores que a média:");
        for (double num : numeros) {
            if (num > media) {
                System.out.println(num);
            }
        }

        scanner.close();
    }
}
