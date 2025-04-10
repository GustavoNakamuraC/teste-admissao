package org.example;

import java.util.Arrays;

/**
 * A função deverá receber um array de inteiros como parâmetro e deverá retornar o mesmo array ordenado em ordem crescente.
 * Ex: Input: [5,1,0,7,3,3] - Output: [0,1,3,3,5,7]
 */

public class Main {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(ordenarArray(new int[]{5,1,0,7,3,3})));
        System.out.println(Arrays.toString(ordenarArray(new int[]{10,3,22,6,4})));
    }

    public static int[] ordenarArray(int[] array){
        int aux, j;

        for (int i = 1; i < array.length; i++) {
            j = i;
            aux = array[i];

            while (j > 0 && aux < array[j-1]){
                array[j] = array[j-1];
                j--;
            }

            array[j] = aux;
        }

        return array;
    }
}