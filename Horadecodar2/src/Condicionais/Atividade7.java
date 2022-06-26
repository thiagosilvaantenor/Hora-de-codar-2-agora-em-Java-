package Condicionais;

import java.util.Scanner;

public class Atividade7 {
    //7. Faça um programa que receba quatro valores informados pelo usuário, mas informe somente o primeiro, o último e o maior de todos eles (considere que todos os números informados serão diferentes)

    public static void main(String[] args) {

        int n1, n2, n3, n4;
        Scanner in = new Scanner(System.in);


        //valor1
        System.out.println("Ola, por favor, informe um numero: ");
        n1 = in.nextInt();

        //valor2
        System.out.println("Por favor, informe, o segundo numero: ");
        n2 = in.nextInt();

        //valor3
        System.out.println("Por favor, informe, o terceiro numero: ");
        n3 = in.nextInt();

        //valor4
        System.out.println("Por favor, informe, o quarto numero: ");
        n4 = in.nextInt();

        //Primeiro numero é maior
        if (n1 > n2 && n1 > n3) {
            if (n1 > n4) {
                System.out.println("Dos valores informados, o primeiro foi: " + n1 + ", o ultimo foi: " + n4 + ", e o maior deles foi: " + n1);
            }
        }
            //Segundo numero é maior
            if (n2 > n1 && n2 > n3) {
                if (n2 > n4) {
                    System.out.println("Dos valores informados, o primeiro foi, " + n1 + ", o ultimo foi, " + n4 + "e o maior foi " + n2);
                }
            }
            //Terceiro numero é maior
            if (n3 > n2 && n3 > n1) {
                if (n3 > n4) {
                    System.out.println("Dos valores informados, o primeiro foi, " + n1 + ", o ultimo foi, " + n4 + "e o maior foi " + n3);
                }
            }
            //Quarto numero é maior
            if (n4 > n2 && n4 > n3) {
                if (n4 > n1) {
                    System.out.println("Dos valores informados, o primeiro foi, " + n1 + ", o ultimo foi, " + n4 + "e o maior foi " + n4);
                }
            }
        }
    }