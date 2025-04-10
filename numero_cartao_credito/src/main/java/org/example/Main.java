package org.example;

/**
 * Descubra o número do cartão de crédito abaixo sabendo que o mesmo é um multiplo de 123457 e o digito de luhn é válido.
 * O Número do cartão deve ter o seguinte padrão: 543210******1234
 */
public class Main {
    public static void main(String[] args) {
        System.out.println(encontrarNumeroCartao());
    }

    public static String encontrarNumeroCartao(){
        Long num = 5432100001230771L;

        while (num < 5432109999991234L) {
            num += 1234567L;

            String val = num.toString();

            if (val.endsWith("1234")) {
                return val;
            }
        }

        return "não tem";

//        Algoritmo que usei para achar o Long num mais próximo
//        Long num = 1234567L;
//
//        while (num < 5432109999991234L){
//            num += 1234567000000000L;
//
//            if (num > 5432100000001234L){
//                System.out.println(num);
//            }
//        }
    }
}