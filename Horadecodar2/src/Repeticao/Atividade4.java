package Repeticao;

import java.util.Scanner;

public class Atividade4 {
    //4.  Faça um programa que leia 10 valores informados pelo usuário, calcule, exiba os números informados e escreva a média aritmética desses valores lidos.
    public static void main (String [] args) {
        double count = 1;
        double soma = 0;
        double numb = 0;
        double media = 0;
        Scanner in = new Scanner(System.in);
        System.out.println("Ola, esse programa irá pegar 10 valores e informar a média desses valores");
        while( count <= 10){
            System.out.println("Por favor, informe o valor " + count);
            numb = in.nextDouble();
            soma += numb;
            media = (soma) / 10;
            count ++;
        }
        System.out.println("A soma dos números é" + soma + "\n E a média é" + media);
    }
}
