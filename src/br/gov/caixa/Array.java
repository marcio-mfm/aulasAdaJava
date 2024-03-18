package br.gov.caixa;

import java.util.Arrays;

public class Array {
    public static void main(String[] args) {
       int [] array = new int[4];

        for (int i = 0; i < array.length; i++) {
            array[i] = i;
        }
        System.out.println(Arrays.toString(array));

        char meuNomeArray [] = {'M', 'e', 'u', ' ', 'n', 'o', 'm', 'e'};


    }

}
