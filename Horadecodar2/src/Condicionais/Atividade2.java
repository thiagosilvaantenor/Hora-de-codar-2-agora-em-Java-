package Condicionais;

import java.util.Scanner;

public class Atividade2 {
    //2. Faça um programa que leia um valor informado pelo usuário e diga se o valor informado é positivo, negativo ou zero.
    public static void main(String [] args) {
        int n1;

        Scanner in = new Scanner(System.in);
        System.out.println("Ola, por favor, informe um numero: ");
        n1 = in.nextInt();



        if (n1 > 0){
            System.out.println("O numero informado e positivo!");
        }
        else if ( n1 < 0){
            System.out.println("O numero informado e negativo!");
        }else {
            System.out.println("O numero informado e zero!");
        }
    }
}

