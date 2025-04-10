package org.example;

/**
 * A função deverá receber uma string e substituir todas as vogais da mesma pelo sinal '?'
 * Ex: input: 'Bar' - output: 'B?r'
 */

public class Main {
    public static void main(String[] args) {
        System.out.println(substituirCaracteres("Substituiu as vogais"));
    }

    public static String substituirCaracteres(String string){
        StringBuilder stringSubstituida = new StringBuilder();

        for (int i = 0; i < string.length(); i++) {
            char letra = string.charAt(i);

            if ("AEIOUaeiou".indexOf(letra) != -1){
                stringSubstituida.append("?");
            }else {
                stringSubstituida.append(letra);
            }
        }

        return stringSubstituida.toString();
    }
}