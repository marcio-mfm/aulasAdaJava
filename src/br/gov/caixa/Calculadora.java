package br.gov.caixa;

import java.util.Scanner;

public class Calculadora {

    public static void main(String[] args) {
        enum Operacao {
            MULTIPLICAR, DIVIDIR, SOMAR, SUBTRAIR;
        }
        Scanner sc = new Scanner(System.in);
        System.out.println("Escolha uma opção: 1- Multiplicar 2- Dividir 3- Somar 4- Subtrair");
        int opcao = sc.nextInt();

        if (opcao == 1) {
            System.out.println("Digite o primeiro Número:");
            int num1 = sc.nextInt();

            System.out.println("Digite o segundo Número:");
            int num2 = sc.nextInt();

            int resultado = num1 * num2;

            System.out.println("O resultado é: " + resultado);
        }else if (opcao == 2) {
            System.out.println("Digite o primeiro Número:");
            float num1 = sc.nextInt();

            System.out.println("Digite o segundo Número:");
            float num2 = sc.nextInt();

            float resultado = num1 / num2;
            float resto = num1 % num2;

            System.out.printf((resto!= 0) ? ("O resultado é: %.2f") : ("O resultado é: %.0f"), resultado);

        } else if (opcao == 3) {

            System.out.println("Digite o primeiro Número:");
            int num1 = sc.nextInt();

            System.out.println("Digite o segundo Número:");
            int num2 = sc.nextInt();

            int resultado = num1 + num2;

            System.out.println("O resultado é: " + resultado);

        } else if (opcao == 4) {

            System.out.println("Digite o primeiro Número:");
            int num1 = sc.nextInt();

            System.out.println("Digite o segundo Número:");
            int num2 = sc.nextInt();

            int resultado = num1 - num2;

            System.out.println("O resultado é: " + resultado);

        } else {
            System.out.println("Opção inválida");
        }
    }
}
