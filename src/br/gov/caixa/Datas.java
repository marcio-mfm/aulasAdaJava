package br.gov.caixa;

import java.util.Date;

public class Datas {

    public static void main(String[] args) {
        Date data = new Date();
        System.out.println(data);

        System.out.printf("%tD \n %td \n %tm \n %ty \n %th \n %tH \n %tM \n %tS", data, data, data, data, data, data, data, data);
    }
}
