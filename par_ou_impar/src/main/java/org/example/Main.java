package org.example;

/**
 * The function should expect an array containing integers greater than zero and return the amount of even values contained in it.
 * Ex: input: [1,2,3,4,5] - output: 2
 *
 * Recebe um array de inteiros maiores que zero e retorna a quantidade de números pares existentes no array
 * Ex: input: [1,2,3,4,5] - output: 2
 */

public class Main {
    public static void main(String[] args) {
        int[] array1 = {1,2,3,4,5};
        int[] array2 = {1,5,7};
        int contador1 = 0, contador2 = 0;

        for (int i = 0; i < array1.length; i++) {
            if (parOuImpar(array1[i])){
                contador1++;
            }
        }
        for (int i = 0; i < array2.length; i++) {
            if (parOuImpar(array2[i])){
                contador2++;
            }
        }

        System.out.println("Array 1: " + contador1);
        System.out.println("Array 2: " + contador2);
    }

    public static boolean parOuImpar(int num){
        return num % 2 == 0;
    }
}