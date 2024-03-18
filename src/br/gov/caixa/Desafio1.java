package br.gov.caixa;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Desafio1 {
    public static void main(String[] args) {
        executarDesafio(new String[]{"true", "Imprimindo soma inteiros...",  "10", "15", "sim", "Não imprimindo... ", "7.3", "7.1", "true", "Imprimindo soma inteiros... ", "7.3", "7.1"});}


    private static void executarDesafio(String[] array){
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Digite os parâmetros: ");
//        String array1 = sc.nextLine();
//        array = array1.split(Pattern.quote(","));
//        System.out.println(array);
        for (int i = 0; i < array.length; i+=4) {
            boolean confirma = Boolean.parseBoolean(array[i]);
            String mensagem = array[i + 1];


            if (confirma){
                try {
                    int num1 = Integer.parseInt(array[i + 2]);
                    int num2 = Integer.parseInt(array[i + 3]);
                    int soma = num1 + num2;
                    System.out.println("Imprimindo soma de inteiros ..." + " " + soma);
                } catch (NumberFormatException e) {

                    System.out.println("Erro ao converter para inteiro: " + e.getMessage());
                }


            } else {
                System.out.println("Soma ignorada: não imprimir");
            }
        }

    }
}
