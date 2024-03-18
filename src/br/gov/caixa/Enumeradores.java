package br.gov.caixa;

import java.util.Scanner;

public class Enumeradores {

    public static void main(String[] args) {
        enum FaixaEtaria {
            CRIANCA, ADULTO, IDOSO;
        }

        enum RegiaodoBrasil {
            NORTE, NORDESTE, SUL, SULDESTE, CENTRO_OESTE;
        }

        enum PerfisdeAcesso {
            ADMINISTRADOR, CONSULTA, USUARIO, CLIENTE, AUDITOR;
        }

        Scanner sc = new Scanner(System.in);
        System.out.println("Digite a Idade: ");
        int idade = sc.nextInt();

        FaixaEtaria faixaEtaria;

        if (idade < 18) {
            faixaEtaria = FaixaEtaria.CRIANCA;

        } else if (idade >= 18 && idade < 60 ) {
            faixaEtaria = FaixaEtaria.ADULTO;
        } else {
            faixaEtaria = FaixaEtaria.IDOSO;
        }

        System.out.println(faixaEtaria);
    }


}
