package org.example;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * A função será utilizada em um sistema de caixa.
 * Ela receberá um valor inteiro, representando o valor a ser sacado e um array contendo quais tipos de cédulas ela tem disponível.
 * O array de cédulas disponiveis indica quais valores de cédulas existirão no caixa, a quantidade das mesmas é ilimitada. No caso do input [2,5,50], o caixa terá quantidades ilimitadas de notas de 2, 5 e 50 para devolver ao cliente.
 * A função deverá retornar o mínimo de cédulas necessarias possivel para o saque em formato de um array, cuja chave seja o valor da cédula e o valor a quantidade daquela cédula que será sacada.
 *
 * Ex: input: 150 & [5, 50, 100] 	- output: ["100"=>1, "50"=>1].
 * Ex: input: 150 e [2, 5, 10] 		- output: ["10"=>15].

 */
public class Main {
    public static void main(String[] args) {
        System.out.println(menorNumeroNotas(150, new int[]{2,5,10}));
    }

    public static Map<Integer, Integer> menorNumeroNotas(int valor, int[] cedulas){
        Arrays.sort(cedulas);
        int i = cedulas.length - 1, valorCedulas = 0, qtd;
        Map<Integer, Integer> quantidadeCedula = new LinkedHashMap<>();

        while (i >=0 && valorCedulas < valor){
            qtd = 0;
            while (valorCedulas + cedulas[i] <= valor){
                valorCedulas += cedulas[i];
                qtd++;
                quantidadeCedula.put(cedulas[i], qtd);
            }
            i--;
        }

        return quantidadeCedula;
    }
}