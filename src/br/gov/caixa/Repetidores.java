package br.gov.caixa;

import java.util.Scanner;

public class Repetidores {

    public static void main(String[] args) {
        for (int i = 0; i <= 10; i++) {
            System.out.println("\n--------- Tabuada do " + i + " ---------\n");
            for (int j = 0; j <= 10; j++) {
                System.out.println(i + " X " + j + " = " + i * j);
            }
        }
        Scanner sc = new Scanner(System.in);
        String continuar = "S";
        while (continuar.equals("S")){
            System.out.println("Digite a opção: ");
            continuar = sc.nextLine();
        }

        int saldo = 0;
        do {
            System.out.println("Faz um pix pros alunos");
            saldo --;
        } while (saldo > 9580);
    }
}
