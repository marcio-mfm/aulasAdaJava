package br.gov.caixa;

public class MinhaAplicacao {
    public static void main(String[] args) {
        int hora = 2;

        boolean dia = true;
        boolean manha = true;
        boolean momento = dia || manha;
        System.out.println("Hello world!! " + ((hora <= 11) ? "Bom dia!" : "Boa tarde! ") + momento);
        System.out.println(momento);

        int quantidadeAluno = 5;
        // [tipo] [nomaVariavel] = [valor]

        int soma = somador(10, 20);
        System.out.println(soma);

        System.out.println(subtrator(10, 5));

        System.out.println(multiplicador(2, 4));

        System.out.println(divisor(5, 4));

        System.out.println(calculaResto(8, 5));

        System.out.println(String.format("%d - %d - %d - %f - %d", somador(10, 20), subtrator(10, 5), multiplicador(2, 4), divisor(5, 4), calculaResto(8, 5)));

        String textoComMascara = "Nome: %s | Idade: %d | Peso: %f";

        System.out.println(String.format("Marca: %s - Eixos: %d - Cilindradas: %f", "Scania", 4, 4.1));

        final String NOME = "Marcio"; // Constante, não permite alterar. Como boa prática usa o snake case para nomenclatura, caixa alta e palavras separadas por _
        System.out.println(NOME);


    }
     static int somador(int valor1, int valor2){
            int soma = valor1 +valor2;
            return soma;
    }

    static int subtrator(int valor1, int valor2){
        int subtracao = valor1 - valor2;
        return subtracao;
    }

    static int multiplicador(int valor1, int valor2){
        int multiplicacao = valor1 * valor2;
        return multiplicacao;
    }

    static float divisor(float valor1, float valor2){
        float divisao = valor1 / valor2;
        return divisao;
    }

    static int calculaResto(int valor1, int valor2){
        int resto = valor1 % valor2;
        return resto;
    }

}
