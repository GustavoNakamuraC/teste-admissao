package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * A função irá receber um array de inteiros e retornar o primeiro elemento não repetido.
 * Ex: input: [2,2,3,1,1,6] - output: 3
 */
public class Main {
    public static void main(String[] args) {
        System.out.println(primeiroValorNaoRepetido(new int[]{2,2,3,1,1,6}));
    }

    public static int primeiroValorNaoRepetido(int[] array){
        int[] repetido = new int[array.length];
        int j,k = 0, contador = 0, naoRepetido= -1;

        for (int i = 0; i < array.length; i++) {
            j = i+1;
            while (j<array.length && array[i] != array[j]){
                j++;
            }

            if (j != array.length){
                repetido[k] = array[i];
                k++;
            }
        }
        System.out.println(Arrays.toString(repetido));

        for (int i = 0; i < array.length; i++) {
            j = 0;
            while (j<repetido.length && array[i] != repetido[j]){
                j++;
            }

            if (contador == 0 && j == repetido.length){
                contador++;
                naoRepetido = array[i];
            }
        }



        return naoRepetido;
    }
}