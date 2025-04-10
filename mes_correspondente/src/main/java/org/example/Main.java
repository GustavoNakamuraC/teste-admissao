package org.example;

/**
 * The function should recive an integer between 1 and 12 (inclusive) and return the corresponding string value. If the informed integger is not between 1 and 12, the function should return 'Unknown Month'
 * Ex: input: 1 - output: "January"
 * Ex: input: 13 - output: "Unknown Month"
 *
 * A função recebe um inteiro entre 1 e 12 e retorna o mês correspondente por extenso. Caso o mês informado não esteja entre 1 e 12, deverá ser retornado "Mes Inexistente"
 * Ex: input: 1 	- output: "Janeiro"
 * Ex: input: 13 	- output: "Mês Desconhecido"
 */

public class Main {
    public static void main(String[] args) {
        System.out.println(mesCorrespondente(0));
        System.out.println(mesCorrespondente(1));
        System.out.println(mesCorrespondente(12));
        System.out.println(mesCorrespondente(13));
    }

    public static String mesCorrespondente(int mes){
        switch (mes){
            case 1:
                return "Janeiro.";
            case 2:
                return "Fevereiro.";
            case 3:
                return "Março.";
            case 4:
                return "Abril.";
            case 5:
                return "Maio.";
            case 6:
                return "Junho.";
            case 7:
                return "Julho.";
            case 8:
                return "Agosto.";
            case 9:
                return "Setembro.";
            case 10:
                return "Outubro.";
            case 11:
                return "Novembro.";
            case 12:
                return "Dezembro.";
            default:
                return "Mês desconhecido.";
        }
    }
}