package org.example;

/**
 * A função deverá receber um array com pelo menos 3 itens e retornar a média simples de todos os itens do array.
 * Caso o array recebido possua menos que 3 itens, deverá ser retornado o boleano false.
 * Ex: input: [4,6,8] 	- output 6
 * Ex: input: [1,2] 	- output false
 */

public class Main {
    public static void main(String[] args) {
        System.out.println(mediaSimples(new int[]{11, 23, 41}));
        System.out.println(mediaSimples(new int[]{4, 6, 8}));
        System.out.println(mediaSimples(new int[]{1,2}));
    }

    public static Object mediaSimples(int[] notas){
        int soma = 0;

        if (notas.length < 3){
            return false;
        }

        for (int i = 0; i < notas.length; i++) {
            soma += notas[i];
        }

        return soma/notas.length;
    }
}