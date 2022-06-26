package Condicionais;

import java.util.Scanner;

public class Atividade6 {
    //6.  Faça um programa que leia 10 valores informados pelo usuário, calcule, exiba os números informados e escreva a média aritmética desses valores lidos.
    public static void main(String[] args) {

        int n1, n2, n3, n4, n5, n6, n7, n8, n9, n10;
        Scanner in = new Scanner(System.in);

        System.out.println("Ola, esse programa ira: ler 10 valores que você ira informar, calcular, exibir e escrever a média aritmetica desses valores");

        //valor1
        System.out.println("Por favor, informe um numero: ");
        n1 = in.nextInt();

        //valor2
        System.out.println("Informe, mais um numero: ");
        n2 = in.nextInt();

        //valor3
        System.out.println("Informe, mais um numero: ");
        n3 = in.nextInt();

        //valor4
        System.out.println("Informe, mais um numero: ");
        n4 = in.nextInt();

        //valor5
        System.out.println("Informe, mais um numero: ");
        n5 = in.nextInt();

        //valor6
        System.out.println("Informe, mais um numero: ");
        n6 = in.nextInt();

        //valor7
        System.out.println("Informe, mais um numero: ");
        n7 = in.nextInt();

        //valor8
        System.out.println("Informe, mais um numero: ");
        n8 = in.nextInt();

        //valor9
        System.out.println("Informe, mais um numero: ");
        n9 = in.nextInt();

        //valor10
        System.out.println("Informe, mais um numero: ");
        n10 = in.nextInt();

        //soma
        int soma = (n1 + n2 + n3 + n4 + n5 + n6 + n7 + n8 + n9 + n10);

        //media
        int media = (n1 + n2 + n3 + n4 + n5 + n6 + n7 + n8 + n9 + n10) / 10;
        //exibição
        System.out.println("A soma dos números informados é " + soma + ", a media deles é " + media + ", e os numeros informados foram " + n1  + ","+ n2 + ","+ n3 + ","+ n4 + ","+ n5 + "," + n6 + "," + n7+ "," + n8+ "," + n9+ "," + n10);
    }
}

