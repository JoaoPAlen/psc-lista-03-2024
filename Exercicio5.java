import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Informe o 1º número: ");
        double n1 = sc.nextDouble();
        System.out.print("Informe o 2º número: ");
        double n2 = sc.nextDouble();
        System.out.print("Informe um dos operadores (+ , - , * , / , ^): ");
        String simbolo = sc.next();

        double resultado = 0;

        switch (simbolo) {
            case "+":
                resultado = n1 + n2;
                break;
            case "-":
                resultado = n1 - n2;
                break;
            case "*":
                resultado = n1 * n2;
                break;
            case "/":
                if (n2 == 0) {
                    System.out.print("\nErro: Divisão por zero!");
                }
                resultado = n1 / n2;
                break;
            case "^":
                resultado = Math.pow(n1, n2);
                break;
            default:
                System.out.print("\nErro: símbolo da operação inválido!");
                break;
        }

        System.out.print("\nO resultado da operação é: " + resultado);

        sc.close();
    }
}
