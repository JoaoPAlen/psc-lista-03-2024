import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o código da operação: \n1 para Perímetro do círculo; \n2 para Área do círculo; \n3 para Volume da esfera.");
        int operacao = sc.nextInt();

        System.out.println("Digite o raio do círculo ou da esfera:");
        double raio = sc.nextDouble();

        double pi = 3.141592;

        switch (operacao) {
            case 1:
                double perimetroCirculo = 2 * pi * raio;
                System.out.println("O perímetro do círculo é: " + perimetroCirculo);
                break;
            case 2:
                double areaCirculo = pi * raio * raio;
                System.out.println("A área do círculo é: " + areaCirculo);
                break;
            case 3:
                double volumeEsfera = (4.0 / 3.0) * pi * Math.pow(raio, 3);
                System.out.println("O volume da esfera é: " + volumeEsfera);
                break;
            default:
                System.out.println("Erro: Código de operação inválido.");

        sc.close();
        }
    }
}

