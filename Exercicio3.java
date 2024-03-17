import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o valor de a: ");
        double a = sc.nextDouble();
        System.out.print("Digite o valor de b: ");
        double b = sc.nextDouble();
        System.out.print("Digite o valor de c: ");
        double c = sc.nextDouble();

        double delta = Math.pow(b, 2.0) - 4 * a * c;

        if (a == 0 && b == 0 && c != 0) {
            System.out.print("\nCoeficientes informados incorretamente!");
        } else if (a == 0 && b != 0) {
            System.out.print("\nEssa é uma equação de primeiro grau.");
            double raiz = -c / b;
            System.out.print("\nA raiz da equação é: " + raiz);
        } else if (delta < 0) {
            System.out.print("\nEsta equação não possui raízes reais.");
        } else if (delta == 0) {
            System.out.print("\nEsta equação possui duas raízes reais iguais.");
            double raiz = -b / (2 * a);
            System.out.println("\nAs raízes reais da equação são: " + raiz);
        } else
            System.out.print("\nEsta equação possui duas raízes reais diferentes.");
            double raiz1 = (-b + Math.sqrt(delta)) / (2 * a);
            double raiz2 = (-b - Math.sqrt(delta)) / (2 * a);
            System.out.println("As raízes reais da equação são: " + raiz1 + " e " + raiz2);

        sc.close();
    }
}
