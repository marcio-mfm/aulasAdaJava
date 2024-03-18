package br.gov.caixa;

public class Erros {

    public static void main(String[] args) {
        int[] arrayDeInt = new int[2];
        try {
            for (int i = 0; i <= 2 ; i++) {
                arrayDeInt[i] = i;
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Felizmente não apresentou o erro em vermelho.");
        }
    }
}
