package Repeticao;

import java.util.Scanner;

public class Atividade1 {
    //1 - Faça um programa que leia um valor informado pelo usuário e diga se o valor informado é positivo, negativo ou zero.

    public static void main (String [] args) {
        Scanner in = new Scanner(System.in);
        int count = 0;
        int n1;

        while (count < 1){
            System.out.println("Ola, esse programa irá dizer se o numero informado é positivo, negativo ou zero." +
                    "Por favor, informe um numero");
            n1 = in.nextInt();
            if (n1 > 0){
                System.out.println("O VALOR É ... POSITIVO! O valor informado foi: " + n1);
            }
            else if (n1 < 0){
                System.out.println("O VALOR É ... NEGATIVO! O valor informado foi: " + n1);
            }
            else if (n1 == 0){
                System.out.println("O VALOR É ... ZERO! O valor informado foi:" + n1);
            }
            count++;
        }
    }
}
