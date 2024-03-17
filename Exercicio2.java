import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double valorCompra, valorPago, valorTroco;

        System.out.print("Valor da compra é: R$ ");
        valorCompra = sc.nextDouble();

        System.out.print("Valor pago foi de: R$ ");
        valorPago = sc.nextDouble();

        valorTroco = valorPago - valorCompra;

        if (valorPago < valorCompra) {
            System.out.print("\nValor pago é insuficiente!");
        }   else {
            System.out.println("\nTroco é de: R$ " + valorTroco);
        }

        int notas50 = 0;
        int notas20 = 0;
        int notas10 = 0;
        int notas5 = 0;
        int notas2 = 0;
        int notas1 = 0;

        while (valorTroco >= 50.0) {
            valorTroco -= 50.0;
            notas50++;
        }
        while (valorTroco >= 20.0) {
            valorTroco -= 20.0;
            notas20++;
        }
        while (valorTroco >= 10.0) {
            valorTroco -= 10.0;
            notas10++;
        }
        while (valorTroco >= 5.0) {
            valorTroco -= 5.0;
            notas5++;
        }
        while (valorTroco >= 2.0) {
            valorTroco -= 2.0;
            notas2++;
        }
        while (valorTroco >= 1.0) {
            valorTroco -= 1.0;
            notas1++;
        }

        System.out.println("Notas de R$ 50,00: " + notas50);
        System.out.println("Notas de R$ 20,00: " + notas20);
        System.out.println("Notas de R$ 10,00: " + notas10);
        System.out.println("Notas de R$ 5,00: " + notas5);
        System.out.println("Notas de R$ 2,00: " + notas2);
        System.out.println("Notas de R$ 1,00: " + notas1);

        sc.close();
        }
    }
