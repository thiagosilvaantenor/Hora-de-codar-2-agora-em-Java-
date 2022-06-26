package Condicionais;

import java.util.Scanner;

public class Atividade5 {
    //5. Faça um programa que leia dois valores informados pelo usuário e exiba uma das três mensagens a seguir: ‘Números iguais’, caso os números sejam iguais ‘Primeiro é maior’, caso o primeiro seja maior que o segundo; ‘Segundo maior’, caso o segundo seja maior que o primeiro.
    public static void main(String[] args) {
        double n1,n2;
        System.out.println("Ola, por favor, informe um numero: ");
        Scanner in = new Scanner(System.in);
        n1 = in.nextDouble();
        System.out.println("Informe, mais um numero: ");
        n2 = in.nextDouble();


        if (n1 > n2){
            System.out.println("Dentre os numeros informados, o primeiro é maior");
        }
        else if (n2 > n1){
            System.out.println("Dentre os numeros informados, o segundo é maior");
        }
        else if (n1 == n2){
            System.out.println("Os dois numeros informados são iguais");
        }

    }
}