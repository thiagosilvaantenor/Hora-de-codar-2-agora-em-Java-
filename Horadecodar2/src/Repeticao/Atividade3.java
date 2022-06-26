package Repeticao;

import java.util.Scanner;

public class Atividade3 {
    //3. Faça um programa que leia  3 valores (considere que não serão informados valores iguais) e escrever a soma dos 2 maior1es.
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int soma = 0;
        int n1 = 0;
        int n2 = 0;
        int n3 = 0;

        System.out.println("Ola, esse programa ler 3 numeros e escrevera a soma dos 2 maiores.");

        System.out.println("Informe o primeiro numero: ");
        n1 = in.nextInt();
        System.out.println("Informe o segundo numero: ");
        n2 = in.nextInt();
        System.out.println("Informe o terceiro numero: ");
        n3 = in.nextInt();

        while(n2 == n1 || n3 == n1 || n3 == n2){
            System.out.println("Informe 3 numeros diferentes");
            System.out.println("Informe o 1º numero: ");
            n1 = in.nextInt();
            System.out.println("Informe o 2º numero: ");
            n2 = in.nextInt();
            System.out.println("Informe o 3º numero");
            n3 = in.nextInt();
        }
        if (n1 > n2 && n1 > n3) {
            if (n2 > n3) {
                soma = n1 + n2;
            } else {
                soma = n1 + n3;
            }
        } else if (n2 > n1 && n2 > n3) {
            if (n1 > n3) {
                soma = n2 + n1;
            } else {
                soma = n2 + n3;
            }
        } else {
            if (n1 > n2) {
                soma = n3 + n1;
            } else {
                soma = n3 + n2;
            }
        }

        System.out.println("A soma dos 2 maiores numeros informados é: ... " + soma);
    }
}