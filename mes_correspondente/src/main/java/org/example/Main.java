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
        mesCorrespondente(0);
        mesCorrespondente(1);
        mesCorrespondente(12);
        mesCorrespondente(13);
    }

    public static void mesCorrespondente(int num){
        switch (num){
            case 1:
                System.out.println("Janeiro.");
                break;
            case 2:
                System.out.println("Fevereiro.");
                break;
            case 3:
                System.out.println("Março.");
                break;
            case 4:
                System.out.println("Abril.");
                break;
            case 5:
                System.out.println("Maio.");
                break;
            case 6:
                System.out.println("Junho.");
                break;
            case 7:
                System.out.println("Julho.");
                break;
            case 8:
                System.out.println("Agosto.");
                break;
            case 9:
                System.out.println("Setembro.");
                break;
            case 10:
                System.out.println("Outubro.");
                break;
            case 11:
                System.out.println("Novembro.");
                break;
            case 12:
                System.out.println("Dezembro.");
                break;
            default:
                System.out.println("Mês Desconhecido!");
        }
    }
}