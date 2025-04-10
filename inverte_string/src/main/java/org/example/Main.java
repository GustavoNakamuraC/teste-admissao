package org.example;

/**
 * The function should expect a string and return it backwards.
 * Ex: input: "foo" - output: "oof"
 *
 * A função deverá receber uma string e retornar a mesma invertida.
 * Ex: input: "bar" - output: "rab"
 */
public class Main {
    public static void main(String[] args) {
        System.out.println(inverterString(new StringBuilder("bar")));
        System.out.println(inverterString(new StringBuilder("inverteu sim")));
    }

    public static String inverterString(StringBuilder string){
        StringBuilder stringInvertida = new StringBuilder();

        for (int i = string.length()-1; i >= 0; i--) {
            stringInvertida.append(string.charAt(i));
        }

        //string.reverse().toString();

        return stringInvertida.toString();
    }
}