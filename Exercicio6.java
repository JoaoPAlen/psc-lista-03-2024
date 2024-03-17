import java.util.Scanner;
import java.util.Random;

public class Exercicio6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        System.out.print("Informe o 1º número inteiro: ");
        int n1 = sc.nextInt();

        System.out.print("Informe o 2º número inteiro: ");
        int n2 = sc.nextInt();

        int max = Math.max(n1, n2);
        int min = Math.min(n1, n2);

        int nAleatorio = random.nextInt(max - min + 1) + min;

        if (nAleatorio % 2 == 0) {
            System.out.print("O número gerado é: " + nAleatorio + " e é par.");
        } else {
            System.out.print("O número gerado é: " + nAleatorio + " e é ímpar.");
        }
        sc.close();
    }
}
